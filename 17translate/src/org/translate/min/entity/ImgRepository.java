package org.translate.min.entity;

/**
 * ImgRepository entity. @author MyEclipse Persistence Tools
 */

public class ImgRepository implements java.io.Serializable
{

	// Fields

	private Integer id;
	private String username;
	private String imgpath;
	private String imgtype;

	// Constructors

	/** default constructor */
	public ImgRepository()
	{
	}

	/** full constructor */
	public ImgRepository(String username, String imgpath, String imgtype)
	{
		this.username = username;
		this.imgpath = imgpath;
		this.imgtype = imgtype;
	}

	// Property accessors

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getUsername()
	{
		return this.username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getImgpath()
	{
		return this.imgpath;
	}

	public void setImgpath(String imgpath)
	{
		this.imgpath = imgpath;
	}

	public String getImgtype()
	{
		return this.imgtype;
	}

	public void setImgtype(String imgtype)
	{
		this.imgtype = imgtype;
	}

}