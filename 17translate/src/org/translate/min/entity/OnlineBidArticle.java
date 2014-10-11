package org.translate.min.entity;

/**
 * OnlineBidArticle entity. @author MyEclipse Persistence Tools
 */

public class OnlineBidArticle implements java.io.Serializable
{

	// Fields

	private OnlineBidArticleId id;

	// Constructors

	/** default constructor */
	public OnlineBidArticle()
	{
	}

	/** full constructor */
	public OnlineBidArticle(OnlineBidArticleId id)
	{
		this.id = id;
	}

	// Property accessors

	public OnlineBidArticleId getId()
	{
		return this.id;
	}

	public void setId(OnlineBidArticleId id)
	{
		this.id = id;
	}

}