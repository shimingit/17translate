package org.translate.min.entity;

/**
 * PublicNewsId entity. @author MyEclipse Persistence Tools
 */

public class PublicNewsId implements java.io.Serializable
{

	// Fields

	private Integer newId;
	private String netLink;
	private String newTitle;
	private String description;
	private String author;
	private String fromField;
	private String originlanguage;
	private String objectlanguage;

	// Constructors

	/** default constructor */
	public PublicNewsId()
	{
	}

	/** minimal constructor */
	public PublicNewsId(Integer newId, String newTitle, String originlanguage)
	{
		this.newId = newId;
		this.newTitle = newTitle;
		this.originlanguage = originlanguage;
	}

	/** full constructor */
	public PublicNewsId(Integer newId, String netLink, String newTitle,
			String description, String author, String fromField,
			String originlanguage, String objectlanguage)
	{
		this.newId = newId;
		this.netLink = netLink;
		this.newTitle = newTitle;
		this.description = description;
		this.author = author;
		this.fromField = fromField;
		this.originlanguage = originlanguage;
		this.objectlanguage = objectlanguage;
	}

	// Property accessors

	public Integer getNewId()
	{
		return this.newId;
	}

	public void setNewId(Integer newId)
	{
		this.newId = newId;
	}

	public String getNetLink()
	{
		return this.netLink;
	}

	public void setNetLink(String netLink)
	{
		this.netLink = netLink;
	}

	public String getNewTitle()
	{
		return this.newTitle;
	}

	public void setNewTitle(String newTitle)
	{
		this.newTitle = newTitle;
	}

	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getAuthor()
	{
		return this.author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getFromField()
	{
		return this.fromField;
	}

	public void setFromField(String fromField)
	{
		this.fromField = fromField;
	}

	public String getOriginlanguage()
	{
		return this.originlanguage;
	}

	public void setOriginlanguage(String originlanguage)
	{
		this.originlanguage = originlanguage;
	}

	public String getObjectlanguage()
	{
		return this.objectlanguage;
	}

	public void setObjectlanguage(String objectlanguage)
	{
		this.objectlanguage = objectlanguage;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PublicNewsId))
			return false;
		PublicNewsId castOther = (PublicNewsId) other;

		return ((this.getNewId() == castOther.getNewId()) || (this.getNewId() != null
				&& castOther.getNewId() != null && this.getNewId().equals(
				castOther.getNewId())))
				&& ((this.getNetLink() == castOther.getNetLink()) || (this
						.getNetLink() != null && castOther.getNetLink() != null && this
						.getNetLink().equals(castOther.getNetLink())))
				&& ((this.getNewTitle() == castOther.getNewTitle()) || (this
						.getNewTitle() != null
						&& castOther.getNewTitle() != null && this
						.getNewTitle().equals(castOther.getNewTitle())))
				&& ((this.getDescription() == castOther.getDescription()) || (this
						.getDescription() != null
						&& castOther.getDescription() != null && this
						.getDescription().equals(castOther.getDescription())))
				&& ((this.getAuthor() == castOther.getAuthor()) || (this
						.getAuthor() != null && castOther.getAuthor() != null && this
						.getAuthor().equals(castOther.getAuthor())))
				&& ((this.getFromField() == castOther.getFromField()) || (this
						.getFromField() != null
						&& castOther.getFromField() != null && this
						.getFromField().equals(castOther.getFromField())))
				&& ((this.getOriginlanguage() == castOther.getOriginlanguage()) || (this
						.getOriginlanguage() != null
						&& castOther.getOriginlanguage() != null && this
						.getOriginlanguage().equals(
								castOther.getOriginlanguage())))
				&& ((this.getObjectlanguage() == castOther.getObjectlanguage()) || (this
						.getObjectlanguage() != null
						&& castOther.getObjectlanguage() != null && this
						.getObjectlanguage().equals(
								castOther.getObjectlanguage())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result
				+ (getNewId() == null ? 0 : this.getNewId().hashCode());
		result = 37 * result
				+ (getNetLink() == null ? 0 : this.getNetLink().hashCode());
		result = 37 * result
				+ (getNewTitle() == null ? 0 : this.getNewTitle().hashCode());
		result = 37
				* result
				+ (getDescription() == null ? 0 : this.getDescription()
						.hashCode());
		result = 37 * result
				+ (getAuthor() == null ? 0 : this.getAuthor().hashCode());
		result = 37 * result
				+ (getFromField() == null ? 0 : this.getFromField().hashCode());
		result = 37
				* result
				+ (getOriginlanguage() == null ? 0 : this.getOriginlanguage()
						.hashCode());
		result = 37
				* result
				+ (getObjectlanguage() == null ? 0 : this.getObjectlanguage()
						.hashCode());
		return result;
	}

}