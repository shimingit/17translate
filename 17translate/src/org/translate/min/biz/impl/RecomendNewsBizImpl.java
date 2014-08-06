package org.translate.min.biz.impl;

import java.util.List;

import org.translate.min.biz.RecomendNewsBiz;
import org.translate.min.dao.RecomendNewsDao;
import org.translate.min.entity.PublicNews;

public class RecomendNewsBizImpl implements RecomendNewsBiz
{

	private RecomendNewsDao red;

	public List<PublicNews> getPublicNews()
	{
		return red.getPublicNews();
	}

	public RecomendNewsDao getRed()
	{
		return red;
	}

	public void setRed(RecomendNewsDao red)
	{
		this.red = red;
	}
	
	
}
