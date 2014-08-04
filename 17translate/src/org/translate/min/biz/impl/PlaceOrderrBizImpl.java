package org.translate.min.biz.impl;

import org.translate.min.biz.PlaceOrderBiz;
import org.translate.min.dao.PlaceOrderDao;
import org.translate.min.entity.News;
import org.translate.min.entity.Order;

public class PlaceOrderrBizImpl implements PlaceOrderBiz
{

	private PlaceOrderDao pod;
	
	public void dealPlaceorder(String username, String passworde, String link,
			String title, String author, String description,
			String articlecontent, String originlanguage,
			String objectlanguage, String fromfield, int wordcount)
	{
		// TODO Auto-generated method stub
		
	}
	public void addNews(News news)
	{
		pod.addNews(news);
	}

	public PlaceOrderDao getPod()
	{
		return pod;
	}

	public void setPod(PlaceOrderDao pod)
	{
		this.pod = pod;
	}

	


	
	
	
}
