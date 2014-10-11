package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.LiveinTranslatorBiz;
import com.opensymphony.xwork2.ActionSupport;

public class IdentifyOkAction extends ActionSupport implements RequestAware,SessionAware
{

	private static final long serialVersionUID = 1L;
	private LiveinTranslatorBiz ltlb;
	
	private String currentuser;
	
	private String result;
	
	private Map<String, Object> session;

	private Map<String, Object> request;

	public String  passIdentifyRequest()
	{
		result = "false";
		if(null != currentuser)
			result = ltlb.passIdentifyRequest(currentuser);
		
		currentuser = null;
		return SUCCESS;
	}
	
	
	
	

	public void setCurrentuser(String currentuser)
	{
		this.currentuser = currentuser;
	}
	public void setSession(Map<String, Object> session)
	{
		// TODO Auto-generated method stub
		this.session = session;
	}
	public void setRequest(Map<String, Object> request)
	{
		// TODO Auto-generated method stub
		this.request =request;
	}
	public void setLtlb(LiveinTranslatorBiz ltlb)
	{
		this.ltlb = ltlb;
	}
	public String getResult()
	{
		return result;
	}
	public void setResult(String result)
	{
		this.result = result;
	}
	
}
 