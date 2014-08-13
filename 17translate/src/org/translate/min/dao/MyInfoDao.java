package org.translate.min.dao;

import java.io.InputStream;
import java.util.List;

import org.translate.min.entity.*;

public interface MyInfoDao
{
	public List getMyInfo(String username,String classname,String namestr);
	public boolean updatePicture(String username,InputStream in);
	public List<Notice> getMyNotice(String username);
	public List<FinishedOrder> getFinishedOrder(String clientName);
	public List<FinishedOrder> getNoFinishedOrder(String clientName);
	public List<MyDraft> getMyDraft(String username);
	public List<MyTranslate> getMyTranslate(String username);
	public List<MyLabel> getMyLabel(String username);
}
