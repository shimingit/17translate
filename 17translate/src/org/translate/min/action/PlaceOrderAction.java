package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.PlaceOrderBiz;
import org.translate.min.entity.News;
import org.translate.min.util.CodingUtil;
import org.translate.min.util.ArticleUtil;

import com.opensymphony.xwork2.ActionSupport;

public class PlaceOrderAction extends ActionSupport implements RequestAware,
		SessionAware
{
	private static final long serialVersionUID = 1L;
	private String link;
	private String title;
	private String author;
	private String description;
	private String articlecontent;
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
		wordcount = ArticleUtil.countwords(originlanguage, articlecontent);
		cost = ArticleUtil.conutcost(wordcount, originlanguage, objectlanguage);
		orderId = ArticleUtil.getOrderIdByUUId();
		
		//更新数据库
		String outpath = directory + "/out" + orderId+".pdf";
		boolean hasfinished = pob.dealPlaceorder(username, link, title, author, description, articlecontent, originlanguage,
				objectlanguage, fromfield, wordcount,orderId,cost,outpath);
		
		
		return SUCCESS;
	}
	
	
	
	private void encodeinfo()
	{
		link = CodingUtil.encode(link);
		title = CodingUtil.encode(title);
		author = CodingUtil.encode(author);
		description = CodingUtil.encode(description);
		articlecontent = CodingUtil.encode(articlecontent);
		originlanguage = CodingUtil.encode(originlanguage);
		objectlanguage = CodingUtil.encode(objectlanguage);
		fromfield = CodingUtil.encode(fromfield);
	}
	
	
	public void setSession(Map<String, Object> session)
	{
		this.session = session;
	}

	public void setRequest(Map<String, Object> request)
	{
		this.request = request;
	}

	public String getLink()
	{
		return link;
	}

	public void setLink(String link)
	{
		this.link = link;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getArticlecontent()
	{
		return articlecontent;
	}

	public void setArticlecontent(String articlecontent)
	{
		this.articlecontent = articlecontent;
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
