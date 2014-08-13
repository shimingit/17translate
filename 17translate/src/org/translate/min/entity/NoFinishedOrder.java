package org.translate.min.entity;

/**
 * NoFinishedOrder entity. @author MyEclipse Persistence Tools
 */

public class NoFinishedOrder implements java.io.Serializable
{

	// Fields

	private NoFinishedOrderId id;

	// Constructors

	/** default constructor */
	public NoFinishedOrder()
	{
	}

	/** full constructor */
	public NoFinishedOrder(NoFinishedOrderId id)
	{
		this.id = id;
	}

	// Property accessors

	public NoFinishedOrderId getId()
	{
		return this.id;
	}

	public void setId(NoFinishedOrderId id)
	{
		this.id = id;
	}

}