package org.translate.min.entity;

/**
 * PublicNews entity. @author MyEclipse Persistence Tools
 */

public class PublicNews implements java.io.Serializable
{

	// Fields

	private PublicNewsId id;

	// Constructors

	/** default constructor */
	public PublicNews()
	{
	}

	/** full constructor */
	public PublicNews(PublicNewsId id)
	{
		this.id = id;
	}

	// Property accessors

	public PublicNewsId getId()
	{
		return this.id;
	}

	public void setId(PublicNewsId id)
	{
		this.id = id;
	}

}