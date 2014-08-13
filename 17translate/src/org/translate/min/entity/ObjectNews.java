package org.translate.min.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * ObjectNews entity. @author MyEclipse Persistence Tools
 */

public class ObjectNews implements java.io.Serializable
{

	// Fields

	private Integer objectNewsId;
	private String newTitle;
	private String newContent;
	private Integer languageId;
	private String author;
	private String fromField;
	private String netlink;
	private String newDescription;
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public ObjectNews()
	{
	}

	/** full constructor */
	public ObjectNews(String newTitle, String newContent, Integer languageId,
			String author, String fromField, String netlink,
			String newDescription, Set orders)
	{
		this.newTitle = newTitle;
		this.newContent = newContent;
		this.languageId = languageId;
		this.author = author;
		this.fromField = fromField;
		this.netlink = netlink;
		this.newDescription = newDescription;
		this.orders = orders;
	}

	// Property accessors

	public Integer getObjectNewsId()
	{
		return this.objectNewsId;
	}

	public void setObjectNewsId(Integer objectNewsId)
	{
		this.objectNewsId = objectNewsId;
	}

	public String getNewTitle()
	{
		return this.newTitle;
	}

	public void setNewTitle(String newTitle)
	{
		this.newTitle = newTitle;
	}

	public String getNewContent()
	{
		return this.newContent;
	}

	public void setNewContent(String newContent)
	{
		this.newContent = newContent;
	}

	public Integer getLanguageId()
	{
		return this.languageId;
	}

	public void setLanguageId(Integer languageId)
	{
		this.languageId = languageId;
	}

	public String getAuthor()
	{
		return this.author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
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

	public String getNewDescription()
	{
		return this.newDescription;
	}

	public void setNewDescription(String newDescription)
	{
		this.newDescription = newDescription;
	}

	public Set getOrders()
	{
		return this.orders;
	}

	public void setOrders(Set orders)
	{
		this.orders = orders;
	}

}