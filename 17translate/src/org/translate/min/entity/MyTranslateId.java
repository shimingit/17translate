package org.translate.min.entity;

import java.util.Date;

/**
 * MyTranslateId entity. @author MyEclipse Persistence Tools
 */

public class MyTranslateId implements java.io.Serializable
{

	// Fields

	private Integer finishedNewsId;
	private Integer originNewsId;
	private String translatorUserName;
	private String originLanguage;
	private String objectLanguage;
	private String finishedTitle;
	private String finishedContent;
	private Date finishedDate;

	// Constructors

	/** default constructor */
	public MyTranslateId()
	{
	}

	/** minimal constructor */
	public MyTranslateId(Integer finishedNewsId, Integer originNewsId,
			String translatorUserName, String originLanguage)
	{
		this.finishedNewsId = finishedNewsId;
		this.originNewsId = originNewsId;
		this.translatorUserName = translatorUserName;
		this.originLanguage = originLanguage;
	}

	/** full constructor */
	public MyTranslateId(Integer finishedNewsId, Integer originNewsId,
			String translatorUserName, String originLanguage,
			String objectLanguage, String finishedTitle,
			String finishedContent, Date finishedDate)
	{
		this.finishedNewsId = finishedNewsId;
		this.originNewsId = originNewsId;
		this.translatorUserName = translatorUserName;
		this.originLanguage = originLanguage;
		this.objectLanguage = objectLanguage;
		this.finishedTitle = finishedTitle;
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

	public Integer getOriginNewsId()
	{
		return this.originNewsId;
	}

	public void setOriginNewsId(Integer originNewsId)
	{
		this.originNewsId = originNewsId;
	}

	public String getTranslatorUserName()
	{
		return this.translatorUserName;
	}

	public void setTranslatorUserName(String translatorUserName)
	{
		this.translatorUserName = translatorUserName;
	}

	public String getOriginLanguage()
	{
		return this.originLanguage;
	}

	public void setOriginLanguage(String originLanguage)
	{
		this.originLanguage = originLanguage;
	}

	public String getObjectLanguage()
	{
		return this.objectLanguage;
	}

	public void setObjectLanguage(String objectLanguage)
	{
		this.objectLanguage = objectLanguage;
	}

	public String getFinishedTitle()
	{
		return this.finishedTitle;
	}

	public void setFinishedTitle(String finishedTitle)
	{
		this.finishedTitle = finishedTitle;
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

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MyTranslateId))
			return false;
		MyTranslateId castOther = (MyTranslateId) other;

		return ((this.getFinishedNewsId() == castOther.getFinishedNewsId()) || (this
				.getFinishedNewsId() != null
				&& castOther.getFinishedNewsId() != null && this
				.getFinishedNewsId().equals(castOther.getFinishedNewsId())))
				&& ((this.getOriginNewsId() == castOther.getOriginNewsId()) || (this
						.getOriginNewsId() != null
						&& castOther.getOriginNewsId() != null && this
						.getOriginNewsId().equals(castOther.getOriginNewsId())))
				&& ((this.getTranslatorUserName() == castOther
						.getTranslatorUserName()) || (this
						.getTranslatorUserName() != null
						&& castOther.getTranslatorUserName() != null && this
						.getTranslatorUserName().equals(
								castOther.getTranslatorUserName())))
				&& ((this.getOriginLanguage() == castOther.getOriginLanguage()) || (this
						.getOriginLanguage() != null
						&& castOther.getOriginLanguage() != null && this
						.getOriginLanguage().equals(
								castOther.getOriginLanguage())))
				&& ((this.getObjectLanguage() == castOther.getObjectLanguage()) || (this
						.getObjectLanguage() != null
						&& castOther.getObjectLanguage() != null && this
						.getObjectLanguage().equals(
								castOther.getObjectLanguage())))
				&& ((this.getFinishedTitle() == castOther.getFinishedTitle()) || (this
						.getFinishedTitle() != null
						&& castOther.getFinishedTitle() != null && this
						.getFinishedTitle()
						.equals(castOther.getFinishedTitle())))
				&& ((this.getFinishedContent() == castOther
						.getFinishedContent()) || (this.getFinishedContent() != null
						&& castOther.getFinishedContent() != null && this
						.getFinishedContent().equals(
								castOther.getFinishedContent())))
				&& ((this.getFinishedDate() == castOther.getFinishedDate()) || (this
						.getFinishedDate() != null
						&& castOther.getFinishedDate() != null && this
						.getFinishedDate().equals(castOther.getFinishedDate())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37
				* result
				+ (getFinishedNewsId() == null ? 0 : this.getFinishedNewsId()
						.hashCode());
		result = 37
				* result
				+ (getOriginNewsId() == null ? 0 : this.getOriginNewsId()
						.hashCode());
		result = 37
				* result
				+ (getTranslatorUserName() == null ? 0 : this
						.getTranslatorUserName().hashCode());
		result = 37
				* result
				+ (getOriginLanguage() == null ? 0 : this.getOriginLanguage()
						.hashCode());
		result = 37
				* result
				+ (getObjectLanguage() == null ? 0 : this.getObjectLanguage()
						.hashCode());
		result = 37
				* result
				+ (getFinishedTitle() == null ? 0 : this.getFinishedTitle()
						.hashCode());
		result = 37
				* result
				+ (getFinishedContent() == null ? 0 : this.getFinishedContent()
						.hashCode());
		result = 37
				* result
				+ (getFinishedDate() == null ? 0 : this.getFinishedDate()
						.hashCode());
		return result;
	}

}