package org.translate.min.entity;

/**
 * FinishedOrder entity. @author MyEclipse Persistence Tools
 */

public class FinishedOrder implements java.io.Serializable
{

	// Fields

	private FinishedOrderId id;

	// Constructors

	/** default constructor */
	public FinishedOrder()
	{
	}

	/** full constructor */
	public FinishedOrder(FinishedOrderId id)
	{
		this.id = id;
	}

	// Property accessors

	public FinishedOrderId getId()
	{
		return this.id;
	}

	public void setId(FinishedOrderId id)
	{
		this.id = id;
	}

}