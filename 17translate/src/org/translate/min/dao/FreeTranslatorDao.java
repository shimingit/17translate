package org.translate.min.dao;

import java.util.List;

import org.translate.min.entity.FreeTranslator;

public interface FreeTranslatorDao
{
	public List<FreeTranslator> getTranslator(String username);
	public List<FreeTranslator> getTranslator(String username, String password);
	public String getRole(String username,String password);
}
