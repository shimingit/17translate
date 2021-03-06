package org.translate.min.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * LiveinTranslator entity. @author MyEclipse Persistence Tools
 */

public class LiveinTranslator implements java.io.Serializable
{

	// Fields

	private Integer ltranslatorId;
	private String luserName;
	private String lpassword;
	private String lmailBox;
	private String lphoneNumber;
	private String lphoto;
	private String lselfDescription;
	private Integer lfans;
	private Integer ltranslationCoin;
	private Integer liveinType;
	private float transExperience;
	private String qualifyDescription;
	private String resumeName;
	private Date liveinDate;
	private float liveinSpan;
	private String translationLevel;
	private String lrealName;
	private String hasLivein;
	private String hasregister;
	private String status;
	private Integer creditvalue;
	private Integer finishedamount;
	private Set goodAtFields = new HashSet(0);
	private Set goodAtLanguages = new HashSet(0);
	private Set translationArranges = new HashSet(0);

	// Constructors

	/** default constructor */
	public LiveinTranslator()
	{
	}

	/** minimal constructor */
	public LiveinTranslator(String luserName, String lpassword)
	{
		this.luserName = luserName;
		this.lpassword = lpassword;
	}
	public LiveinTranslator(String luserName,String lrealname,
			 float transExperience,
			String qualifyDescription,String lselfDescription, 
			String translationLevel)
	{
		this.luserName = luserName;
		this.lrealName = lrealname;
		this.transExperience = transExperience;
		this.qualifyDescription = qualifyDescription;
		this.translationLevel = translationLevel;
		this.lselfDescription = lselfDescription;
	}
	/** full constructor */
	public LiveinTranslator(String luserName, String lpassword,
			String lmailBox, String lphoneNumber, String lphoto,
			String lselfDescription, Integer lfans, Integer ltranslationCoin,
			Integer liveinType, float transExperience,
			String qualifyDescription, String resumeName, Date liveinDate,
			float liveinSpan, String translationLevel, String lrealName,
			String hasLivein, String hasregister, String status,
			Integer creditvalue, Integer finishedamount, Set goodAtFields,
			Set goodAtLanguages, Set translationArranges)
	{
		this.luserName = luserName;
		this.lpassword = lpassword;
		this.lmailBox = lmailBox;
		this.lphoneNumber = lphoneNumber;
		this.lphoto = lphoto;
		this.lselfDescription = lselfDescription;
		this.lfans = lfans;
		this.ltranslationCoin = ltranslationCoin;
		this.liveinType = liveinType;
		this.transExperience = transExperience;
		this.qualifyDescription = qualifyDescription;
		this.resumeName = resumeName;
		this.liveinDate = liveinDate;
		this.liveinSpan = liveinSpan;
		this.translationLevel = translationLevel;
		this.lrealName = lrealName;
		this.hasLivein = hasLivein;
		this.hasregister = hasregister;
		this.status = status;
		this.creditvalue = creditvalue;
		this.finishedamount = finishedamount;
		this.goodAtFields = goodAtFields;
		this.goodAtLanguages = goodAtLanguages;
		this.translationArranges = translationArranges;
	}

	// Property accessors

	public Integer getLtranslatorId()
	{
		return this.ltranslatorId;
	}

	public void setLtranslatorId(Integer ltranslatorId)
	{
		this.ltranslatorId = ltranslatorId;
	}

	public String getLuserName()
	{
		return this.luserName;
	}

	public void setLuserName(String luserName)
	{
		this.luserName = luserName;
	}

	public String getLpassword()
	{
		return this.lpassword;
	}

	public void setLpassword(String lpassword)
	{
		this.lpassword = lpassword;
	}

	public String getLmailBox()
	{
		return this.lmailBox;
	}

	public void setLmailBox(String lmailBox)
	{
		this.lmailBox = lmailBox;
	}

	public String getLphoneNumber()
	{
		return this.lphoneNumber;
	}

	public void setLphoneNumber(String lphoneNumber)
	{
		this.lphoneNumber = lphoneNumber;
	}

	public String getLphoto()
	{
		return this.lphoto;
	}

	public void setLphoto(String lphoto)
	{
		this.lphoto = lphoto;
	}

	public String getLselfDescription()
	{
		return this.lselfDescription;
	}

	public void setLselfDescription(String lselfDescription)
	{
		this.lselfDescription = lselfDescription;
	}

	public Integer getLfans()
	{
		return this.lfans;
	}

	public void setLfans(Integer lfans)
	{
		this.lfans = lfans;
	}

	public Integer getLtranslationCoin()
	{
		return this.ltranslationCoin;
	}

	public void setLtranslationCoin(Integer ltranslationCoin)
	{
		this.ltranslationCoin = ltranslationCoin;
	}

	public Integer getLiveinType()
	{
		return this.liveinType;
	}

	public void setLiveinType(Integer liveinType)
	{
		this.liveinType = liveinType;
	}

	public float getTransExperience()
	{
		return this.transExperience;
	}

	public void setTransExperience(float transExperience)
	{
		this.transExperience = transExperience;
	}

	public String getQualifyDescription()
	{
		return this.qualifyDescription;
	}

	public void setQualifyDescription(String qualifyDescription)
	{
		this.qualifyDescription = qualifyDescription;
	}

	public String getResumeName()
	{
		return this.resumeName;
	}

	public void setResumeName(String resumeName)
	{
		this.resumeName = resumeName;
	}

	public Date getLiveinDate()
	{
		return this.liveinDate;
	}

	public void setLiveinDate(Date liveinDate)
	{
		this.liveinDate = liveinDate;
	}

	public float getLiveinSpan()
	{
		return this.liveinSpan;
	}

	public void setLiveinSpan(float liveinSpan)
	{
		this.liveinSpan = liveinSpan;
	}

	public String getTranslationLevel()
	{
		return this.translationLevel;
	}

	public void setTranslationLevel(String translationLevel)
	{
		this.translationLevel = translationLevel;
	}

	public String getLrealName()
	{
		return this.lrealName;
	}

	public void setLrealName(String lrealName)
	{
		this.lrealName = lrealName;
	}

	public String getHasLivein()
	{
		return this.hasLivein;
	}

	public void setHasLivein(String hasLivein)
	{
		this.hasLivein = hasLivein;
	}

	public String getHasregister()
	{
		return this.hasregister;
	}

	public void setHasregister(String hasregister)
	{
		this.hasregister = hasregister;
	}

	public String getStatus()
	{
		return this.status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public Integer getCreditvalue()
	{
		return this.creditvalue;
	}

	public void setCreditvalue(Integer creditvalue)
	{
		this.creditvalue = creditvalue;
	}

	public Integer getFinishedamount()
	{
		return this.finishedamount;
	}

	public void setFinishedamount(Integer finishedamount)
	{
		this.finishedamount = finishedamount;
	}

	public Set getGoodAtFields()
	{
		return this.goodAtFields;
	}

	public void setGoodAtFields(Set goodAtFields)
	{
		this.goodAtFields = goodAtFields;
	}

	public Set getGoodAtLanguages()
	{
		return this.goodAtLanguages;
	}

	public void setGoodAtLanguages(Set goodAtLanguages)
	{
		this.goodAtLanguages = goodAtLanguages;
	}

	public Set getTranslationArranges()
	{
		return this.translationArranges;
	}

	public void setTranslationArranges(Set translationArranges)
	{
		this.translationArranges = translationArranges;
	}

}