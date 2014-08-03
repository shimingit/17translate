package org.translate.min.biz.impl;

import java.util.List;

import org.translate.min.biz.*;
import org.translate.min.dao.LiveinTranslatorDao;
import org.translate.min.entity.*;

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


	
	

}
