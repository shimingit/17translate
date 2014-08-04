package org.translate.min.entity;

/**
 * RolesId entity. @author MyEclipse Persistence Tools
 */

public class RolesId implements java.io.Serializable
{

	// Fields

	private String username;
	private String password;
	private String mark;

	// Constructors

	/** default constructor */
	public RolesId()
	{
	}

	/** full constructor */
	public RolesId(String username, String password, String mark)
	{
		this.username = username;
		this.password = password;
		this.mark = mark;
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

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getMark()
	{
		return this.mark;
	}

	public void setMark(String mark)
	{
		this.mark = mark;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RolesId))
			return false;
		RolesId castOther = (RolesId) other;

		return ((this.getUsername() == castOther.getUsername()) || (this
				.getUsername() != null && castOther.getUsername() != null && this
				.getUsername().equals(castOther.getUsername())))
				&& ((this.getPassword() == castOther.getPassword()) || (this
						.getPassword() != null
						&& castOther.getPassword() != null && this
						.getPassword().equals(castOther.getPassword())))
				&& ((this.getMark() == castOther.getMark()) || (this.getMark() != null
						&& castOther.getMark() != null && this.getMark()
						.equals(castOther.getMark())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result
				+ (getUsername() == null ? 0 : this.getUsername().hashCode());
		result = 37 * result
				+ (getPassword() == null ? 0 : this.getPassword().hashCode());
		result = 37 * result
				+ (getMark() == null ? 0 : this.getMark().hashCode());
		return result;
	}

}