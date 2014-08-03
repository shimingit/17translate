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
import org.translate.min.dao.UtilDao;
import org.translate.min.entity.Field;
import org.translate.min.entity.Language;

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
}
