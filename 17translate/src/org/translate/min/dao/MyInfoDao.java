package org.translate.min.dao;

import java.util.List;

import org.translate.min.entity.*;

public interface MyInfoDao
{
	public List getMyInfo(String username,String classname,String namestr);
}
