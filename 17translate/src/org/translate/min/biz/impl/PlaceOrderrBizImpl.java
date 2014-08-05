package org.translate.min.biz.impl;

import org.translate.min.biz.PlaceOrderBiz;
import org.translate.min.dao.PlaceOrderDao;
import org.translate.min.entity.News;

public class PlaceOrderrBizImpl implements PlaceOrderBiz
{

	private PlaceOrderDao pod;
	
	public boolean dealPlaceorder(String username, String passworde, String link,
			String title, String author, String description,
			String articlecontent, String originlanguage,
			String objectlanguage, String fromfield, int wordcount, String orderserialid)
	{
		return pod.dealPlaceorder(username, passworde, link, title, author, description, 
				articlecontent, originlanguage, objectlanguage, fromfield, wordcount,orderserialid);
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
