package org.translate.min.entity;

/**
 * ImgRepositoryId entity. @author MyEclipse Persistence Tools
 */

public class ImgRepositoryId implements java.io.Serializable
{

	// Fields

	private String username;
	private String imgpath;
	private String imgtype;

	// Constructors

	/** default constructor */
	public ImgRepositoryId()
	{
	}

	/** full constructor */
	public ImgRepositoryId(String username, String imgpath, String imgtype)
	{
		this.username = username;
		this.imgpath = imgpath;
		this.imgtype = imgtype;
	}

	// Property accessors

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

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ImgRepositoryId))
			return false;
		ImgRepositoryId castOther = (ImgRepositoryId) other;

		return ((this.getUsername() == castOther.getUsername()) || (this
				.getUsername() != null && castOther.getUsername() != null && this
				.getUsername().equals(castOther.getUsername())))
				&& ((this.getImgpath() == castOther.getImgpath()) || (this
						.getImgpath() != null && castOther.getImgpath() != null && this
						.getImgpath().equals(castOther.getImgpath())))
				&& ((this.getImgtype() == castOther.getImgtype()) || (this
						.getImgtype() != null && castOther.getImgtype() != null && this
						.getImgtype().equals(castOther.getImgtype())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result
				+ (getUsername() == null ? 0 : this.getUsername().hashCode());
		result = 37 * result
				+ (getImgpath() == null ? 0 : this.getImgpath().hashCode());
		result = 37 * result
				+ (getImgtype() == null ? 0 : this.getImgtype().hashCode());
		return result;
	}

}