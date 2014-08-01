package org.translate.min.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Language entity. @author MyEclipse Persistence Tools
 */

public class Language implements java.io.Serializable
{

	// Fields

	private Integer languageId;
	private String languageName;
	private Set goodAtLanguages = new HashSet(0);
	private Set news = new HashSet(0);

	// Constructors

	/** default constructor */
	public Language()
	{
	}

	/** minimal constructor */
	public Language(String languageName)
	{
		this.languageName = languageName;
	}

	/** full constructor */
	public Language(String languageName, Set goodAtLanguages, Set news)
	{
		this.languageName = languageName;
		this.goodAtLanguages = goodAtLanguages;
		this.news = news;
	}

	// Property accessors

	public Integer getLanguageId()
	{
		return this.languageId;
	}

	public void setLanguageId(Integer languageId)
	{
		this.languageId = languageId;
	}

	public String getLanguageName()
	{
		return this.languageName;
	}

	public void setLanguageName(String languageName)
	{
		this.languageName = languageName;
	}

	public Set getGoodAtLanguages()
	{
		return this.goodAtLanguages;
	}

	public void setGoodAtLanguages(Set goodAtLanguages)
	{
		this.goodAtLanguages = goodAtLanguages;
	}

	public Set getNews()
	{
		return this.news;
	}

	public void setNews(Set news)
	{
		this.news = news;
	}

}