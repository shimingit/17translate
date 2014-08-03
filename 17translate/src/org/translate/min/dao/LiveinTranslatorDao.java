package org.translate.min.dao;

import java.util.List;

import org.translate.min.entity.*;

public interface LiveinTranslatorDao
{
	public List<LiveinTranslator> getTranslator(String username);
	public List<LiveinTranslator> getTranslator(String username, String password);
	public void addLiveinTranslator(LiveinTranslator translator);
}
