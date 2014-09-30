package org.translate.min.dao.impl;



import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.translate.min.dao.PlaceOrderDao;
import org.translate.min.entity.News;

public class PlaceOrderDaoImpl extends HibernateDaoSupport implements PlaceOrderDao
{

	public void addNews(News news)
	{
		super.getHibernateTemplate().save(news);
	}

	public boolean dealPlaceorder(final String username, final String link,
			final String title, final String author, final String description,
			final String articlecontent, final String originlanguage,
			final String objectlanguage, final String fromfield, 
			final int wordcount, final String orderserialid, final float cost,final String latestdate,final String filepath)
	{
		return (Boolean) super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("call dealPlaceOrder(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				poc.setString(1, username);
				poc.setFloat(2, cost);
				poc.setString(3, link);
				poc.setString(4, title);
				poc.setString(5, author);
				poc.setString(6, description);
				poc.setString(7, articlecontent);
				poc.setString(8, originlanguage);
				poc.setString(9, objectlanguage);
				poc.setString(10, fromfield);
				poc.setInt(11, wordcount);
				poc.setString(12, orderserialid);
				poc.setString(13, filepath);
				poc.setString(14, latestdate);
				poc.setBoolean(15, false);
				poc.execute();
				//conn.commit();//提交
				//System.out.println(poc.);
				if(poc.getBoolean("hasfinished"))
					return true;
				else
					return false;
			}
		});
	}

	public boolean dealPlaceorder(final String username, final String uoriginlanguage,
			final String uobjectlanguage, final String ufromfield, final int wordcount,
			final float cost, final String latestdate, final String orderId, final String fullpath,final String outpath)
	{
		return (Boolean) super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("call dealPlaceOrderByFile(?,?,?,?,?,?,?,?,?,?,?)");
				poc.setString(1, username);
				poc.setString(2, uoriginlanguage);
				poc.setString(3, uobjectlanguage);
				poc.setString(4, ufromfield);
				poc.setInt(5, wordcount);
				poc.setFloat(6, cost);
				poc.setString(7, orderId);
				poc.setString(8, fullpath);
				poc.setString(9, outpath);
				poc.setString(10, latestdate);
				poc.setBoolean(11, false);
				
				poc.execute();
				//conn.commit();//提交
				//System.out.println(poc.);
				if(poc.getBoolean("hasfinished"))
					return true;
				else
					return false;
			}
		});
	}

	
}
