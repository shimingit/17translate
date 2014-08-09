package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.MyInfoBiz;

import com.opensymphony.xwork2.ActionSupport;

public class MyInfoAction extends ActionSupport implements RequestAware,SessionAware
{
	private Map<String, Object> session;
	private Map<String, Object> request;
	private String currentuser;
	private String role;
	
	private MyInfoBiz myinfobiz;

	private static final long serialVersionUID = 1L;

	public String dealMyInfo()
	{
		//获取用户名和用户身份
		String username = (String)session.get("username");
		role = (String)session.get("role");
		System.out.println("当前登录用户："+currentuser);
		System.out.println("当前用户身份："+role);
		if(currentuser.equals(username))
		{
			//获取对应客户信息并保存在session中
			Object myinfo = myinfobiz.getMyInfo(username, role).get(0);
			session.put("myinfo", myinfo);
			System.out.println(myinfobiz.getMyInfo(username, role).size());
		}
		else
		{
			role = "error";
		}
		System.out.println("role:"+role);
		return SUCCESS;
	}
	
	public void setSession(Map<String, Object> session)
	{
		this.session = session;
	}
	public void setRequest(Map<String, Object> request)
	{
		this.request =request;
	}
	public String getRole()
	{
		return role;
	}
	public void setRole(String role)
	{
		this.role = role;
	}

	public void setMyinfobiz(MyInfoBiz myinfobiz)
	{
		this.myinfobiz = myinfobiz;
	}

	public String getCurrentuser()
	{
		return currentuser;
	}

	public void setCurrentuser(String currentuser)
	{
		this.currentuser = currentuser;
	}
	
}
