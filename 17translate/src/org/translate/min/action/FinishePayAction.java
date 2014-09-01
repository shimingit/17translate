package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.PlaceOrderBiz;
import org.translate.min.util.ArticleUtil;

import com.opensymphony.xwork2.ActionSupport;

public class FinishePayAction extends ActionSupport implements RequestAware,
		SessionAware
{
	private static final long serialVersionUID = 1L;
	private String originlanguage;
	private String objectlanguage;
	private String fromfield;
	private String orderId;
	private PlaceOrderBiz pob;
	private int wordcount;
	private float cost;
	private Map<String, Object> session;

	private Map<String, Object> request;

	public String dealPlaceOrder()
	{
		//encodeinfo();
		//获取当前登录用户的用户名密码
		String username = (String) session.get("username");
		
		String directory = "../webapps/17translate/filerepository/" + username;
		
		//计算原文字数
	//	wordcount = ArticleUtil.countwords(originlanguage, articlecontent);
		cost = ArticleUtil.conutcost(wordcount, originlanguage, objectlanguage);
		orderId = ArticleUtil.getOrderIdByUUId();
		
		
		
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

	

	public String getObjectlanguage()
	{
		return objectlanguage;
	}

	public void setObjectlanguage(String objectlanguage)
	{
		this.objectlanguage = objectlanguage;
	}

	public String getFromfield()
	{
		return fromfield;
	}

	public void setFromfield(String fromfield)
	{
		this.fromfield = fromfield;
	}
	public String getOriginlanguage()
	{
		return originlanguage;
	}
	public void setOriginlanguage(String originlanguage)
	{
		this.originlanguage = originlanguage;
	}
	public PlaceOrderBiz getPob()
	{
		return pob;
	}
	public void setPob(PlaceOrderBiz pob)
	{
		this.pob = pob;
	}
	public int getWordcount()
	{
		return wordcount;
	}
	public void setWordcount(int wordcount)
	{
		this.wordcount = wordcount;
	}
	public float getCost()
	{
		return cost;
	}
	public void setCost(float cost)
	{
		this.cost = cost;
	}
	public String getOrderId()
	{
		return orderId;
	}
	public void setOrderId(String orderId)
	{
		this.orderId = orderId;
	}
	
}
