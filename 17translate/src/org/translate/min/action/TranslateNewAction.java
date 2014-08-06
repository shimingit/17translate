package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.RecomendNewsBiz;

import com.opensymphony.xwork2.ActionSupport;

public class TranslateNewAction extends ActionSupport implements RequestAware,SessionAware
{
	private int newid;
	private Map<String, Object> session;
	
	private Map<String, Object> request;
	private RecomendNewsBiz redb;
	
	private static final long serialVersionUID = 1L;
	public String dealTranslateNew() 
	{
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
	public int getNewid()
	{
		return newid;
	}
	public void setNewid(int newid)
	{
		this.newid = newid;
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
