package org.translate.min.biz;

import java.util.List;

import org.translate.min.entity.*;
import org.translate.min.pojo.IdentifyRequestInfo;
import org.translate.min.pojo.LiveinInfo;

public interface LiveinTranslatorBiz
{
	public List<LiveinTranslator> getFreeTranslator(String username);
	public List<LiveinTranslator> getFreeTranslator(String username, String password);
	public void addLiveinTranslator(LiveinTranslator translator);
	public List<LiveinInfo> getTranslators(String page, String rows, String key, String value);
	public int getLiveinTotal();
	public int getRequestTotal();
	public List<String> getFreeTranslators();
	public String register(String name,String password,String account,String phone);
	public boolean addImgPath(String username, String imgpath, String imgtype);
	public boolean updateNP(String username, String realname, String phonenumber);
	public List<IdentifyRequestInfo> getIdentifyRequest(String start, String end, String key, String value);
	public List<ImgRepository> getRequestImgPath(String username);
	public String passIdentifyRequest(String username);
}
