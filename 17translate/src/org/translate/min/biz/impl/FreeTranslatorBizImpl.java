package org.translate.min.biz.impl;

import java.util.List;

import org.translate.min.biz.FreeTranslatorBiz;
import org.translate.min.dao.FreeTranslatorDao;
import org.translate.min.entity.FreeTranslator;

public class FreeTranslatorBizImpl implements FreeTranslatorBiz
{

	private FreeTranslatorDao ftld;
	
	public FreeTranslatorBizImpl()
	{
		System.out.println("FreeTranslatorBizImpl");
	}
	
	public List<FreeTranslator> getFreeTranslator(String username)
	{
		System.out.println("FreeTranslatorBizImpl");
		return ftld.getTranslator(username);
	}

	public List<FreeTranslator> getFreeTranslator(String username,
			String password)
	{
		return ftld.getTranslator(username, password);
	}

	
	
	
	public FreeTranslatorDao getFtld()
	{
		return ftld;
	}

	public void setFtld(FreeTranslatorDao ftld)
	{
		this.ftld = ftld;
	}
	

}
