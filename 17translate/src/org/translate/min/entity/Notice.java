package org.translate.min.entity;

import java.util.Date;

/**
 * Notice entity. @author MyEclipse Persistence Tools
 */

public class Notice implements java.io.Serializable
{

	// Fields

	private Integer noticeId;
	private String noticetype;
	private String noticeObject;
	private String noticeContent;
	private Date noticeDate;

	// Constructors

	/** default constructor */
	public Notice()
	{
	}

	/** minimal constructor */
	public Notice(String noticetype, String noticeObject)
	{
		this.noticetype = noticetype;
		this.noticeObject = noticeObject;
	}

	/** full constructor */
	public Notice(String noticetype, String noticeObject, String noticeContent,
			Date noticeDate)
	{
		this.noticetype = noticetype;
		this.noticeObject = noticeObject;
		this.noticeContent = noticeContent;
		this.noticeDate = noticeDate;
	}

	// Property accessors

	public Integer getNoticeId()
	{
		return this.noticeId;
	}

	public void setNoticeId(Integer noticeId)
	{
		this.noticeId = noticeId;
	}

	public String getNoticetype()
	{
		return this.noticetype;
	}

	public void setNoticetype(String noticetype)
	{
		this.noticetype = noticetype;
	}

	public String getNoticeObject()
	{
		return this.noticeObject;
	}

	public void setNoticeObject(String noticeObject)
	{
		this.noticeObject = noticeObject;
	}

	public String getNoticeContent()
	{
		return this.noticeContent;
	}

	public void setNoticeContent(String noticeContent)
	{
		this.noticeContent = noticeContent;
	}

	public Date getNoticeDate()
	{
		return this.noticeDate;
	}

	public void setNoticeDate(Date noticeDate)
	{
		this.noticeDate = noticeDate;
	}

}