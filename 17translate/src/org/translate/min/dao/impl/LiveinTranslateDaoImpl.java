package org.translate.min.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.translate.min.dao.LiveinTranslatorDao;
import org.translate.min.entity.ImgRepository;
import org.translate.min.entity.LiveinTranslator;
import org.translate.min.pojo.IdentifyRequestInfo;
import org.translate.min.pojo.LiveinInfo;

public class LiveinTranslateDaoImpl extends HibernateDaoSupport implements LiveinTranslatorDao
{

	//通过用户名查找用户
	public List getTranslator(final String username)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Criteria c = session.createCriteria(LiveinTranslator.class);
				c.add(Restrictions.eq("luserName", username));
				return c.list();
			}
		});
	}
	
	//通过用户名和密码查找用户
	public List getTranslator(final String username, final String password)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Criteria c = session.createCriteria(LiveinTranslator.class);
				c.add(Restrictions.eq("luserName", username));
				c.add(Restrictions.eq("lpassword", password));
				return c.list();
			}
		});
	}

	public String addLiveinTranslator(final LiveinTranslator translator)
	{
		return (String) super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("call translatorlivein(?,?,?,?,?,?,?)");
				poc.setString(1,translator.getLuserName());
				poc.setString(2,translator.getLrealName());
				poc.setFloat(3,translator.getTransExperience());
				poc.setString(4, translator.getQualifyDescription());
				poc.setString(5, translator.getLselfDescription());	
				poc.setString(6, translator.getTranslationLevel());
				poc.setString(7, "@result");
				poc.execute();
				//conn.commit();//提交
				
				return poc.getString("result");
				
			}
		});
	}

	public int getLiveinTotal()
	{
		 return (Integer) super.getHibernateTemplate().execute(new 
					HibernateCallback<Object>()
			{

				public Object doInHibernate(Session session) throws HibernateException,
						SQLException
				{
					Connection conn = session.connection();
					PreparedStatement p = conn.prepareStatement("SELECT COUNT(*) AS total FROM livein_translators");
					ResultSet rs = p.executeQuery();
					if(rs.next())
						return rs.getInt("total");
					else
						return 0;
				}
			});
		
	}

	public List getTranslators(final int start, final int end,final String key,final String value)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				//Criteria c = session.createCriteria(LiveinTranslator.class);
				Connection conn = session.connection();
				PreparedStatement p = null;
				String sql = "SELECT * from livein_translators ORDER BY ltranslatorId ASC limit ?,?";
				if(key != null && value != null && !key.trim().equals("") && !value.trim().equals(""))
				{
					sql = "SELECT * from livein_translators where  " + key + "='" + value + "'";
					p = conn.prepareStatement(sql);
				}
				else
				{
					p = conn.prepareStatement(sql);
					p.setInt(1, start);
					p.setInt(2, end);
				}
				System.out.println(sql);
				ResultSet rs = p.executeQuery();
				List<LiveinInfo> li = new ArrayList<LiveinInfo>();
				while(rs.next())
				{
					int id = rs.getInt("ltranslatorId");
					LiveinInfo linfo = new LiveinInfo();
					linfo.setFans(rs.getString("lfans"));
					linfo.setId(id);
					linfo.setLiveindate(rs.getDate("liveinDate") + "");
					linfo.setMailbox(rs.getString("lmailBox"));
					linfo.setRealname(rs.getString("lrealName"));
					linfo.setUsername(rs.getString("luserName"));
					linfo.setPhonenumber( rs.getString("lphoneNumber"));
					linfo.setTranslationlevel(rs.getString("translationLevel"));
					linfo.setTranslationcoin(rs.getString("ltranslationCoin"));
					linfo.setDetailinfo("<a href='lieveindetail?liveinid='"+id+"'>详细信息</a>");
					li.add(linfo);
				}
				return  li;
			}
		});
	}

	public List getFreeTranslators()
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				//Criteria c = session.createCriteria(LiveinTranslator.class);
				Connection conn = session.connection();
				PreparedStatement p = conn.prepareStatement("SELECT fuserName from free_translators");
				ResultSet rs = p.executeQuery();
				List<String> li = new ArrayList<String>();
				while(rs.next())
				{
					li.add(rs.getString("fuserName"));
				}
				return  li;
			}
		});
	}

	public String register(final String name, final String password, final String phone,
			final String account)
	{
		return (String) super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("call translatorregister(?,?,?,?,?)");
				poc.setString(1, name);
				poc.setString(2, password);
				poc.setString(3, account);
				poc.setString(4, phone);
				poc.setString(5, "@result");
				poc.execute();
				//conn.commit();//提交
				
				return poc.getString("result");
				
			}
		});
	}

	public boolean addImgPath(final String username, final String imgpath, final String imgtype)
	{
		return (Boolean) super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("call addimgpath(?,?,?,?)");
				poc.setString(1, username);
				poc.setString(2, imgpath);
				poc.setString(3, imgtype);
				poc.setBoolean(4, false);
				poc.execute();
				//conn.commit();//提交
				
				return poc.getBoolean("isaddok");
				
			}
		});
	}

	public boolean updateNP(final String username, final String realname, final String phonenumber)
	{
		return (Boolean) super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("call updateNP(?,?,?,?)");
				poc.setString(1, username);
				poc.setString(2, realname);
				poc.setString(3, phonenumber);
				poc.setBoolean(4, false);
				poc.execute();
				//conn.commit();//提交
				return poc.getBoolean("result");
			}
		});
	}

	public List getIdentifyRequest(final int start, final int end,
			final String key, final String value)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				//Criteria c = session.createCriteria(LiveinTranslator.class);
				Connection conn = session.connection();
				PreparedStatement p = null;
				String sql = "SELECT * from livein_translators where hasregister='upload' ORDER BY ltranslatorId ASC limit ?,?";
				if(key != null && value != null && !key.trim().equals("") && !value.trim().equals(""))
				{
					sql = "SELECT * from livein_translators where  " + key + "='" + value + "' and hasregister='upload'";
					p = conn.prepareStatement(sql);
				}
				else
				{
					p = conn.prepareStatement(sql);
					p.setInt(1, start);
					p.setInt(2, end);
				}
				System.out.println(sql);
				ResultSet rs = p.executeQuery();
				List<IdentifyRequestInfo> li = new ArrayList<IdentifyRequestInfo>();
				while(rs.next())
				{
					int id = rs.getInt("ltranslatorId");
					IdentifyRequestInfo linfo = new IdentifyRequestInfo();

					linfo.setRealname(rs.getString("lrealName"));
					linfo.setUsername(rs.getString("luserName"));
					linfo.setPhonenumber( rs.getString("lphoneNumber"));
					
					li.add(linfo);
				}
				return  li;
			}
		});
	}

	public int getRequestTotal()
	{
		 return (Integer) super.getHibernateTemplate().execute(new 
					HibernateCallback<Object>()
			{

				public Object doInHibernate(Session session) throws HibernateException,
						SQLException
				{
					Connection conn = session.connection();
					PreparedStatement p = conn.prepareStatement("SELECT COUNT(*) AS total FROM livein_translators where hasregister='upload'");
					ResultSet rs = p.executeQuery();
					if(rs.next())
						return rs.getInt("total");
					else
						return 0;
				}
			});
	}

	public List getRequestImgPath(final String username)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Criteria c = session.createCriteria(ImgRepository.class);
				c.add(Restrictions.eq("username", username));
				return c.list();
			}
		});
	}

	public String passIdentifyRequest(final String username)
	{
		return (String) super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("call passidentifyrequest(?,?)");
				poc.setString(1,username);
				poc.setString(2, "@result");
				poc.execute();
				//conn.commit();//提交
				
				return poc.getString("result");
				
			}
		});
	}
}
