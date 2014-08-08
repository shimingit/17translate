package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.FreeTranslatorBiz;

import com.opensymphony.xwork2.ActionSupport;
 
public class LoginAction extends ActionSupport implements RequestAware,SessionAware
{

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private String identifyCode;
	private String jsonResult;
	private String role;
	private FreeTranslatorBiz ftlb;

	private Map<String, Object> session;

	private Map<String, Object> request;
	
	
	public String identifyLogin()
	{
		//获取后台产生的验证码
		String genetrateCode = (String)session.get("identifyCode");
		
		if(!genetrateCode.equals(identifyCode))
		{
			jsonResult = "identifyCode";
		}
		else
		{
			String  result =  ftlb.getRole(username,password);
			System.out.println("role:" + result);
			if("username".equals(result))
			{
				jsonResult = "username";
			}
			else if("password".equals(result))
			{
				jsonResult = "password";
			}
			else
			{
				jsonResult = "success";
				role = result;
				session.put("username", username);
				session.put("password", password);
				session.put("role", role);
			}
			
		}
		
		System.out.println("jsonResult:" +jsonResult);
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
	
	public void setFtlb(FreeTranslatorBiz ftlb)
	{
		this.ftlb = ftlb;
	}
	public String getRole()
	{
		return role;
	}
	public void setRole(String role)
	{
		this.role = role;
	}
	
	
}
