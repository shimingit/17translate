package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.util.CodingUtil;

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
	

	public String dealPlaceOrder()
	{
		//encodeinfo();
		
		
		
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
	public void setSession(Map<String, Object> arg0)
	{
		// TODO Auto-generated method stub

	}

	public void setRequest(Map<String, Object> arg0)
	{
		// TODO Auto-generated method stub

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
	
}
