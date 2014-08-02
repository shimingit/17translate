package org.translate.min.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.FreeTranslatorBiz;
import org.translate.min.entity.FreeTranslator;

import com.opensymphony.xwork2.ActionSupport;
 
public class IsLoginAction extends ActionSupport implements RequestAware,SessionAware
{

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String isLogin;
	private Map<String, Object> session;

	private Map<String, Object> request;
	
	public String isLogin()
	{
		
		String user = (String) session.get("user");
		
		if(null != user)
		{
			username = user;
			isLogin = "true";
		}
		return SUCCESS;
	}
	
	
	
	
	//setter and getter
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public void setSession(Map<String, Object> session)
	{
		this.session = session;
		
	}
	public void setRequest(Map<String, Object> request)
	{
		this.request = request;
		
	}
	public String getIsLogin()
	{
		return isLogin;
	}
	public void setIsLogin(String isLogin)
	{
		this.isLogin = isLogin;
	}
	

}
