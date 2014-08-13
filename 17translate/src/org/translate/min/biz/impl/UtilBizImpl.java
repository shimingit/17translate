package org.translate.min.biz.impl;

import java.util.List;

import org.translate.min.biz.UtilBiz;
import org.translate.min.dao.UtilDao;
import org.translate.min.entity.Field;
import org.translate.min.entity.Language;

public class UtilBizImpl implements UtilBiz
{
	private UtilDao utildao;
	public List<Language> getLanguage(String languagename)
	{
		// TODO Auto-generated method stub
		return utildao.getLanguage(languagename);
	}

	public List<Field> getField(String fieldname)
	{
		// TODO Auto-generated method stub
		return utildao.getField(fieldname);
	}
	
	public void addGtfields(String[] gtfields,String username)
	{
		// TODO Auto-generated method stub
		for(String field : gtfields)
			utildao.addGtfield(username, field);
	}

	public void addGtlanguages(String[] gtlanguages,String username)
	{
		// TODO Auto-generated method stub
		for(String language : gtlanguages)
			utildao.addGtlanguage(username, language);
	}
	
	
	public UtilDao getUtildao()
	{
		return utildao;
	}

	public void setUtildao(UtilDao utildao)
	{
		this.utildao = utildao;
	}

	public boolean checkManager(String username, String password)
	{
		// TODO Auto-generated method stub
		return utildao.checkManager(username, password);
	}



	
}
