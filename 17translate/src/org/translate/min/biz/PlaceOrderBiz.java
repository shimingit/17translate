package org.translate.min.biz;


import org.translate.min.entity.News;
import org.translate.min.entity.Order;

public interface PlaceOrderBiz
{
	public void dealPlaceorder(String username, String passworde, String link,
			String title, String author, String description,
			String articlecontent, String originlanguage,
			String objectlanguage, String fromfield, int wordcount);
	public void addNews(News news);
}
