package org.translate.min.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.RecomendNewsBiz;
import org.translate.min.entity.News;

import com.opensymphony.xwork2.ActionSupport;

public class TranslateNewAction extends ActionSupport implements RequestAware,SessionAware
{
	private int newsid;
	private Map<String, Object> session;
	
	private Map<String, Object> request;
	private RecomendNewsBiz redb;
	
	private static final long serialVersionUID = 1L;
	public String dealTranslateNew() 
	{
		List<News> news = redb.getNewsById(newsid);
		if(news.size() > 0)
		{
			//News n = news.get(0);
			session.put("thisnews", news.get(0));
		//	System.out.println(news.get(0).getLanguage().getLanguageName());
		    return SUCCESS;
		}
		return ERROR;
	}
	public void setSession(Map<String, Object> session)
	{
		this.session = session;
	}
	public void setRequest(Map<String, Object> request)
	{
		this.request = request;
	}
	public int getNewsid()
	{
		return newsid;
	}
	public void setNewsid(int newsid)
	{
		this.newsid = newsid;
	}
	public RecomendNewsBiz getRedb()
	{
		return redb;
	}
	public void setRedb(RecomendNewsBiz redb)
	{
		this.redb = redb;
	}
}
