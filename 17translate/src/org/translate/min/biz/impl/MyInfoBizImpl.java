package org.translate.min.biz.impl;

import java.io.InputStream;
import java.util.List;

import org.translate.min.biz.*;
import org.translate.min.dao.LiveinTranslatorDao;
import org.translate.min.dao.MyInfoDao;
import org.translate.min.entity.*;

public class MyInfoBizImpl implements MyInfoBiz
{

	private MyInfoDao myinfodao;

	public boolean updatePicture(String username, String imgpath)
	{
		return myinfodao.updatePicture(username, imgpath);
	}
	public List getMyInfo(String username, String role)
	{
		String classname = "",namestr="";
		
		if("client".equals(role))
		{
			classname = "Client";
			namestr = "userName";
		}
		else if("free".equals(role))
		{
			classname = "FreeTranslator";
			namestr = "fuserName";
		}
		else if("livein".equals(role))
		{
			classname = "LiveinTranslator";
			namestr = "luserName";
		}
		
		classname = "org.translate.min.entity." + classname;
		
		return myinfodao.getMyInfo(username, classname,namestr);
	}
	
	
	public MyInfoDao getMyinfodao()
	{
		return myinfodao;
	}

	public void setMyinfodao(MyInfoDao myinfodao)
	{
		this.myinfodao = myinfodao;
	}
	public List<Notice> getMyNotice(String username)
	{
		// TODO Auto-generated method stub
		return myinfodao.getMyNotice(username);
	}
	public List<FinishedOrder> getFinishedOrder(String clientname)
	{
		// TODO Auto-generated method stub
		return myinfodao.getFinishedOrder(clientname);
	}
	public List<FinishedOrder> getNoFinishedOrder(String clientname)
	{
		// TODO Auto-generated method stub
		return myinfodao.getNoFinishedOrder(clientname);
	}
	public List<MyDraft> getMyDraft(String username)
	{
		// TODO Auto-generated method stub
		return myinfodao.getMyDraft(username);
	}
	public List<MyTranslate> getMyTranslate(String username)
	{
		// TODO Auto-generated method stub
		return myinfodao.getMyTranslate(username);
	}
	public List<MyLabel> getMyLabel(String username)
	{
		// TODO Auto-generated method stub
		return myinfodao.getMyLabel(username);
	}
	public String getMyPicture(String username)
	{
		// TODO Auto-generated method stub
		return myinfodao.getMyPicture(username);
	}

	

}
