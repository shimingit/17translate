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
import org.translate.min.dao.RecomendNewsDao;
import org.translate.min.entity.DraftNews;
import org.translate.min.entity.News;
import org.translate.min.entity.OnlineBidArticle;
import org.translate.min.entity.OnlineBidArticleId;
import org.translate.min.entity.PublicNews;
import org.translate.min.entity.PublicNewsId;

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
				Criteria c = session.createCriteria(News.class);
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
		 return (Boolean) super.getHibernateTemplate().execute(new 
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
				if(poc.getBoolean("hasfinished"))
					return true;
				else
					return false;
				
			}
		});
	
	}

	public List getOnlineBidNews()
	{
		return super.getHibernateTemplate().executeFind(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				
				Connection conn = session.connection();
				PreparedStatement p = conn.prepareStatement("SELECT * from onlinebidarticle");
				ResultSet rs = p.executeQuery();
				List<OnlineBidArticle> obalist = new ArrayList<OnlineBidArticle>();
				while(rs.next())
				{
					OnlineBidArticleId obaid = new OnlineBidArticleId(rs.getInt("ordersid"), 
							rs.getString("articletitle"), rs.getString("articleauthor"), 
							rs.getString("originlanguage"), rs.getString("objectlanguage"), 
							rs.getString("translatearea"), rs.getInt("articlewordscount"), 
							rs.getDate("latestsubmitdate"), rs.getFloat("recomendcost"),
							rs.getString("translationstatus"), rs.getString("articlelink"), 
							rs.getString("articledescriprion"));
					OnlineBidArticle oba = new OnlineBidArticle(obaid);
					obalist.add(oba);
				}
				return obalist;
			}
		});
	}
	public OnlineBidArticleId getOnlineBidNews(final int ordersid)
	{
		return (OnlineBidArticleId)super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
				{
			public Object doInHibernate(Session session) throws HibernateException,
			SQLException
			{
				
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("SELECT * from onlinebidarticle where ordersid = " + ordersid);
				poc.execute();
				OnlineBidArticleId obaid = new OnlineBidArticleId(poc.getInt("ordersid"), 
						poc.getString("articletitle"), poc.getString("articleauthor"), 
						poc.getString("originlanguage"), poc.getString("objectlanguage"), 
						poc.getString("translatearea"), poc.getInt("articlewordscount"), 
						poc.getDate("latestsubmitdate"), poc.getFloat("recomendcost"),
						poc.getString("translationstatus"), poc.getString("articlelink"), 
						poc.getString("articledescriprion"));
				return obaid;
			}
				});
	}

	public String getThisOriginArticle(final int ordersid)
	{
		return (String)super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("select newContent from news where news.newId = orders.newId and orders.orderId = " + ordersid);
				poc.execute();
				
				return poc.getString("newContent");
			}
			
		});
	}

	
	
}
