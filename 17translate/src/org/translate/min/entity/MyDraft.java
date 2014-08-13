package org.translate.min.entity;

/**
 * MyDraft entity. @author MyEclipse Persistence Tools
 */

public class MyDraft implements java.io.Serializable
{

	// Fields

	private MyDraftId id;

	// Constructors

	/** default constructor */
	public MyDraft()
	{
	}

	/** full constructor */
	public MyDraft(MyDraftId id)
	{
		this.id = id;
	}

	// Property accessors

	public MyDraftId getId()
	{
		return this.id;
	}

	public void setId(MyDraftId id)
	{
		this.id = id;
	}

}