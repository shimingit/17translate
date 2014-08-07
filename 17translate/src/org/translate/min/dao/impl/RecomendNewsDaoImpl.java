package org.translate.min.dao.impl;



import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.translate.min.dao.RecomendNewsDao;
import org.translate.min.entity.DraftNews;
import org.translate.min.entity.PublicNews;

public class RecomendNewsDaoImpl extends HibernateDaoSupport implements RecomendNewsDao
{

	public List getPublicNews()
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Criteria c = session.createCriteria(PublicNews.class);
				return c.list();
			}
		});
	}

	public List getNewsById(final int newsid)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Criteria c = session.createCriteria(PublicNews.class);
				c.add(Restrictions.eq("newId", newsid));
				return c.list();
			}
		});
	}

	public void addDraftNews(DraftNews news)
	{
		super.getHibernateTemplate().save(news);
		
	}

	public boolean addFinishedNews(final int originnewsid, final String translatorusername,
			final String finishedtitle, final String finisheddescription,
			final String finishedcontent)
	{
		super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("call dealFinishedNews(?,?,?,?,?,?)");
				poc.setInt(1, originnewsid);
				poc.setString(2, translatorusername);
				poc.setString(3, finishedtitle);
				poc.setString(4, finisheddescription);
				poc.setString(5, finishedcontent);
				poc.setBoolean(6, false);
				poc.execute();
				//conn.commit();//Ã·Ωª
				//System.out.println(poc.);
				if(poc.getBoolean("hasfinished"))
					return true;
				else
					return false;
			}
		});
		return false;
	}

	
	
}
