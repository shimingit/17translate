package org.translate.min.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.UtilBiz;

import com.opensymphony.xwork2.ActionSupport;

public class MainAction extends ActionSupport implements SessionAware
{
	private UtilBiz utilbiz;

	private Map<String, Object> session;
	
	private static final long serialVersionUID = 1L;
	@Override
	public String execute() throws Exception
	{
		
		List<String> fieldallocateresult =  utilbiz.getFieldAllocateResult();
		session.put("fieldallocateresult", fieldallocateresult);
		
		
		
		return SUCCESS;
	}
	public void setUtilbiz(UtilBiz utilbiz)
	{
		this.utilbiz = utilbiz;
	}
	public void setSession(Map<String, Object> session)
	{
		this.session = session;
		
	}
	
}
