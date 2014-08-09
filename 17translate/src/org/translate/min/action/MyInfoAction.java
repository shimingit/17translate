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
		//��ȡ�û������û����
		String username = (String)session.get("username");
		role = (String)session.get("role");
		System.out.println("��ǰ��¼�û���"+currentuser);
		System.out.println("��ǰ�û���ݣ�"+role);
		if(currentuser.equals(username))
		{
			//��ȡ��Ӧ�ͻ���Ϣ��������session��
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
