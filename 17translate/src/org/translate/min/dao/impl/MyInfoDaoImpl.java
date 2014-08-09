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
import org.translate.min.dao.MyInfoDao;
import org.translate.min.entity.Client;
import org.translate.min.entity.FreeTranslator;
import org.translate.min.entity.LiveinTranslator;

public class MyInfoDaoImpl extends HibernateDaoSupport implements MyInfoDao
{
	//通过用户名和实体类名查找用户信息
	public List getMyInfo(final String username, final String classname, final String namestr)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Criteria c = null;
				try
				{
					c = session.createCriteria(Class.forName(classname));
					c.add(Restrictions.eq(namestr, username));
				} catch (ClassNotFoundException e)
				{
					e.printStackTrace();
				}
				return c.list();
			}
		});
	}
	
}
