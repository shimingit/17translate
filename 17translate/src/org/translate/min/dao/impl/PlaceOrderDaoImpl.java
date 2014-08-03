package org.translate.min.dao.impl;



import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.translate.min.dao.PlaceOrderDao;
import org.translate.min.entity.Order;

public class PlaceOrderDaoImpl extends HibernateDaoSupport implements PlaceOrderDao
{

	public void addPlaceorder(Order oeder)
	{
		super.getHibernateTemplate().save(oeder);
	}

	
}
