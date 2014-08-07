package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class DraftNewsAction extends ActionSupport implements RequestAware,
		SessionAware
{

	private static final long serialVersionUID = 1L;
	
	private String username;
	private int originnewsid;
	private String drafttitle;
	private String draftdescription;
	private String articlecontent;
	
	private Map<String, Object> session;
	
	private Map<String, Object> request;
	
	
	
	
	public String savaDraftNews()
	{
		
		username = (String) session.get("username");
		
		
		
		
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

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public int getOriginnewsid()
	{
		return originnewsid;
	}

	public void setOriginnewsid(int originnewsid)
	{
		this.originnewsid = originnewsid;
	}

	public String getDrafttitle()
	{
		return drafttitle;
	}

	public void setDrafttitle(String drafttitle)
	{
		this.drafttitle = drafttitle;
	}

	public String getDraftdescription()
	{
		return draftdescription;
	}

	public void setDraftdescription(String draftdescription)
	{
		this.draftdescription = draftdescription;
	}

	public String getArticlecontent()
	{
		return articlecontent;
	}

	public void setArticlecontent(String articlecontent)
	{
		this.articlecontent = articlecontent;
	}
	
}
