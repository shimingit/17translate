package org.translate.min.entity;

import java.util.Date;

/**
 * MyDraftId entity. @author MyEclipse Persistence Tools
 */

public class MyDraftId implements java.io.Serializable
{

	// Fields

	private Integer draftId;
	private Integer originNewsId;
	private String translatorUserName;
	private String originLanguage;
	private String objectLanguage;
	private String draftTitle;
	private String draftContent;
	private Date saveDate;

	// Constructors

	/** default constructor */
	public MyDraftId()
	{
	}

	/** minimal constructor */
	public MyDraftId(Integer draftId, Integer originNewsId,
			String translatorUserName, String originLanguage)
	{
		this.draftId = draftId;
		this.originNewsId = originNewsId;
		this.translatorUserName = translatorUserName;
		this.originLanguage = originLanguage;
	}

	/** full constructor */
	public MyDraftId(Integer draftId, Integer originNewsId,
			String translatorUserName, String originLanguage,
			String objectLanguage, String draftTitle, String draftContent,
			Date saveDate)
	{
		this.draftId = draftId;
		this.originNewsId = originNewsId;
		this.translatorUserName = translatorUserName;
		this.originLanguage = originLanguage;
		this.objectLanguage = objectLanguage;
		this.draftTitle = draftTitle;
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

	public String getDraftTitle()
	{
		return this.draftTitle;
	}

	public void setDraftTitle(String draftTitle)
	{
		this.draftTitle = draftTitle;
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

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MyDraftId))
			return false;
		MyDraftId castOther = (MyDraftId) other;

		return ((this.getDraftId() == castOther.getDraftId()) || (this
				.getDraftId() != null && castOther.getDraftId() != null && this
				.getDraftId().equals(castOther.getDraftId())))
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
				&& ((this.getDraftTitle() == castOther.getDraftTitle()) || (this
						.getDraftTitle() != null
						&& castOther.getDraftTitle() != null && this
						.getDraftTitle().equals(castOther.getDraftTitle())))
				&& ((this.getDraftContent() == castOther.getDraftContent()) || (this
						.getDraftContent() != null
						&& castOther.getDraftContent() != null && this
						.getDraftContent().equals(castOther.getDraftContent())))
				&& ((this.getSaveDate() == castOther.getSaveDate()) || (this
						.getSaveDate() != null
						&& castOther.getSaveDate() != null && this
						.getSaveDate().equals(castOther.getSaveDate())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result
				+ (getDraftId() == null ? 0 : this.getDraftId().hashCode());
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
				+ (getDraftTitle() == null ? 0 : this.getDraftTitle()
						.hashCode());
		result = 37
				* result
				+ (getDraftContent() == null ? 0 : this.getDraftContent()
						.hashCode());
		result = 37 * result
				+ (getSaveDate() == null ? 0 : this.getSaveDate().hashCode());
		return result;
	}

}