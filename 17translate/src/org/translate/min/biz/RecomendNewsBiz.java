package org.translate.min.biz;


import java.util.List;

import org.translate.min.entity.DraftNews;
import org.translate.min.entity.News;
import org.translate.min.entity.PublicNews;

public interface RecomendNewsBiz
{
	public List<PublicNews> getPublicNews();
	public List<News> getNewsById(int newsid);
	public void addDraftNews(DraftNews news);
}
