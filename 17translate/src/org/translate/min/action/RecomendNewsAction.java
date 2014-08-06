package org.translate.min.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.RecomendNewsBiz;
import org.translate.min.entity.PublicNews;
import org.translate.min.entity.PublicNewsId;

import com.opensymphony.xwork2.ActionSupport;

public class RecomendNewsAction extends ActionSupport implements RequestAware,
		SessionAware
{
	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;

	private Map<String, Object> request;
	private RecomendNewsBiz redb;
	
	public String dealRecomendNewsAction()
	{
		List<PublicNews> newsList= redb.getPublicNews();;
		
		List<PublicNewsId> publicnews = new ArrayList<PublicNewsId>();
		for(PublicNews news : newsList)
			publicnews.add(news.getId());

		session.put("publicnews", publicnews);
		return SUCCESS;
	}
	
	
	
	
	public void setSession(Map<String, Object> session)
	{
		this.session = session;
	}

	public void setRequest(Map<String, Object> request)
	{
		this.request = request;
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
