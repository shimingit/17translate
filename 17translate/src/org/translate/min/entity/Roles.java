package org.translate.min.entity;

/**
 * Roles entity. @author MyEclipse Persistence Tools
 */

public class Roles implements java.io.Serializable
{

	// Fields

	private RolesId id;

	// Constructors

	/** default constructor */
	public Roles()
	{
	}

	/** full constructor */
	public Roles(RolesId id)
	{
		this.id = id;
	}

	// Property accessors

	public RolesId getId()
	{
		return this.id;
	}

	public void setId(RolesId id)
	{
		this.id = id;
	}

}