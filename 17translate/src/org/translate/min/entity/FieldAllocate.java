package org.translate.min.entity;

/**
 * FieldAllocate entity. @author MyEclipse Persistence Tools
 */

public class FieldAllocate implements java.io.Serializable
{

	// Fields

	private FieldAllocateId id;

	// Constructors

	/** default constructor */
	public FieldAllocate()
	{
	}

	/** full constructor */
	public FieldAllocate(FieldAllocateId id)
	{
		this.id = id;
	}

	// Property accessors

	public FieldAllocateId getId()
	{
		return this.id;
	}

	public void setId(FieldAllocateId id)
	{
		this.id = id;
	}

}