package org.translate.min.dao;


import org.translate.min.entity.News;
import org.translate.min.entity.Order;

public interface PlaceOrderDao
{
	public boolean dealPlaceorder(String username,String link,
			String title,String author,String description,String articlecontent,
			String originlanguage,String objectlanguage,String fromfield,
			int wordcount,String orderserialid,float cost,String latestdate,String filepath);
	public void addNews(News news);
	public boolean dealPlaceorder(String username, String uoriginlanguage,
			String uobjectlanguage, String ufromfield, int wordcount,
			float cost, String latestdate, String orderId, String fullpath,String outpath);
	
}
