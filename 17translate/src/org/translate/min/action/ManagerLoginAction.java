package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.UtilBiz;

import com.opensymphony.xwork2.ActionSupport;
 
public class ManagerLoginAction extends ActionSupport implements RequestAware,SessionAware
{

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private String result;
	
	private UtilBiz ubz;
	
	private Map<String, Object> session;

	private Map<String, Object> request;
	
	
	public String checkManager()
	{
		boolean flag = ubz.checkManager(username, password);
		if(flag)
		{
			result = "success";
			session.put("manager", username);
		}
		else
			result = "error";
		System.out.println(result);
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
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getResult()
	{
		return result;
	}
	public void setResult(String result)
	{
		this.result = result;
	}
	public void setUbz(UtilBiz ubz)
	{
		this.ubz = ubz;
	}
	
}
