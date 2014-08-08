package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ExitAction extends ActionSupport implements RequestAware,SessionAware
{
	private Map<String, Object> session;
	private Map<String, Object> request;

	private static final long serialVersionUID = 1L;
	@Override
	public String execute() throws Exception
	{
		String username = (String)session.get("username");
		String password = (String)session.get("password");
		String role = (String)session.get("role");
		if((username != null) && (password != null) && (role != null))
		{
			System.out.println("用户 " + username +" 退出,该用户身份是 " + convertRole(role));
			session.put("username", null);
			session.put("password", null);
			session.put("role", null);
		}
		
		return SUCCESS;
	}
	
	
	private String convertRole(String role)
	{
		String result = "";
		if("free".equals(role))
			result = "自由翻译员";
		else if("livein".equals(role))
			result = "入驻翻译员";
		else if("client".equals(role))
			result = "客户";
		return result;
	}
	public void setSession(Map<String, Object> session)
	{
		this.session = session;
	}
	public void setRequest(Map<String, Object> request)
	{
		this.request =request;
	}
	
}
