package org.translate.min.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.LiveinTranslatorBiz;
import org.translate.min.biz.UtilBiz;
import org.translate.min.entity.LiveinTranslator;
import org.translate.min.util.CodingUtil;

import com.opensymphony.xwork2.ActionSupport;

public class JoinusClubAction extends ActionSupport implements RequestAware,SessionAware
{

	private static final long serialVersionUID = 1L;
	private String realname;
	private String translatespan;
	private String[] gtlanguages;
	private String[] gtfields;
	private String selfdescription;
	private String certification;
	private int myfield;
	private UtilBiz ubz;
	private LiveinTranslatorBiz ltlb;
	private Map<String, Object> session;

	private Map<String, Object> request;

	public String dealJoinus()
	{
		//对用户上传信息进行重新编码
		//encodeInfo();
		
		//System.out.println(realname+">"+translatespan+">gtlanguages:"+gtlanguages.length+">gtfields:"+gtfields.length+">"+selfdescription+">"+certification+">"+myfield);
				
		//获取当前登录用户的账号密码
		String username = (String) session.get("username");
		
		LiveinTranslator ltl = new LiveinTranslator(username,realname,
				Float.parseFloat(translatespan),
				certification,selfdescription,"初级译者");
		
		ltlb.addLiveinTranslator(ltl);
		ubz.addGtfields(gtfields,username);
		ubz.addGtlanguages(gtlanguages,username);
		ubz.addFieldAllocate(username, new int[]{myfield});
		
		return SUCCESS;
	}
	
	
	
	
	private void encodeInfo()
	{
		realname = CodingUtil.encode(realname);
		gtlanguages = CodingUtil.encode(gtlanguages);
		gtfields = CodingUtil.encode(gtfields);
		selfdescription = CodingUtil.encode(selfdescription);
		certification = CodingUtil.encode(certification);
	}
	
	//setter and getter
	public String getRealname()
	{
		return realname;
	}
	public void setRealname(String realname)
	{
		this.realname = realname;
	}
	
	public String getTranslatespan()
	{
		return translatespan;
	}
	public void setTranslatespan(String translatespan)
	{
		this.translatespan = translatespan;
	}
	public String[] getGtlanguages()
	{
		return gtlanguages;
	}
	public void setGtlanguages(String[] gtlanguages)
	{
		this.gtlanguages = gtlanguages;
	}
	public String[] getGtfields()
	{
		return gtfields;
	}
	public void setGtfields(String[] gtfields)
	{
		this.gtfields = gtfields;
	}
	public String getSelfdescription()
	{
		return selfdescription;
	}
	public void setSelfdescription(String selfdescription)
	{
		this.selfdescription = selfdescription;
	}
	public String getCertification()
	{
		return certification;
	}
	public void setCertification(String certification)
	{
		this.certification = certification;
	}
	public UtilBiz getUbz()
	{
		return ubz;
	}
	public void setUbz(UtilBiz ubz)
	{
		this.ubz = ubz;
	}
	public void setSession(Map<String, Object> session)
	{
		this.session = session;
		
	}
	public void setRequest(Map<String, Object> request)
	{
		this.request = request;
		
	}
	public LiveinTranslatorBiz getLtlb()
	{
		return ltlb;
	}
	public void setLtlb(LiveinTranslatorBiz ltlb)
	{
		this.ltlb = ltlb;
	}
	public int getMyfield()
	{
		return myfield;
	}
	public void setMyfield(int myfield)
	{
		this.myfield = myfield;
	}
	
}
 