package org.translate.min.entity;

/**
 * MyLabel entity. @author MyEclipse Persistence Tools
 */

public class MyLabel implements java.io.Serializable
{

	// Fields

	private MyLabelId id;

	// Constructors

	/** default constructor */
	public MyLabel()
	{
	}

	/** full constructor */
	public MyLabel(MyLabelId id)
	{
		this.id = id;
	}

	// Property accessors

	public MyLabelId getId()
	{
		return this.id;
	}

	public void setId(MyLabelId id)
	{
		this.id = id;
	}

}