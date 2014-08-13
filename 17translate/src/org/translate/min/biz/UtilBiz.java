package org.translate.min.biz;

import java.util.List;

import org.translate.min.entity.Field;
import org.translate.min.entity.Language;

public interface UtilBiz
{
	public List<Language> getLanguage(String languagename);
	public List<Field> getField(String fieldname);
	public void addGtfields(String[] gtfields,String username);
	public void addGtlanguages(String[] gtlanguages,String username);
	public boolean checkManager(String username,String password);
}
