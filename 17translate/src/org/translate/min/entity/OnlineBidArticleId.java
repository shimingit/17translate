package org.translate.min.entity;

import java.util.Date;

/**
 * OnlineBidArticleId entity. @author MyEclipse Persistence Tools
 */

public class OnlineBidArticleId implements java.io.Serializable
{

	// Fields

	private Integer ordersid;
	private String articletitle;
	private String articleauthor;
	private String originlanguage;
	private String objectlanguage;
	private String translatearea;
	private Integer articlewordscount;
	private Date latestsubmitdate;
	private float recomendcost;
	private String translationstatus;
	private String articlelink;
	private String articledescriprion;

	// Constructors

	/** default constructor */
	public OnlineBidArticleId()
	{
	}

	/** minimal constructor */
	public OnlineBidArticleId(Integer ordersid, String articletitle,
			String originlanguage, Integer articlewordscount)
	{
		this.ordersid = ordersid;
		this.articletitle = articletitle;
		this.originlanguage = originlanguage;
		this.articlewordscount = articlewordscount;
	}

	/** full constructor */
	public OnlineBidArticleId(Integer ordersid, String articletitle,
			String articleauthor, String originlanguage, String objectlanguage,
			String translatearea, Integer articlewordscount,
			Date latestsubmitdate, float recomendcost,
			String translationstatus, String articlelink,
			String articledescriprion)
	{
		this.ordersid = ordersid;
		this.articletitle = articletitle;
		this.articleauthor = articleauthor;
		this.originlanguage = originlanguage;
		this.objectlanguage = objectlanguage;
		this.translatearea = translatearea;
		this.articlewordscount = articlewordscount;
		this.latestsubmitdate = latestsubmitdate;
		this.recomendcost = recomendcost;
		this.translationstatus = translationstatus;
		this.articlelink = articlelink;
		this.articledescriprion = articledescriprion;
	}

	// Property accessors

	public Integer getOrdersid()
	{
		return this.ordersid;
	}

	public void setOrdersid(Integer ordersid)
	{
		this.ordersid = ordersid;
	}

	public String getArticletitle()
	{
		return this.articletitle;
	}

	public void setArticletitle(String articletitle)
	{
		this.articletitle = articletitle;
	}

	public String getArticleauthor()
	{
		return this.articleauthor;
	}

	public void setArticleauthor(String articleauthor)
	{
		this.articleauthor = articleauthor;
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

	public String getTranslatearea()
	{
		return this.translatearea;
	}

	public void setTranslatearea(String translatearea)
	{
		this.translatearea = translatearea;
	}

	public Integer getArticlewordscount()
	{
		return this.articlewordscount;
	}

	public void setArticlewordscount(Integer articlewordscount)
	{
		this.articlewordscount = articlewordscount;
	}

	public Date getLatestsubmitdate()
	{
		return this.latestsubmitdate;
	}

	public void setLatestsubmitdate(Date latestsubmitdate)
	{
		this.latestsubmitdate = latestsubmitdate;
	}

	public float getRecomendcost()
	{
		return this.recomendcost;
	}

	public void setRecomendcost(float recomendcost)
	{
		this.recomendcost = recomendcost;
	}

	public String getTranslationstatus()
	{
		return this.translationstatus;
	}

	public void setTranslationstatus(String translationstatus)
	{
		this.translationstatus = translationstatus;
	}

	public String getArticlelink()
	{
		return this.articlelink;
	}

	public void setArticlelink(String articlelink)
	{
		this.articlelink = articlelink;
	}

	public String getArticledescriprion()
	{
		return this.articledescriprion;
	}

	public void setArticledescriprion(String articledescriprion)
	{
		this.articledescriprion = articledescriprion;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OnlineBidArticleId))
			return false;
		OnlineBidArticleId castOther = (OnlineBidArticleId) other;

