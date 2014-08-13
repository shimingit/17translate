package org.translate.min.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import org.translate.min.entity.FinishedOrder;
import org.translate.min.entity.FreeTranslator;
import org.translate.min.entity.LiveinTranslator;
import org.translate.min.entity.MyDraft;
import org.translate.min.entity.MyLabel;
import org.translate.min.entity.MyTranslate;
import org.translate.min.entity.NoFinishedOrder;
import org.translate.min.entity.Notice;

public class MyInfoDaoImpl extends HibernateDaoSupport implements MyInfoDao
{
	public List getMyNotice(final String username)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Criteria c = null;
				c = session.createCriteria(Notice.class);
				c.add(Restrictions.eq("noticeObject", username));
				return c.list();
			}
		});
	}
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
	//更新用户照片
	public boolean updatePicture(final String username, final InputStream in)
	{
		 return (Boolean) super.getHibernateTemplate().execute(new 
					HibernateCallback<Object>()
			{

				public Object doInHibernate(Session session) throws HibernateException,
						SQLException
				{
					Connection conn = session.connection();
					PreparedStatement p = conn.prepareStatement("update client set photo = ? where userName = ?");
				//	PreparedStatement p = conn.prepareStatement("update client set photo = ? where userName = ?");
					//CallableStatement poc = conn.prepareCall("update client set photo = ? where userName = ?");
					long len = 0L;
					try
					{
						 len=  (long)in.available();
						System.out.println(len);
					} catch (IOException e)
					{
						e.printStackTrace();
					}
					p.setBinaryStream(1, in,len);
					p.setString(2, username);
					//poc.setBinaryStream(1, in, len);
					//poc.setString(2, username);
					//poc.setBoolean(3, false);
					//poc.executeUpdate();
					//poc.execute();
					//conn.commit();//提交
					p.executeUpdate();
				//	if(poc.getBoolean("hasfinished"))
						return true;
				//	else
				//		return false;
				}
			});
		
	}
	public List getFinishedOrder(final String clientName)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Criteria c = null;
					c = session.createCriteria(FinishedOrder.class);
					c.add(Restrictions.eq("clientName", clientName));
				
				return c.list();
			}
		});
	}
	public List getNoFinishedOrder(final String clientName)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
				{
			public Object doInHibernate(Session session) throws HibernateException,
			SQLException
			{
				Criteria c = null;
				c = session.createCriteria(NoFinishedOrder.class);
				c.add(Restrictions.eq("clientName", clientName));
				
				return c.list();
			}
				});
	}
	public List getMyDraft(final String username)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
				{
			public Object doInHibernate(Session session) throws HibernateException,
			SQLException
			{
				Criteria c = null;
				c = session.createCriteria(NoFinishedOrder.class);
				c.add(Restrictions.eq("translatorUserName", username));
				
				return c.list();
			}
				});
	}
	public List getMyTranslate(final String username)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
				{
			public Object doInHibernate(Session session) throws HibernateException,
			SQLException
			{
				Criteria c = null;
				c = session.createCriteria(MyTranslate.class);
				c.add(Restrictions.eq("translatorUserName", username));
				
				return c.list();
			}
				});
	}
	public List getMyLabel(final String username)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
				{
			public Object doInHibernate(Session session) throws HibernateException,
			SQLException
			{
				Criteria c = null;
				c = session.createCriteria(MyLabel.class);
				c.add(Restrictions.eq("userName", username));
				return c.list();
			}
				});
	}
	
	
}
