package org.translate.min.dao.impl;

import java.sql.CallableStatement;
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
import org.translate.min.dao.UtilDao;
import org.translate.min.entity.Field;
import org.translate.min.entity.FieldAllocate;
import org.translate.min.entity.Language;
import org.translate.min.entity.LiveinTranslator;
import org.translate.min.entity.MyDraft;

public class UtilDaoImpl extends HibernateDaoSupport implements UtilDao
{
	//通过语种名查询获取语言对象
	public List getLanguage(final String languagename)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Criteria c = session.createCriteria(Language.class);
				c.add(Restrictions.eq("languageName", languagename));
				return c.list();
			}
		});
	}
	
	//同过领域名查询获取领域对象
	public List getField(final String fieldname)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Criteria c = session.createCriteria(Field.class);
				c.add(Restrictions.eq("fieldName", fieldname));
				return c.list();
			}
		});
	}

	public void addGtfield(final String username, final String fieldname)
	{
		super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("call addgtField(?,?)");
				poc.setString(1, username);
				poc.setString(2, fieldname);
				poc.execute();
				//conn.commit();//提交
				return null;
			}
		});
		
	}

	public void addGtlanguage(final String username, final String languagename)
	{
		super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("call addgtLanguage(?,?)");
				poc.setString(1, username);
				poc.setString(2, languagename);
				poc.execute();
				//conn.commit();//提交
				return null;
			}
		});
		
	}

	public boolean checkManager(final String username, final String password)
	{
		 return (Boolean) super.getHibernateTemplate().execute(new 
					HibernateCallback<Object>()
			{

				public Object doInHibernate(Session session) throws HibernateException,
						SQLException
				{
					Connection conn = session.connection();
					CallableStatement poc = conn.prepareCall("call checkmanager(?,?,?)");
					poc.setString(1, username);
					poc.setString(2, password);
					poc.setBoolean(3, false);
					poc.execute();
					//conn.commit();//提交
					if(poc.getBoolean("result"))
						return true;
					else
						return false;
					
				}
			});
	}

	public void addFieldAllocate(FieldAllocate fieldAllocate)
	{
		super.getHibernateTemplate().save(fieldAllocate);
	}

	public List getFieldAllocateResult()
	{
		return (List) super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				PreparedStatement p = null;
				p = conn.prepareStatement("select * from fieldallocateresult");
				ResultSet rs = p.executeQuery();
				List<String> li = new ArrayList<String>();
				while(rs.next())
				{
					String fieldname = rs.getString("fieldName");
					int fieldid = rs.getInt("filedId");
					int totalnum = rs.getInt("totalnum");
					String connstr = fieldid + "&" + fieldname + "&" + totalnum;
					
					li.add(connstr);
				}
				
				return li;
			}
		});
	}

	public List getAreaTranslators(final int fieldid)
	{
		return (List) super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session)
					throws HibernateException, SQLException
			{
				String sql = "SELECT livein_translators.luserName,"+
						  "(SELECT COUNT(*) FROM translationarrange WHERE translationarrange.translatorId = livein_translators.ltranslatorId AND translationarrange.translateStatus='finished') AS finishedNewsNum,"+
						  "(SELECT COUNT(*) FROM clientcomments WHERE orderId IN(SELECT orderId FROM translationarrange WHERE translationarrange.translatorId = livein_translators.ltranslatorId AND translationarrange.translateStatus = 'finished')) AS  commentNum,"+
						  "livein_translators.lfans,livein_translators.status FROM livein_translators WHERE livein_translators.luserName IN(SELECT DISTINCT(fieldallocate.userName) FROM fieldallocate WHERE fieldallocate.filedId = ?)";
				Connection conn = session.connection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, fieldid);
				ResultSet rs = ps.executeQuery();
				List<String> li = new ArrayList<String>();
				while(rs.next())
				{
					String username = rs.getString("luserName");
					int finishednewsnum = rs.getInt("finishedNewsNum");
					int commentnum = rs.getInt("commentNum");
					int fans = rs.getInt("lfans");
					String status = rs.getString("status");
					String connstr = username + "&" + finishednewsnum + "&" + commentnum + "&" + fans + "&" + status;
					li.add(connstr);
				}
				return li;
			}
		});
	}

	public List getLiveinTranslator(final String username)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException
			{
				Criteria criteria = session.createCriteria(LiveinTranslator.class);
				criteria.add(Restrictions.eq("luserName", username));
				return criteria.list();
			}
		});
	}
}
