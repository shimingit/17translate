package org.translate.min.dao;

import java.util.List;

import org.translate.min.entity.*;

public interface UtilDao
{
	public List<Language> getLanguage(String languagename);
	public List<Field> getField(String fieldname);
	public void addGtfield(String username,String fieldname);
	public void addGtlanguage(String username, String languagename);
	public void addFieldAllocate(FieldAllocate fieldAllocate);
	public boolean checkManager(String username, String password);
	public List<String> getFieldAllocateResult();
	public List<String> getAreaTranslators(int fieldid);
	public List<LiveinTranslator> getLiveinTranslator(String username);
}
 