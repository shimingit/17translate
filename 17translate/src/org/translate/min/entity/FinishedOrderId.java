package org.translate.min.entity;

import java.util.Date;

/**
 * FinishedOrderId entity. @author MyEclipse Persistence Tools
 */

public class FinishedOrderId implements java.io.Serializable
{

	// Fields

	private Integer orderId;
	private String clientName;
	private Date orderDate;
	private Date finishedDate;
	private String originLanguage;
	private String objectlanguage;
	private float translationCost;
	private String originNewTitle;
	private String originAuthor;
	private String fromField;
	private String netlink;
	private String originDescription;
	private String originNewContent;
	private String objectNewTitle;
	private String objectDescription;
	private String objectNewContent;

	// Constructors

	/** default constructor */
	public FinishedOrderId()
	{
	}

	/** minimal constructor */
	public FinishedOrderId(Integer orderId, String clientName,
			String originLanguage, String originNewTitle,
			String originNewContent)
	{
		this.orderId = orderId;
		this.clientName = clientName;
		this.originLanguage = originLanguage;
		this.originNewTitle = originNewTitle;
		this.originNewContent = originNewContent;
	}

	/** full constructor */
	public FinishedOrderId(Integer orderId, String clientName, Date orderDate,
			Date finishedDate, String originLanguage, String objectlanguage,
			float translationCost, String originNewTitle, String originAuthor,
			String fromField, String netlink, String originDescription,
			String originNewContent, String objectNewTitle,
			String objectDescription, String objectNewContent)
	{
		this.orderId = orderId;
		this.clientName = clientName;
		this.orderDate = orderDate;
		this.finishedDate = finishedDate;
		this.originLanguage = originLanguage;
		this.objectlanguage = objectlanguage;
		this.translationCost = translationCost;
		this.originNewTitle = originNewTitle;
		this.originAuthor = originAuthor;
		this.fromField = fromField;
		this.netlink = netlink;
		this.originDescription = originDescription;
		this.originNewContent = originNewContent;
		this.objectNewTitle = objectNewTitle;
		this.objectDescription = objectDescription;
		this.objectNewContent = objectNewContent;
	}

	// Property accessors

	public Integer getOrderId()
	{
		return this.orderId;
	}

	public void setOrderId(Integer orderId)
	{
		this.orderId = orderId;
	}

	public String getClientName()
	{
		return this.clientName;
	}

	public void setClientName(String clientName)
	{
		this.clientName = clientName;
	}

	public Date getOrderDate()
	{
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate)
	{
		this.orderDate = orderDate;
	}

	public Date getFinishedDate()
	{
		return this.finishedDate;
	}

	public void setFinishedDate(Date finishedDate)
	{
		this.finishedDate = finishedDate;
	}

	public String getOriginLanguage()
	{
		return this.originLanguage;
	}

	public void setOriginLanguage(String originLanguage)
	{
		this.originLanguage = originLanguage;
	}

	public String getObjectlanguage()
	{
		return this.objectlanguage;
	}

	public void setObjectlanguage(String objectlanguage)
	{
		this.objectlanguage = objectlanguage;
	}

	public float getTranslationCost()
	{
		return this.translationCost;
	}

	public void setTranslationCost(float translationCost)
	{
		this.translationCost = translationCost;
	}

	public String getOriginNewTitle()
	{
		return this.originNewTitle;
	}

	public void setOriginNewTitle(String originNewTitle)
	{
		this.originNewTitle = originNewTitle;
	}

	public String getOriginAuthor()
	{
		return this.originAuthor;
	}

	public void setOriginAuthor(String originAuthor)
	{
		this.originAuthor = originAuthor;
	}

	public String getFromField()
	{
		return this.fromField;
	}

	public void setFromField(String fromField)
	{
		this.fromField = fromField;
	}

	public String getNetlink()
	{
		return this.netlink;
	}

	public void setNetlink(String netlink)
	{
		this.netlink = netlink;
	}

	public String getOriginDescription()
	{
		return this.originDescription;
	}

	public void setOriginDescription(String originDescription)
	{
		this.originDescription = originDescription;
	}

	public String getOriginNewContent()
	{
		return this.originNewContent;
	}

	public void setOriginNewContent(String originNewContent)
	{
		this.originNewContent = originNewContent;
	}

	public String getObjectNewTitle()
	{
		return this.objectNewTitle;
	}

	public void setObjectNewTitle(String objectNewTitle)
	{
		this.objectNewTitle = objectNewTitle;
	}

	public String getObjectDescription()
	{
		return this.objectDescription;
	}

	public void setObjectDescription(String objectDescription)
	{
		this.objectDescription = objectDescription;
	}

	public String getObjectNewContent()
	{
		return this.objectNewContent;
	}