		return ((this.getOrdersid() == castOther.getOrdersid()) || (this
				.getOrdersid() != null && castOther.getOrdersid() != null && this
				.getOrdersid().equals(castOther.getOrdersid())))
				&& ((this.getArticletitle() == castOther.getArticletitle()) || (this
						.getArticletitle() != null
						&& castOther.getArticletitle() != null && this
						.getArticletitle().equals(castOther.getArticletitle())))
				&& ((this.getArticleauthor() == castOther.getArticleauthor()) || (this
						.getArticleauthor() != null
						&& castOther.getArticleauthor() != null && this
						.getArticleauthor()
						.equals(castOther.getArticleauthor())))
				&& ((this.getOriginlanguage() == castOther.getOriginlanguage()) || (this
						.getOriginlanguage() != null
						&& castOther.getOriginlanguage() != null && this
						.getOriginlanguage().equals(
								castOther.getOriginlanguage())))
				&& ((this.getObjectlanguage() == castOther.getObjectlanguage()) || (this
						.getObjectlanguage() != null
						&& castOther.getObjectlanguage() != null && this
						.getObjectlanguage().equals(
								castOther.getObjectlanguage())))
				&& ((this.getTranslatearea() == castOther.getTranslatearea()) || (this
						.getTranslatearea() != null
						&& castOther.getTranslatearea() != null && this
						.getTranslatearea()
						.equals(castOther.getTranslatearea())))
				&& ((this.getArticlewordscount() == castOther
						.getArticlewordscount()) || (this
						.getArticlewordscount() != null
						&& castOther.getArticlewordscount() != null && this
						.getArticlewordscount().equals(
								castOther.getArticlewordscount())))
				&& ((this.getLatestsubmitdate() == castOther
						.getLatestsubmitdate()) || (this.getLatestsubmitdate() != null
						&& castOther.getLatestsubmitdate() != null && this
						.getLatestsubmitdate().equals(
								castOther.getLatestsubmitdate())))
				&& (this.getRecomendcost() == castOther.getRecomendcost())
				&& ((this.getTranslationstatus() == castOther
						.getTranslationstatus()) || (this
						.getTranslationstatus() != null
						&& castOther.getTranslationstatus() != null && this
						.getTranslationstatus().equals(
								castOther.getTranslationstatus())))
				&& ((this.getArticlelink() == castOther.getArticlelink()) || (this
						.getArticlelink() != null
						&& castOther.getArticlelink() != null && this
						.getArticlelink().equals(castOther.getArticlelink())))
				&& ((this.getArticledescriprion() == castOther
						.getArticledescriprion()) || (this
						.getArticledescriprion() != null
						&& castOther.getArticledescriprion() != null && this
						.getArticledescriprion().equals(
								castOther.getArticledescriprion())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result
				+ (getOrdersid() == null ? 0 : this.getOrdersid().hashCode());
		result = 37
				* result
				+ (getArticletitle() == null ? 0 : this.getArticletitle()
						.hashCode());
		result = 37
				* result
				+ (getArticleauthor() == null ? 0 : this.getArticleauthor()
						.hashCode());
		result = 37
				* result
				+ (getOriginlanguage() == null ? 0 : this.getOriginlanguage()
						.hashCode());
		result = 37
				* result
				+ (getObjectlanguage() == null ? 0 : this.getObjectlanguage()
						.hashCode());
		result = 37
				* result
				+ (getTranslatearea() == null ? 0 : this.getTranslatearea()
						.hashCode());
		result = 37
				* result
				+ (getArticlewordscount() == null ? 0 : this
						.getArticlewordscount().hashCode());
		result = 37
				* result
				+ (getLatestsubmitdate() == null ? 0 : this
						.getLatestsubmitdate().hashCode());
		result = 37 * result + (int) this.getRecomendcost();
		result = 37
				* result
				+ (getTranslationstatus() == null ? 0 : this
						.getTranslationstatus().hashCode());
		result = 37
				* result
				+ (getArticlelink() == null ? 0 : this.getArticlelink()
						.hashCode());
		result = 37
				* result
				+ (getArticledescriprion() == null ? 0 : this
						.getArticledescriprion().hashCode());
		return result;
	}

}