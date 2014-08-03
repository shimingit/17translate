package org.translate.min.dao;

import java.util.List;

import org.translate.min.entity.*;

public interface UtilDao
{
	public List<Language> getLanguage(String languagename);
	public List<Field> getField(String fieldname);
}
 