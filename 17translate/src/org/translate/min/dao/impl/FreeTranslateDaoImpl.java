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
import org.translate.min.dao.FreeTranslatorDao;
import org.translate.min.entity.FreeTranslator;

public class FreeTranslateDaoImpl extends HibernateDaoSupport implements FreeTranslatorDao
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
				Criteria c = session.createCriteria(FreeTranslator.class);
				c.add(Restrictions.eq("fuserName", username));
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
				Criteria c = session.createCriteria(FreeTranslator.class);
				c.add(Restrictions.eq("fuserName", username));
				c.add(Restrictions.eq("fpassword", password));
				return c.list();
			}
		});
	}

	public String getRole(final String username, final String password)
	{
		return  (String) super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("call checkrole(?,?,?)");
				poc.setString(1, username);
				poc.setString(2, password);
				poc.setString(3, "@role");
				poc.execute();
				//conn.commit();//提交
				//System.out.println(poc.);
				return poc.getString("role");
			}
		});
	}

}
