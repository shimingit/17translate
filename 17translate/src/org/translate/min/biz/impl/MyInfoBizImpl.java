package org.translate.min.biz.impl;

import java.util.List;

import org.translate.min.biz.*;
import org.translate.min.dao.LiveinTranslatorDao;
import org.translate.min.dao.MyInfoDao;
import org.translate.min.entity.*;

public class MyInfoBizImpl implements MyInfoBiz
{

	private MyInfoDao myinfodao;

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

	

}
