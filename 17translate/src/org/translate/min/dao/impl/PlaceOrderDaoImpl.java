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

	public boolean dealPlaceorder(final String username, final String passworde, final String link,
			final String title, final String author, final String description,
			final String articlecontent, final String originlanguage,
			final String objectlanguage, final String fromfield, 
			final int wordcount, final String orderserialid)
	{
		return (Boolean) super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("call dealPlaceOrder(?,?,?,?,?,?,?,?,?,?,?,?,?)");
				poc.setString(1, username);
				poc.setString(2, passworde);
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
				poc.setBoolean(13, false);
				poc.execute();
				//conn.commit();//Ã·Ωª
				//System.out.println(poc.);
				if(poc.getBoolean("hasfinished"))
					return true;
				else
					return false;
			}
		});
	}

	
}
