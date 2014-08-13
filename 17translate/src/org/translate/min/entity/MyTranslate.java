package org.translate.min.entity;

/**
 * MyTranslate entity. @author MyEclipse Persistence Tools
 */

public class MyTranslate implements java.io.Serializable
{

	// Fields

	private MyTranslateId id;

	// Constructors

	/** default constructor */
	public MyTranslate()
	{
	}

	/** full constructor */
	public MyTranslate(MyTranslateId id)
	{
		this.id = id;
	}

	// Property accessors

	public MyTranslateId getId()
	{
		return this.id;
	}

	public void setId(MyTranslateId id)
	{
		this.id = id;
	}

}