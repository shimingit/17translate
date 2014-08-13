package org.translate.min.entity;

/**
 * MyLabelId entity. @author MyEclipse Persistence Tools
 */

public class MyLabelId implements java.io.Serializable
{

	// Fields

	private String userName;
	private String labelName;

	// Constructors

	/** default constructor */
	public MyLabelId()
	{
	}

	/** minimal constructor */
	public MyLabelId(String userName)
	{
		this.userName = userName;
	}

	/** full constructor */
	public MyLabelId(String userName, String labelName)
	{
		this.userName = userName;
		this.labelName = labelName;
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

	public String getLabelName()
	{
		return this.labelName;
	}

	public void setLabelName(String labelName)
	{
		this.labelName = labelName;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MyLabelId))
			return false;
		MyLabelId castOther = (MyLabelId) other;

		return ((this.getUserName() == castOther.getUserName()) || (this
				.getUserName() != null && castOther.getUserName() != null && this
				.getUserName().equals(castOther.getUserName())))
				&& ((this.getLabelName() == castOther.getLabelName()) || (this
						.getLabelName() != null
						&& castOther.getLabelName() != null && this
						.getLabelName().equals(castOther.getLabelName())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result
				+ (getUserName() == null ? 0 : this.getUserName().hashCode());
		result = 37 * result
				+ (getLabelName() == null ? 0 : this.getLabelName().hashCode());
		return result;
	}

}