package org.translate.min.biz.impl;

import java.util.List;

import org.translate.min.biz.*;
import org.translate.min.dao.LiveinTranslatorDao;
import org.translate.min.entity.*;
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


	
	

}
