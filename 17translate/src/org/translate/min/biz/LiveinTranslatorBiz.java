package org.translate.min.biz;

import java.util.List;

import org.translate.min.entity.*;

public interface LiveinTranslatorBiz
{
	public List<LiveinTranslator> getFreeTranslator(String username);
	public List<LiveinTranslator> getFreeTranslator(String username, String password);
	public void addLiveinTranslator(LiveinTranslator translator);
}
