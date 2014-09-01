package org.translate.min.entity;


/**
 * NoFinishedOrderId entity. @author MyEclipse Persistence Tools
 */

public class NoFinishedOrderId implements java.io.Serializable
{

	// Fields

	private Integer orderId;
	private String orderSerialId;
	private String clientName;
	private String isPay;
	private String translateStatus;
	private String orderDate;
	private String originLanguage;
	private String objectLanguage;
	private float translationCost;
	private String fromfield;
	private String hasfile;
	private String storepath;

	// Constructors

	/** default constructor */
	public NoFinishedOrderId()
	{
	}

	/** minimal constructor */
	public NoFinishedOrderId(Integer orderId, String clientName,
			String originLanguage)
	{
		this.orderId = orderId;
		this.clientName = clientName;
		this.originLanguage = originLanguage;
	}

	/** full constructor */
	public NoFinishedOrderId(Integer orderId, String orderSerialId,
			String clientName, String isPay, String translateStatus,
			String orderDate, String originLanguage, String objectLanguage,
			float translationCost, String fromfield, String hasfile,
			String storepath)
	{
		this.orderId = orderId;
		this.orderSerialId = orderSerialId;
		this.clientName = clientName;
		this.isPay = isPay;
		this.translateStatus = translateStatus;
		this.orderDate = orderDate;
		this.originLanguage = originLanguage;
		this.objectLanguage = objectLanguage;
		this.translationCost = translationCost;
		this.fromfield = fromfield;
		this.hasfile = hasfile;
		this.storepath = storepath;
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

	public String getOrderSerialId()
	{
		return this.orderSerialId;
	}

	public void setOrderSerialId(String orderSerialId)
	{
		this.orderSerialId = orderSerialId;
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

	public String getOrderDate()
	{
		return this.orderDate;
	}

	public void setOrderDate(String orderDate)
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

	public String getFromfield()
	{
		return this.fromfield;
	}

	public void setFromfield(String fromfield)
	{
		this.fromfield = fromfield;
	}

	public String getHasfile()
	{
		return this.hasfile;
	}

	public void setHasfile(String hasfile)
	{
		this.hasfile = hasfile;
	}

	public String getStorepath()
	{
		return this.storepath;
	}

	public void setStorepath(String storepath)
	{
		this.storepath = storepath;
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
				&& ((this.getOrderSerialId() == castOther.getOrderSerialId()) || (this
						.getOrderSerialId() != null
						&& castOther.getOrderSerialId() != null && this
						.getOrderSerialId()
						.equals(castOther.getOrderSerialId())))
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
				&& ((this.getFromfield() == castOther.getFromfield()) || (this
						.getFromfield() != null
						&& castOther.getFromfield() != null && this
						.getFromfield().equals(castOther.getFromfield())))
				&& ((this.getHasfile() == castOther.getHasfile()) || (this
						.getHasfile() != null && castOther.getHasfile() != null && this
						.getHasfile().equals(castOther.getHasfile())))
				&& ((this.getStorepath() == castOther.getStorepath()) || (this
						.getStorepath() != null
						&& castOther.getStorepath() != null && this
						.getStorepath().equals(castOther.getStorepath())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result
				+ (getOrderId() == null ? 0 : this.getOrderId().hashCode());
		result = 37
				* result
				+ (getOrderSerialId() == null ? 0 : this.getOrderSerialId()
						.hashCode());
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
				+ (getFromfield() == null ? 0 : this.getFromfield().hashCode());
		result = 37 * result
				+ (getHasfile() == null ? 0 : this.getHasfile().hashCode());
		result = 37 * result
				+ (getStorepath() == null ? 0 : this.getStorepath().hashCode());
		return result;
	}

}