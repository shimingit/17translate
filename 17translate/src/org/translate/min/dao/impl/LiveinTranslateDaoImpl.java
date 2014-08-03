package org.translate.min.dao.impl;

import java.sql.SQLException;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.translate.min.dao.FreeTranslatorDao;
import org.translate.min.dao.LiveinTranslatorDao;
import org.translate.min.entity.FreeTranslator;
import org.translate.min.entity.LiveinTranslator;

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

}
