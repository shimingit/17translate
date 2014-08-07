package org.translate.min.entity;

import java.util.Date;

/**
 * DraftNews entity. @author MyEclipse Persistence Tools
 */

public class DraftNews implements java.io.Serializable
{

	// Fields

	private Integer draftId;
	private String translatorUsername;
	private Integer originNewsId;
	private String draftTitle;
	private String draftDescription;
	private String draftContent;
	private Date saveDate;

	// Constructors

	/** default constructor */
	public DraftNews()
	{
	}

	/** minimal constructor */
	public DraftNews(String translatorUsername, Integer originNewsId)
	{
		this.translatorUsername = translatorUsername;
		this.originNewsId = originNewsId;
	}

	/** full constructor */
	public DraftNews(String translatorUsername, Integer originNewsId,
			String draftTitle, String draftDescription, String draftContent,
			Date saveDate)
	{
		this.translatorUsername = translatorUsername;
		this.originNewsId = originNewsId;
		this.draftTitle = draftTitle;
		this.draftDescription = draftDescription;
		this.draftContent = draftContent;
		this.saveDate = saveDate;
	}

	// Property accessors

	public Integer getDraftId()
	{
		return this.draftId;
	}

	public void setDraftId(Integer draftId)
	{
		this.draftId = draftId;
	}

	public String getTranslatorUsername()
	{
		return this.translatorUsername;
	}

	public void setTranslatorUsername(String translatorUsername)
	{
		this.translatorUsername = translatorUsername;
	}

	public Integer getOriginNewsId()
	{
		return this.originNewsId;
	}

	public void setOriginNewsId(Integer originNewsId)
	{
		this.originNewsId = originNewsId;
	}

	public String getDraftTitle()
	{
		return this.draftTitle;
	}

	public void setDraftTitle(String draftTitle)
	{
		this.draftTitle = draftTitle;
	}

	public String getDraftDescription()
	{
		return this.draftDescription;
	}

	public void setDraftDescription(String draftDescription)
	{
		this.draftDescription = draftDescription;
	}

	public String getDraftContent()
	{
		return this.draftContent;
	}

	public void setDraftContent(String draftContent)
	{
		this.draftContent = draftContent;
	}

	public Date getSaveDate()
	{
		return this.saveDate;
	}

	public void setSaveDate(Date saveDate)
	{
		this.saveDate = saveDate;
	}

}