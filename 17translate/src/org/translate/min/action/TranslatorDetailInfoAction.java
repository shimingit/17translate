package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.UtilBiz;
import org.translate.min.entity.LiveinTranslator;

import com.opensymphony.xwork2.ActionSupport;

public class TranslatorDetailInfoAction extends ActionSupport implements SessionAware
{
	private UtilBiz utilbiz;
	private String username;

	private Map<String, Object> session;
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception
	{
		System.out.println("username:" + username);
		LiveinTranslator translatordetailinfo = utilbiz.getLiveinTranslator(username).get(0); 
		
		session.put("translatordetailinfo", translatordetailinfo);
		return SUCCESS;
	}
	
	
	
	
	public void setUtilbiz(UtilBiz utilbiz)
	{
		this.utilbiz = utilbiz;
	}
	public void setSession(Map<String, Object> session)
	{
		this.session = session;
		
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	
}
