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
import org.translate.min.entity.News;
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

	
	
}