	public void setObjectNewContent(String objectNewContent)
	{
		this.objectNewContent = objectNewContent;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FinishedOrderId))
			return false;
		FinishedOrderId castOther = (FinishedOrderId) other;

		return ((this.getOrderId() == castOther.getOrderId()) || (this
				.getOrderId() != null && castOther.getOrderId() != null && this
				.getOrderId().equals(castOther.getOrderId())))
				&& ((this.getClientName() == castOther.getClientName()) || (this
						.getClientName() != null
						&& castOther.getClientName() != null && this
						.getClientName().equals(castOther.getClientName())))
				&& ((this.getOrderDate() == castOther.getOrderDate()) || (this
						.getOrderDate() != null
						&& castOther.getOrderDate() != null && this
						.getOrderDate().equals(castOther.getOrderDate())))
				&& ((this.getFinishedDate() == castOther.getFinishedDate()) || (this
						.getFinishedDate() != null
						&& castOther.getFinishedDate() != null && this
						.getFinishedDate().equals(castOther.getFinishedDate())))
				&& ((this.getOriginLanguage() == castOther.getOriginLanguage()) || (this
						.getOriginLanguage() != null
						&& castOther.getOriginLanguage() != null && this
						.getOriginLanguage().equals(
								castOther.getOriginLanguage())))
				&& ((this.getObjectlanguage() == castOther.getObjectlanguage()) || (this
						.getObjectlanguage() != null
						&& castOther.getObjectlanguage() != null && this
						.getObjectlanguage().equals(
								castOther.getObjectlanguage())))
				&& (this.getTranslationCost() == castOther.getTranslationCost())
				&& ((this.getOriginNewTitle() == castOther.getOriginNewTitle()) || (this
						.getOriginNewTitle() != null
						&& castOther.getOriginNewTitle() != null && this
						.getOriginNewTitle().equals(
								castOther.getOriginNewTitle())))
				&& ((this.getOriginAuthor() == castOther.getOriginAuthor()) || (this
						.getOriginAuthor() != null
						&& castOther.getOriginAuthor() != null && this
						.getOriginAuthor().equals(castOther.getOriginAuthor())))
				&& ((this.getFromField() == castOther.getFromField()) || (this
						.getFromField() != null
						&& castOther.getFromField() != null && this
						.getFromField().equals(castOther.getFromField())))
				&& ((this.getNetlink() == castOther.getNetlink()) || (this
						.getNetlink() != null && castOther.getNetlink() != null && this
						.getNetlink().equals(castOther.getNetlink())))
				&& ((this.getOriginDescription() == castOther
						.getOriginDescription()) || (this
						.getOriginDescription() != null
						&& castOther.getOriginDescription() != null && this
						.getOriginDescription().equals(
								castOther.getOriginDescription())))
				&& ((this.getOriginNewContent() == castOther
						.getOriginNewContent()) || (this.getOriginNewContent() != null
						&& castOther.getOriginNewContent() != null && this
						.getOriginNewContent().equals(
								castOther.getOriginNewContent())))
				&& ((this.getObjectNewTitle() == castOther.getObjectNewTitle()) || (this
						.getObjectNewTitle() != null
						&& castOther.getObjectNewTitle() != null && this
						.getObjectNewTitle().equals(
								castOther.getObjectNewTitle())))
				&& ((this.getObjectDescription() == castOther
						.getObjectDescription()) || (this
						.getObjectDescription() != null
						&& castOther.getObjectDescription() != null && this
						.getObjectDescription().equals(
								castOther.getObjectDescription())))
				&& ((this.getObjectNewContent() == castOther
						.getObjectNewContent()) || (this.getObjectNewContent() != null
						&& castOther.getObjectNewContent() != null && this
						.getObjectNewContent().equals(
								castOther.getObjectNewContent())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result
				+ (getOrderId() == null ? 0 : this.getOrderId().hashCode());
		result = 37
				* result
				+ (getClientName() == null ? 0 : this.getClientName()
						.hashCode());
		result = 37 * result
				+ (getOrderDate() == null ? 0 : this.getOrderDate().hashCode());
		result = 37
				* result
				+ (getFinishedDate() == null ? 0 : this.getFinishedDate()
						.hashCode());
		result = 37
				* result
				+ (getOriginLanguage() == null ? 0 : this.getOriginLanguage()
						.hashCode());
		result = 37
				* result
				+ (getObjectlanguage() == null ? 0 : this.getObjectlanguage()
						.hashCode());
		result = 37 * result + (int) this.getTranslationCost();
		result = 37
				* result
				+ (getOriginNewTitle() == null ? 0 : this.getOriginNewTitle()
						.hashCode());
		result = 37
				* result
				+ (getOriginAuthor() == null ? 0 : this.getOriginAuthor()
						.hashCode());
		result = 37 * result
				+ (getFromField() == null ? 0 : this.getFromField().hashCode());
		result = 37 * result
				+ (getNetlink() == null ? 0 : this.getNetlink().hashCode());
		result = 37
				* result
				+ (getOriginDescription() == null ? 0 : this
						.getOriginDescription().hashCode());
		result = 37
				* result
				+ (getOriginNewContent() == null ? 0 : this
						.getOriginNewContent().hashCode());
		result = 37
				* result
				+ (getObjectNewTitle() == null ? 0 : this.getObjectNewTitle()
						.hashCode());
		result = 37
				* result
				+ (getObjectDescription() == null ? 0 : this
						.getObjectDescription().hashCode());
		result = 37
				* result
				+ (getObjectNewContent() == null ? 0 : this
						.getObjectNewContent().hashCode());
		return result;
	}

}