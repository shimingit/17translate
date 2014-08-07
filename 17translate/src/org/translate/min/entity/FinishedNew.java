package org.translate.min.entity;

import java.util.Date;

/**
 * FinishedNew entity. @author MyEclipse Persistence Tools
 */

public class FinishedNew implements java.io.Serializable
{

	// Fields

	private Integer finishedNewsId;
	private News news;
	private String translatorUsername;
	private String finishedTitle;
	private String finishedDescription;
	private String finishedContent;
	private Date finishedDate;

	// Constructors

	/** default constructor */
	public FinishedNew()
	{
	}

	/** minimal constructor */
	public FinishedNew(News news, String translatorUsername)
	{
		this.news = news;
		this.translatorUsername = translatorUsername;
	}

	/** full constructor */
	public FinishedNew(News news, String translatorUsername,
			String finishedTitle, String finishedDescription,
			String finishedContent, Date finishedDate)
	{
		this.news = news;
		this.translatorUsername = translatorUsername;
		this.finishedTitle = finishedTitle;
		this.finishedDescription = finishedDescription;
		this.finishedContent = finishedContent;
		this.finishedDate = finishedDate;
	}

	// Property accessors

	public Integer getFinishedNewsId()
	{
		return this.finishedNewsId;
	}

	public void setFinishedNewsId(Integer finishedNewsId)
	{
		this.finishedNewsId = finishedNewsId;
	}

	public News getNews()
	{
		return this.news;
	}

	public void setNews(News news)
	{
		this.news = news;
	}

	public String getTranslatorUsername()
	{
		return this.translatorUsername;
	}

	public void setTranslatorUsername(String translatorUsername)
	{
		this.translatorUsername = translatorUsername;
	}

	public String getFinishedTitle()
	{
		return this.finishedTitle;
	}

	public void setFinishedTitle(String finishedTitle)
	{
		this.finishedTitle = finishedTitle;
	}

	public String getFinishedDescription()
	{
		return this.finishedDescription;
	}

	public void setFinishedDescription(String finishedDescription)
	{
		this.finishedDescription = finishedDescription;
	}

	public String getFinishedContent()
	{
		return this.finishedContent;
	}

	public void setFinishedContent(String finishedContent)
	{
		this.finishedContent = finishedContent;
	}

	public Date getFinishedDate()
	{
		return this.finishedDate;
	}

	public void setFinishedDate(Date finishedDate)
	{
		this.finishedDate = finishedDate;
	}

}