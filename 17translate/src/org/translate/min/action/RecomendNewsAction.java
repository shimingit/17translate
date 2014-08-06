package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class RecomendNewsAction extends ActionSupport implements RequestAware,
		SessionAware
{
	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;

	private Map<String, Object> request;
	
	
	public String dealRecomendNewsAction()
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

}
