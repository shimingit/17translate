package org.translate.min.biz;

import java.io.InputStream;
import java.util.List;

import org.translate.min.entity.*;

public interface MyInfoBiz
{
	public List getMyInfo(String username,String role);
	public boolean updatePicture(String username, String imgpath);
	public String getMyPicture(String username);
	public List<Notice> getMyNotice(String username);
	public List<FinishedOrder> getFinishedOrder(String clientname);
	public List<FinishedOrder> getNoFinishedOrder(String clientname);
	public List<MyDraft> getMyDraft(String username);
	public List<MyTranslate> getMyTranslate(String username);
	public List<String> getMyLabel(String username);
	public List<String> getMyBelongsField(String username);
	
}
