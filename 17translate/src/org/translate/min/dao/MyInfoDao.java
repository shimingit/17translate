package org.translate.min.dao;

import java.util.List;

import org.translate.min.entity.*;

public interface MyInfoDao
{
	public List getMyInfo(String username,String classname,String namestr);
	public boolean updatePicture(String username,String imgpath);
	public String getMyPicture(String username);
	public List<Notice> getMyNotice(String username);
	public List<FinishedOrder> getFinishedOrder(String clientName);
	public List<FinishedOrder> getNoFinishedOrder(String clientName);
	public List<MyDraft> getMyDraft(String username);
	public List<MyTranslate> getMyTranslate(String username);
	public List<String> getMyLabel(String username);
	public List<String> getMyBelongsField(String username);
}
