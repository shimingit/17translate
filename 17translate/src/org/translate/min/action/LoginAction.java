package org.translate.min.action;

import java.util.Map;


import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
 
public class LoginAction extends ActionSupport implements RequestAware,SessionAware
{

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private String identifyCode;
	private String jsonResult;

	private Map<String, Object> session;

	private Map<String, Object> request;
	
	
	public String identifyLogin()
	{
		//获取后台产生的验证码
		String generateCode = (String)session.get("identifyCode");
		
		
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
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getIdentifyCode()
	{
		return identifyCode;
	}
	public void setIdentifyCode(String identifyCode)
	{
		this.identifyCode = identifyCode;
	}
	public void setSession(Map<String, Object> session)
	{
		this.session = session;
		
	}
	public void setRequest(Map<String, Object> request)
	{
		this.request = request;
		
	}
	public String getJsonResult()
	{
		return jsonResult;
	}
	public void setJsonResult(String jsonResult)
	{
		this.jsonResult = jsonResult;
	}
	
	
}
