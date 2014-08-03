package org.translate.min.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.FreeTranslatorBiz;
import org.translate.min.entity.FreeTranslator;

import com.opensymphony.xwork2.ActionSupport;
 
public class LoginAction extends ActionSupport implements RequestAware,SessionAware
{

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private String identifyCode;
	private String jsonResult;
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
			System.out.println(ftlb);
			List<FreeTranslator> translator =  ftlb.getFreeTranslator(username);
			System.out.println(translator.size());
			if(translator.size() == 0)
			{
				jsonResult = "username";
			}
			else 
			{
				translator = ftlb.getFreeTranslator(username, password);
				if(translator.size() == 0)
				{
					jsonResult = "password";
				}
				else
				{
					jsonResult = "success";
					session.put("username", username);
					session.put("password", password);
				}
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
	
	
}
