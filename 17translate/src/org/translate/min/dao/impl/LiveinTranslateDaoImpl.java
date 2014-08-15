package org.translate.min.dao.impl;

import java.sql.Connection;
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
import org.translate.min.entity.LiveinTranslator;
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

	public void addLiveinTranslator(LiveinTranslator translator)
	{
		super.getHibernateTemplate().save(translator);
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

}
