package org.translate.min.biz.impl;

import java.util.List;

import org.translate.min.biz.RecomendNewsBiz;
import org.translate.min.dao.RecomendNewsDao;
import org.translate.min.entity.DraftNews;
import org.translate.min.entity.News;
import org.translate.min.entity.PublicNews;

public class RecomendNewsBizImpl implements RecomendNewsBiz
{

	private RecomendNewsDao red;

	public boolean addFinishedNews(int originnewsid, String translatorusername,
			String finishedtitle, String finisheddescription,
			String finishedcontent)
	{
		// TODO Auto-generated method stub
		return red.addFinishedNews(originnewsid, translatorusername, finishedtitle, finisheddescription, finishedcontent);
	}
	
	public void addDraftNews(DraftNews news)
	{
		red.addDraftNews(news);
		
	}

	public List<News> getNewsById(int newsid)
	{
		// TODO Auto-generated method stub
		return red.getNewsById(newsid);
	}
	public List<PublicNews> getPublicNews()
	{
		return red.getPublicNews();
	}

	public RecomendNewsDao getRed()
	{
		return red;
	}

	public void setRed(RecomendNewsDao red)
	{
		this.red = red;
	}

	
	
	
	
}
