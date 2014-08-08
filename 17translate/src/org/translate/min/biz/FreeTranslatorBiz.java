package org.translate.min.biz;

import java.util.List;

import org.translate.min.entity.FreeTranslator;

public interface FreeTranslatorBiz
{
	public List<FreeTranslator> getFreeTranslator(String username);
	public List<FreeTranslator> getFreeTranslator(String username, String password);
	public String getRole(String username, String password);
}
