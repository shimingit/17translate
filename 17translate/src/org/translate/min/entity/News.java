package org.translate.min.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * New entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable
{

	// Fields

	private Integer newId;
	private Language language;
	private Client client;
	private String netLink;
	private String newTitle;
	private String newContent;
	private Integer wordCount;
	private String description;
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public News()
	{
	}

	/** minimal constructor */
	public News(Language language, Client client, String newTitle,
			String newContent, Integer wordCount)
	{
		this.language = language;
		this.client = client;
		this.newTitle = newTitle;
		this.newContent = newContent;
		this.wordCount = wordCount;
	}

	/** full constructor */
	public News(Language language, Client client, String netLink,
			String newTitle, String newContent, Integer wordCount,
			String description, Set orders)
	{
		this.language = language;
		this.client = client;
		this.netLink = netLink;
		this.newTitle = newTitle;
		this.newContent = newContent;
		this.wordCount = wordCount;
		this.description = description;
		this.orders = orders;
	}

	// Property accessors

	public Integer getNewId()
	{
		return this.newId;
	}

	public void setNewId(Integer newId)
	{
		this.newId = newId;
	}

	public Language getLanguage()
	{
		return this.language;
	}

	public void setLanguage(Language language)
	{
		this.language = language;
	}

	public Client getClient()
	{
		return this.client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}

	public String getNetLink()
	{
		return this.netLink;
	}

	public void setNetLink(String netLink)
	{
		this.netLink = netLink;
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

	public Integer getWordCount()
	{
		return this.wordCount;
	}

	public void setWordCount(Integer wordCount)
	{
		this.wordCount = wordCount;
	}

	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(String description)
	{
		this.description = description;
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