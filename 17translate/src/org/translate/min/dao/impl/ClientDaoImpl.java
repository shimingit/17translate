package org.translate.min.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.translate.min.dao.ClientDao;

public class ClientDaoImpl extends HibernateDaoSupport implements ClientDao
{

	public String register(final String name, final String password, final String phone,
			final String account)
	{
		return (String) super.getHibernateTemplate().execute(new 
				HibernateCallback<Object>()
		{

			public Object doInHibernate(Session session) throws HibernateException,
					SQLException
			{
				Connection conn = session.connection();
				CallableStatement poc = conn.prepareCall("call clientregister(?,?,?,?,?)");
				poc.setString(1, name);
				poc.setString(2, password);
				poc.setString(3, account);
				poc.setString(4, phone);
				poc.setString(5, "@result");
				poc.execute();
				//conn.commit();//Ã·Ωª
				
				return poc.getString("result");
				
			}
		});
	}

}
