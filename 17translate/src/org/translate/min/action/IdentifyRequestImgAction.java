package org.translate.min.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.LiveinTranslatorBiz;
import org.translate.min.entity.ImgRepository;

import com.opensymphony.xwork2.ActionSupport;

public class IdentifyRequestImgAction extends ActionSupport implements RequestAware,SessionAware
{

	private static final long serialVersionUID = 1L;
	private LiveinTranslatorBiz ltlb;
	
	private String currentuser;
	
	private Map<String, String> imgpathmap; 
	
	private Map<String, Object> session;

	private Map<String, Object> request;

	public String  getIdentifyImgPath()
	{
		imgpathmap = new HashMap<String, String>();
		System.out.println(currentuser);
		List<ImgRepository> irlist = ltlb.getRequestImgPath(currentuser);
		
		for(ImgRepository ir : irlist)
		{
			String type = ir.getImgtype();
			String path = ir.getImgpath().substring(ir.getImgpath().lastIndexOf("/") + 1);
			System.out.println(type+">"+ path);
			imgpathmap.put(type, path);
		}
		
		//currentuser = null;
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

	
	public void setImgpathmap(Map<String, String> imgpathmap)
	{
		this.imgpathmap = imgpathmap;
	}

	public String getCurrentuser()
	{
		return currentuser;
	}
	public Map<String, String> getImgpathmap()
	{
		return imgpathmap;
	}
	
}
 