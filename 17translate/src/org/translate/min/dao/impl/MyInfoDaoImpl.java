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
import org.translate.min.dao.MyInfoDao;
import org.translate.min.entity.DraftNews;
import org.translate.min.entity.FinishedOrder;
import org.translate.min.entity.MyDraft;
import org.translate.min.entity.MyDraftId;
import org.translate.min.entity.MyLabel;
import org.translate.min.entity.MyLabelId;
import org.translate.min.entity.MyTranslate;
import org.translate.min.entity.MyTranslateId;
import org.translate.min.entity.NoFinishedOrder;
import org.translate.min.entity.NoFinishedOrderId;
import org.translate.min.entity.Notice;
import org.translate.min.pojo.LiveinInfo;

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
//				Criteria c = null;
//				c = session.createCriteria(NoFinishedOrder.class);
//				c.add(Restrictions.eq("clientName", clientName));
//				
//				return c.list();
				Connection conn = session.connection();
				PreparedStatement ps = conn.prepareStatement("select * from nofinishedorder where clientName=?");
				ps.setString(1, clientName);
				
				ResultSet rs = ps.executeQuery();
				
				List<NoFinishedOrder> li = new ArrayList<NoFinishedOrder>();
				
				while(rs.next())
				{
					NoFinishedOrderId nfoi = new NoFinishedOrderId(rs.getInt("orderId"), 
							rs.getString("orderSerialId"), rs.getString("clientName"), rs.getString("isPay"), 
							rs.getString("translateStatus"), rs.getString("orderDate"), rs.getString("originLanguage"), 
							rs.getString("objectLanguage"), rs.getFloat("translationCost"), rs.getString("fromfield"), 
							rs.getString("hasfile"), rs.getString("storepath")); 
					NoFinishedOrder nfo = new NoFinishedOrder(nfoi);
				    li.add(nfo);
				}
				
				
				return li;
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
//				Criteria c = null;
//				c = session.createCriteria(DraftNews.class);
//				c.add(Restrictions.eq("translatorUsername", username));
//				
//				return c.list();
				Connection conn = session.connection();
				PreparedStatement p = null;
				p = conn.prepareStatement("select * from mydraft where translatorUserName = ?");
				p.setString(1, username);
				ResultSet rs = p.executeQuery();
				List<MyDraft> li = new ArrayList<MyDraft>();
				
				while(rs.next())
				{	
					MyDraftId mdi = new MyDraftId(
							rs.getInt("draftId"),
							rs.getInt("originNewsId"),
							rs.getString("translatorUserName"),
							rs.getString("originLanguage"),
							rs.getString("objectLanguage"),
							rs.getString("draftTitle"),
							rs.getString("draftContent"),
							rs.getDate("saveDate")
							);
					MyDraft md = new MyDraft(mdi);
					li.add(md);
				}
				
				return li;
			
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
//				Criteria c = null;
//				c = session.createCriteria(MyTranslate.class);
//				c.add(Restrictions.eq("translatorUsername", username));
				Connection conn = session.connection();
				PreparedStatement p = null;
				p = conn.prepareStatement("select * from mytranslate where translatorUserName = ?");
				p.setString(1, username);
				ResultSet rs = p.executeQuery();
				List<MyTranslate> li = new ArrayList<MyTranslate>();
				
				while(rs.next())
				{	
					MyTranslateId mti = new MyTranslateId(
							rs.getInt("finishedNewsId"),
							rs.getInt("originNewsId"),
							rs.getString("translatorUserName"),
							rs.getString("originLanguage"),
							rs.getString("objectLanguage"),
							rs.getString("finishedTitle"),
							rs.getString("finishedContent"),
							rs.getDate("finishedDate")
							);
					MyTranslate mt = new MyTranslate(mti);
					li.add(mt);
				}
				
				return li;
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
				Connection conn = session.connection();
				PreparedStatement p = null;
				p = conn.prepareStatement("select * from mylabel where userName = ?");
				p.setString(1, username);
				ResultSet rs = p.executeQuery();
				List<String> li = new ArrayList<String>();
				while(rs.next())
				{
					li.add(rs.getString("labelName"));
				}
				return  li;
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
				poc.setString(2, "@imagepath");
				poc.execute();
				//conn.commit();//提交
				System.out.println(username + ">>"+poc.getString("imagepath"));
				return poc.getString("imagepath");
				
			}
		});
	}
	public List getMyBelongsField(final String username)
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
				{
			public Object doInHibernate(Session session) throws HibernateException,
			SQLException
			{
				Connection conn = session.connection();
				PreparedStatement p = null;
				p = conn.prepareStatement("select * from mybelongsfield where username = ?");
				p.setString(1, username);
				ResultSet rs = p.executeQuery();
				List<String> li = new ArrayList<String>();
				while(rs.next())
				{
					li.add(rs.getString("fieldname"));
				}
				return  li;
			}
				});
	}
	
	
}
