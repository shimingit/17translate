package org.translate.min.entity;

/**
 * ImgRepository entity. @author MyEclipse Persistence Tools
 */

public class ImgRepository implements java.io.Serializable
{

	// Fields

	private ImgRepositoryId id;

	// Constructors

	/** default constructor */
	public ImgRepository()
	{
	}

	/** full constructor */
	public ImgRepository(ImgRepositoryId id)
	{
		this.id = id;
	}

	// Property accessors

	public ImgRepositoryId getId()
	{
		return this.id;
	}

	public void setId(ImgRepositoryId id)
	{
		this.id = id;
	}

}