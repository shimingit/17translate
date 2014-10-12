package org.translate.min.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.RecomendNewsBiz;
import org.translate.min.entity.OnlineBidArticle;
import org.translate.min.entity.OnlineBidArticleId;

import com.opensymphony.xwork2.ActionSupport;

public class OnlineBidArticleAction extends ActionSupport implements RequestAware,
		SessionAware
{
	private static final long serialVersionUID = 1L;

	private int orderid;
	private String result;
	
	private Map<String, Object> session;

	private Map<String, Object> request;
	private RecomendNewsBiz redb;
	
	public String dealOnlineBidArticle()
	{
		List<OnlineBidArticle> newsList= redb.getOnllineBidNews();
		System.out.println(newsList.get(2).getId().getArticletitle());
		List<OnlineBidArticleId> onlinebidarticle = new ArrayList<OnlineBidArticleId>();
		for(OnlineBidArticle news : newsList)
		{System.out.println(news.getId().getOrdersid());
			onlinebidarticle.add(news.getId());
		}

		session.put("onlinebidarticle", onlinebidarticle);
		return SUCCESS;
	}
	
	public String dealBidArticleInfo()
	{
		String username = (String)session.get("username");
		
		if(null != username)
		{
			OnlineBidArticleId obaid= redb.getOnllineBidNews(orderid);
			String originarticle = redb.getThisOriginArticle(orderid);
			
			session.put("obaid", obaid);
			session.put("thisbidarticle", originarticle);

			result = "ok";
		}
		else
		{
			result = "nologin";
		}
			
			
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
	public void setRedb(RecomendNewsBiz redb)
	{
		this.redb = redb;
	}
	public int getOrderid()
	{
		return orderid;
	}
	public void setOrderid(int orderid)
	{
		this.orderid = orderid;
	}
	public String getResult()
	{
		return result;
	}
	public void setResult(String result)
	{
		this.result = result;
	}
	
}
