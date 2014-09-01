package org.translate.min.entity;

/**
 * FieldAllocateId entity. @author MyEclipse Persistence Tools
 */

public class FieldAllocateId implements java.io.Serializable
{

	// Fields

	private String userName;
	private Integer filedId;

	// Constructors

	/** default constructor */
	public FieldAllocateId()
	{
	}

	/** full constructor */
	public FieldAllocateId(String userName, Integer filedId)
	{
		this.userName = userName;
		this.filedId = filedId;
	}

	// Property accessors

	public String getUserName()
	{
		return this.userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public Integer getFiledId()
	{
		return this.filedId;
	}

	public void setFiledId(Integer filedId)
	{
		this.filedId = filedId;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FieldAllocateId))
			return false;
		FieldAllocateId castOther = (FieldAllocateId) other;

		return ((this.getUserName() == castOther.getUserName()) || (this
				.getUserName() != null && castOther.getUserName() != null && this
				.getUserName().equals(castOther.getUserName())))
				&& ((this.getFiledId() == castOther.getFiledId()) || (this
						.getFiledId() != null && castOther.getFiledId() != null && this
						.getFiledId().equals(castOther.getFiledId())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result
				+ (getUserName() == null ? 0 : this.getUserName().hashCode());
		result = 37 * result
				+ (getFiledId() == null ? 0 : this.getFiledId().hashCode());
		return result;
	}

}