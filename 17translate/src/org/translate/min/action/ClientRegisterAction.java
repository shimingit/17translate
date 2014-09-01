package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.ClientBiz;

import com.opensymphony.xwork2.ActionSupport;
 
public class ClientRegisterAction extends ActionSupport implements RequestAware,SessionAware
{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	private String phone;
	private String account;
	private String identify;
	
	private String result;
	
	private Map<String, Object> session;

	private Map<String, Object> request;
	private ClientBiz clientbiz;
	public String clientRegister()
	{
		System.out.println(name+":"+password+":"+phone+":"+account+":"+identify);
		result = clientbiz.register(name, password, phone, account);
		System.out.println("result:" + result);
		return SUCCESS;
	}


	public void setSession(Map<String, Object> session)
	{
		// TODO Auto-generated method stub
		this.session = session;
	}
	public void setRequest(Map<String, Object> request)
	{
		// TODO Auto-generated method stub
		this.request = request;
	}
	public void setClientbiz(ClientBiz clientbiz)
	{
		this.clientbiz = clientbiz;
	}
	public String getResult()
	{
		return result;
	}
	public void setResult(String result)
	{
		this.result = result;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public void setAccount(String account)
	{
		this.account = account;
	}
	public void setIdentify(String identify)
	{
		this.identify = identify;
	}


	public String getName()
	{
		return name;
	}


	public String getPassword()
	{
		return password;
	}


	public String getPhone()
	{
		return phone;
	}


	public String getAccount()
	{
		return account;
	}


	public String getIdentify()
	{
		return identify;
	}
	
}