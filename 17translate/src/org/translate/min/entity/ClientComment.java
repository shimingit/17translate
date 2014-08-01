package org.translate.min.entity;

import java.util.Date;

/**
 * ClientComment entity. @author MyEclipse Persistence Tools
 */

public class ClientComment implements java.io.Serializable
{

	// Fields

	private Integer commentId;
	private Order order;
	private String commnetContent;
	private Date commentDate;

	// Constructors

	/** default constructor */
	public ClientComment()
	{
	}

	/** full constructor */
	public ClientComment(Order order, String commnetContent, Date commentDate)
	{
		this.order = order;
		this.commnetContent = commnetContent;
		this.commentDate = commentDate;
	}

	// Property accessors

	public Integer getCommentId()
	{
		return this.commentId;
	}

	public void setCommentId(Integer commentId)
	{
		this.commentId = commentId;
	}

	public Order getOrder()
	{
		return this.order;
	}

	public void setOrder(Order order)
	{
		this.order = order;
	}

	public String getCommnetContent()
	{
		return this.commnetContent;
	}

	public void setCommnetContent(String commnetContent)
	{
		this.commnetContent = commnetContent;
	}

	public Date getCommentDate()
	{
		return this.commentDate;
	}

	public void setCommentDate(Date commentDate)
	{
		this.commentDate = commentDate;
	}

}