package org.translate.min.action;

import java.util.HashSet;
import java.util.Set;

import org.translate.min.entity.LiveinTranslator;
import org.translate.min.util.CodingUtil;

import com.opensymphony.xwork2.ActionSupport;

public class JoinusClubAction extends ActionSupport
{

	private static final long serialVersionUID = 1L;
	private String realname;
	private String phonenumber;
	private String emailbox;
	private String translatespan;
	private String[] gtlanguages;
	private String[] gtfields;
	private String selfdescription;
	private String certification;

	public String dealJoinus()
	{
		//对用户上传信息进行重新编码
		encodeInfo();
		
		Set goodAtFields = new HashSet();
		Set goodAtLaguages = new HashSet();
		
		
		
		
		LiveinTranslator ltl = new LiveinTranslator();
		
		
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
	public String getPhonenumber()
	{
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	public String getEmailbox()
	{
		return emailbox;
	}
	public void setEmailbox(String emailbox)
	{
		this.emailbox = emailbox;
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
	
	
}
 