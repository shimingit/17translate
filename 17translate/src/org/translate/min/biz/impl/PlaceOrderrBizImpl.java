package org.translate.min.biz.impl;

import org.translate.min.biz.PlaceOrderBiz;
import org.translate.min.dao.PlaceOrderDao;
import org.translate.min.entity.News;

public class PlaceOrderrBizImpl implements PlaceOrderBiz
{

	private PlaceOrderDao pod;
	
	public boolean dealPlaceorder(String username, String link,
			String title, String author, String description,
			String articlecontent, String originlanguage,
			String objectlanguage, String fromfield, int wordcount, String orderserialid,float cost,String latestdate,String filepath)
	{
		return pod.dealPlaceorder(username,link, title, author, description, 
				articlecontent, originlanguage, objectlanguage, fromfield, wordcount,orderserialid,cost,latestdate,filepath);
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
	public boolean dealPlaceorder(String username, String uoriginlanguage,
			String uobjectlanguage, String ufromfield, int wordcount,
			float cost, String latestdate, String orderId, String fullpath,String outpath)
	{
		// TODO Auto-generated method stub
		return pod.dealPlaceorder(username, uoriginlanguage, uobjectlanguage, 
				ufromfield, wordcount, cost, latestdate, orderId, fullpath,outpath);
	}

	


	
	
	
}
