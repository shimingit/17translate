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
import org.translate.min.dao.MyInfoDao;
import org.translate.min.entity.FinishedOrder;
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
	public boolean updatePicture(final String username, final String imgpath)
	{

		
		 return (Boolean) super.getHibernateTemplate().execute(new 
					HibernateCallback<Object>()
			{

				public Object doInHibernate(Session session) throws HibernateException,
						SQLException
				{
					Connection conn = session.connection();
					CallableStatement poc = conn.prepareCall("call updatepicture(?,?,?)");
					poc.setString(1, username);
					poc.setString(2, imgpath);
					poc.setBoolean(3, false);
					poc.execute();
					//conn.commit();//提交
					if(poc.getBoolean("hasfinished"))
						return true;
					else
						return false;
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
	public String getMyPicture(final String username)
	{
		return (String) super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("call getmypicture(?,?)");
				poc.setString(1, username);
				poc.setString(2, null);
				poc.execute();
				//conn.commit();//提交
				return poc.getString("imagepath");
				
			}
		});
	}
	
	
}
