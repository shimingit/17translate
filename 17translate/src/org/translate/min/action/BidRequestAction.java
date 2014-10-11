package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.LiveinTranslatorBiz;

import com.opensymphony.xwork2.ActionSupport;

public class BidRequestAction extends ActionSupport implements RequestAware, SessionAware
{
	private static final long serialVersionUID = 1L;

	private String bidprice;
	private String latestdate;
	private String leftwords;
	private String formid;
	private String result;
	
	private LiveinTranslatorBiz ltlb;
	private Map<String, Object> session;
	private Map<String, Object> request;
	
	public String bidRequest()
	{
		System.out.println(bidprice+">"+latestdate+">"+leftwords+">"+formid);
		
		result = "true";
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

	public String getBidprice()
	{
		return bidprice;
	}

	public void setBidprice(String bidprice)
	{
		this.bidprice = bidprice;
	}

	public String getLatestdate()
	{
		return latestdate;
	}

	public void setLatestdate(String latestdate)
	{
		this.latestdate = latestdate;
	}

	public String getLeftwords()
	{
		return leftwords;
	}

	public void setLeftwords(String leftwords)
	{
		this.leftwords = leftwords;
	}

	public String getFormid()
	{
		return formid;
	}

	public void setFormid(String formid)
	{
		this.formid = formid;
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
