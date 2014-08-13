package org.translate.min.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable
{

	// Fields

	private Integer orderId;
	private News news;
	private ObjectNews objectNews;
	private Client client;
	private Date orderDate;
	private String objectLanguage;
	private String anticipateTime;
	private float translationCost;
	private String isPay;
	private String orderSerialId;
	private String status;
	private boolean isPublic;
	private Date finishedDate;
	private Set clientComments = new HashSet(0);
	private Set translationArranges = new HashSet(0);

	// Constructors

	/** default constructor */
	public Order()
	{
	}

	/** minimal constructor */
	public Order(News news, Client client, String status)
	{
		this.news = news;
		this.client = client;
		this.status = status;
	}

	/** full constructor */
	public Order(News news, ObjectNews objectNews, Client client,
			Date orderDate, String objectLanguage, String anticipateTime,
			float translationCost, String isPay, String orderSerialId,
			String status, boolean isPublic, Date finishedDate,
			Set clientComments, Set translationArranges)
	{
		this.news = news;
		this.objectNews = objectNews;
		this.client = client;
		this.orderDate = orderDate;
		this.objectLanguage = objectLanguage;
		this.anticipateTime = anticipateTime;
		this.translationCost = translationCost;
		this.isPay = isPay;
		this.orderSerialId = orderSerialId;
		this.status = status;
		this.isPublic = isPublic;
		this.finishedDate = finishedDate;
		this.clientComments = clientComments;
		this.translationArranges = translationArranges;
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

	public News getNews()
	{
		return this.news;
	}

	public void setNews(News news)
	{
		this.news = news;
	}

	public ObjectNews getObjectNews()
	{
		return this.objectNews;
	}

	public void setObjectNews(ObjectNews objectNews)
	{
		this.objectNews = objectNews;
	}

	public Client getClient()
	{
		return this.client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}

	public Date getOrderDate()
	{
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate)
	{
		this.orderDate = orderDate;
	}

	public String getObjectLanguage()
	{
		return this.objectLanguage;
	}

	public void setObjectLanguage(String objectLanguage)
	{
		this.objectLanguage = objectLanguage;
	}

	public String getAnticipateTime()
	{
		return this.anticipateTime;
	}

	public void setAnticipateTime(String anticipateTime)
	{
		this.anticipateTime = anticipateTime;
	}

	public float getTranslationCost()
	{
		return this.translationCost;
	}

	public void setTranslationCost(float translationCost)
	{
		this.translationCost = translationCost;
	}

	public String getIsPay()
	{
		return this.isPay;
	}

	public void setIsPay(String isPay)
	{
		this.isPay = isPay;
	}

	public String getOrderSerialId()
	{
		return this.orderSerialId;
	}

	public void setOrderSerialId(String orderSerialId)
	{
		this.orderSerialId = orderSerialId;
	}

	public String getStatus()
	{
		return this.status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public boolean getIsPublic()
	{
		return this.isPublic;
	}

	public void setIsPublic(boolean isPublic)
	{
		this.isPublic = isPublic;
	}

	public Date getFinishedDate()
	{
		return this.finishedDate;
	}

	public void setFinishedDate(Date finishedDate)
	{
		this.finishedDate = finishedDate;
	}

	public Set getClientComments()
	{
		return this.clientComments;
	}

	public void setClientComments(Set clientComments)
	{
		this.clientComments = clientComments;
	}

	public Set getTranslationArranges()
	{
		return this.translationArranges;
	}

	public void setTranslationArranges(Set translationArranges)
	{
		this.translationArranges = translationArranges;
	}

}