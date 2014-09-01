package org.translate.min.biz.impl;

import java.util.List;

import org.translate.min.biz.UtilBiz;
import org.translate.min.dao.UtilDao;
import org.translate.min.entity.Field;
import org.translate.min.entity.FieldAllocate;
import org.translate.min.entity.FieldAllocateId;
import org.translate.min.entity.Language;
import org.translate.min.entity.LiveinTranslator;

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

	public void addFieldAllocate(String username, int[] fieldids)
	{
		for(int id : fieldids)
			utildao.addFieldAllocate(new FieldAllocate(new FieldAllocateId(username, id)));
		
	}

	public List<String> getFieldAllocateResult()
	{
		// TODO Auto-generated method stub
		return utildao.getFieldAllocateResult();
	}

	public List<String> getAreaTranslators(int fieldid)
	{
		// TODO Auto-generated method stub
		return utildao.getAreaTranslators(fieldid);
	}

	public List<LiveinTranslator> getLiveinTranslator(String username)
	{
		// TODO Auto-generated method stub
		return utildao.getLiveinTranslator(username);
	}



	
}
