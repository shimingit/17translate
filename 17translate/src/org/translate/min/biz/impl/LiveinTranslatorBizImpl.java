package org.translate.min.biz.impl;

import java.util.List;

import org.translate.min.biz.*;
import org.translate.min.dao.LiveinTranslatorDao;
import org.translate.min.entity.*;
import org.translate.min.pojo.IdentifyRequestInfo;
import org.translate.min.pojo.LiveinInfo;

public class LiveinTranslatorBizImpl implements LiveinTranslatorBiz
{

	private LiveinTranslatorDao ltld;
	

	public List<LiveinTranslator> getFreeTranslator(String username)
	{
		// TODO Auto-generated method stub
		return ltld.getTranslator(username);
	}

	public List<LiveinTranslator> getFreeTranslator(String username,
			String password)
	{
		// TODO Auto-generated method stub
		return ltld.getTranslator(username, password);
	}

	public void addLiveinTranslator(LiveinTranslator translator)
	{
		// TODO Auto-generated method stub
		ltld.addLiveinTranslator(translator);
	}
	
	
	
	
	
	public LiveinTranslatorDao getLtld()
	{
		return ltld;
	}

	public void setLtld(LiveinTranslatorDao ltld)
	{
		this.ltld = ltld;
	}

	public List<LiveinInfo> getTranslators(String page, String rows,String key,String value)
	{
		// TODO Auto-generated method stub
		int start = (Integer.parseInt(rows) - 10)*10 + (Integer.parseInt(page)-1)*10;
		int end = start + 10;
		return ltld.getTranslators(start, end,key,value);
	}

	public int getLiveinTotal()
	{
		// TODO Auto-generated method stub
		return ltld.getLiveinTotal();
	}

	public List<String> getFreeTranslators()
	{
		// TODO Auto-generated method stub
		return ltld.getFreeTranslators();
	}

	public String register(String name, String password, String account,
			String phone)
	{
		// TODO Auto-generated method stub
		return ltld.register(name, password, account, phone);
	}

	public boolean addImgPath(String username, String imgpath, String imgtype)
	{
		// TODO Auto-generated method stub
		return ltld.addImgPath(username, imgpath, imgtype);
	}

	public boolean updateNP(String username, String realname, String phonenumber)
	{
		// TODO Auto-generated method stub
		return ltld.updateNP(username, realname, phonenumber);
	}

	public List<IdentifyRequestInfo> getIdentifyRequest(String page, String rows,
			String key, String value)
	{
		int start = (Integer.parseInt(rows) - 10)*10 + (Integer.parseInt(page)-1)*10;
		int end = start + 10;
		return ltld.getIdentifyRequest(start, end, key, value);
	}

	public int getRequestTotal()
	{
		// TODO Auto-generated method stub
		return ltld.getRequestTotal();
	}

	public List<ImgRepository> getRequestImgPath(String username)
	{
		// TODO Auto-generated method stub
		return ltld.getRequestImgPath(username);
	}

	public String passIdentifyRequest(String username)
	{
		// TODO Auto-generated method stub
		return ltld.passIdentifyRequest(username);
	}
}
