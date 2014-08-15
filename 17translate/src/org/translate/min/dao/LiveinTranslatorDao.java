package org.translate.min.dao;

import java.util.List;

import org.translate.min.entity.*;
import org.translate.min.pojo.LiveinInfo;

public interface LiveinTranslatorDao
{
	public List<LiveinTranslator> getTranslator(String username);
	public List<LiveinTranslator> getTranslator(String username, String password);
	public void addLiveinTranslator(LiveinTranslator translator);
	public int getLiveinTotal();
	public List<LiveinInfo> getTranslators(int start, int end,String key, String value);
	public List<String> getFreeTranslators();
}
