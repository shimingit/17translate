package org.translate.min.entity;

import java.util.Date;

/**
 * NoFinishedOrderId entity. @author MyEclipse Persistence Tools
 */

public class NoFinishedOrderId implements java.io.Serializable
{

	// Fields

	private Integer orderId;
	private String clientName;
	private String isPay;
	private String translateStatus;
	private Date orderDate;
	private String originLanguage;
	private String objectLanguage;
	private float translationCost;
	private String title;
	private String author;
	private String fromfield;
	private String netlink;
	private String description;
	private String content;

	// Constructors

	/** default constructor */
	public NoFinishedOrderId()
	{
	}

	/** minimal constructor */
	public NoFinishedOrderId(Integer orderId, String clientName,
			String translateStatus, String originLanguage, String title,
			String content)
	{
		this.orderId = orderId;
		this.clientName = clientName;
		this.translateStatus = translateStatus;
		this.originLanguage = originLanguage;
		this.title = title;
		this.content = content;
	}

	/** full constructor */
	public NoFinishedOrderId(Integer orderId, String clientName, String isPay,
			String translateStatus, Date orderDate, String originLanguage,
			String objectLanguage, float translationCost, String title,
			String author, String fromfield, String netlink,
			String description, String content)
	{
		this.orderId = orderId;
		this.clientName = clientName;
		this.isPay = isPay;
		this.translateStatus = translateStatus;
		this.orderDate = orderDate;
		this.originLanguage = originLanguage;
		this.objectLanguage = objectLanguage;
		this.translationCost = translationCost;
		this.title = title;
		this.author = author;
		this.fromfield = fromfield;
		this.netlink = netlink;
		this.description = description;
		this.content = content;
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

	public String getIsPay()
	{
		return this.isPay;
	}

	public void setIsPay(String isPay)
	{
		this.isPay = isPay;
	}

	public String getTranslateStatus()
	{
		return this.translateStatus;
	}

	public void setTranslateStatus(String translateStatus)
	{
		this.translateStatus = translateStatus;
	}

	public Date getOrderDate()
	{
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate)
	{
		this.orderDate = orderDate;
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

	public float getTranslationCost()
	{
		return this.translationCost;
	}

	public void setTranslationCost(float translationCost)
	{
		this.translationCost = translationCost;
	}

	public String getTitle()
	{
		return this.title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAuthor()
	{
		return this.author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getFromfield()
	{
		return this.fromfield;
	}

	public void setFromfield(String fromfield)
	{
		this.fromfield = fromfield;
	}

	public String getNetlink()
	{
		return this.netlink;
	}

	public void setNetlink(String netlink)
	{
		this.netlink = netlink;
	}

	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getContent()
	{
		return this.content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NoFinishedOrderId))
			return false;
		NoFinishedOrderId castOther = (NoFinishedOrderId) other;

		return ((this.getOrderId() == castOther.getOrderId()) || (this
				.getOrderId() != null && castOther.getOrderId() != null && this
				.getOrderId().equals(castOther.getOrderId())))
				&& ((this.getClientName() == castOther.getClientName()) || (this
						.getClientName() != null
						&& castOther.getClientName() != null && this
						.getClientName().equals(castOther.getClientName())))
				&& ((this.getIsPay() == castOther.getIsPay()) || (this
						.getIsPay() != null && castOther.getIsPay() != null && this
						.getIsPay().equals(castOther.getIsPay())))
				&& ((this.getTranslateStatus() == castOther
						.getTranslateStatus()) || (this.getTranslateStatus() != null
						&& castOther.getTranslateStatus() != null && this
						.getTranslateStatus().equals(
								castOther.getTranslateStatus())))
				&& ((this.getOrderDate() == castOther.getOrderDate()) || (this
						.getOrderDate() != null
						&& castOther.getOrderDate() != null && this
						.getOrderDate().equals(castOther.getOrderDate())))
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
				&& (this.getTranslationCost() == castOther.getTranslationCost())
				&& ((this.getTitle() == castOther.getTitle()) || (this
						.getTitle() != null && castOther.getTitle() != null && this
						.getTitle().equals(castOther.getTitle())))
				&& ((this.getAuthor() == castOther.getAuthor()) || (this
						.getAuthor() != null && castOther.getAuthor() != null && this
						.getAuthor().equals(castOther.getAuthor())))
				&& ((this.getFromfield() == castOther.getFromfield()) || (this
						.getFromfield() != null
						&& castOther.getFromfield() != null && this
						.getFromfield().equals(castOther.getFromfield())))
				&& ((this.getNetlink() == castOther.getNetlink()) || (this
						.getNetlink() != null && castOther.getNetlink() != null && this
						.getNetlink().equals(castOther.getNetlink())))
				&& ((this.getDescription() == castOther.getDescription()) || (this
						.getDescription() != null
						&& castOther.getDescription() != null && this
						.getDescription().equals(castOther.getDescription())))
				&& ((this.getContent() == castOther.getContent()) || (this
						.getContent() != null && castOther.getContent() != null && this
						.getContent().equals(castOther.getContent())));
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
				+ (getIsPay() == null ? 0 : this.getIsPay().hashCode());
		result = 37
				* result
				+ (getTranslateStatus() == null ? 0 : this.getTranslateStatus()
						.hashCode());
		result = 37 * result
				+ (getOrderDate() == null ? 0 : this.getOrderDate().hashCode());
		result = 37
				* result
				+ (getOriginLanguage() == null ? 0 : this.getOriginLanguage()
						.hashCode());
		result = 37
				* result
				+ (getObjectLanguage() == null ? 0 : this.getObjectLanguage()
						.hashCode());
		result = 37 * result + (int) this.getTranslationCost();
		result = 37 * result
				+ (getTitle() == null ? 0 : this.getTitle().hashCode());
		result = 37 * result
				+ (getAuthor() == null ? 0 : this.getAuthor().hashCode());
		result = 37 * result
				+ (getFromfield() == null ? 0 : this.getFromfield().hashCode());
		result = 37 * result
				+ (getNetlink() == null ? 0 : this.getNetlink().hashCode());
		result = 37
				* result
				+ (getDescription() == null ? 0 : this.getDescription()
						.hashCode());
		result = 37 * result
				+ (getContent() == null ? 0 : this.getContent().hashCode());
		return result;
	}

}