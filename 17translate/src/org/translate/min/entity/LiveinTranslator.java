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
	private byte[] lphoto;
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
	private Set goodAtFields = new HashSet(0);
	private Set goodAtLanguages = new HashSet(0);
	private Set translationArranges = new HashSet(0);

	// Constructors

	/** default constructor */
	public LiveinTranslator()
	{
	}

	/** minimal constructor */
	public LiveinTranslator(String luserName, String lpassword,
			String lmailBox, Integer liveinType, float transExperience,
			String qualifyDescription,String lselfDescription, String resumeName, Date liveinDate,
			float liveinSpan, String translationLevel,String phonenumber)
	{
		this.luserName = luserName;
		this.lpassword = lpassword;
		this.lmailBox = lmailBox;
		this.liveinType = liveinType;
		this.transExperience = transExperience;
		this.qualifyDescription = qualifyDescription;
		this.resumeName = resumeName;
		this.liveinDate = liveinDate;
		this.liveinSpan = liveinSpan;
		this.translationLevel = translationLevel;
		this.lselfDescription = lselfDescription;
		this.lphoneNumber = phonenumber;

	}

	/** full constructor */
	public LiveinTranslator(String luserName, String lpassword,
			String lmailBox, String lphoneNumber, byte[] lphoto,
			String lselfDescription, Integer lfans, Integer ltranslationCoin,
			Integer liveinType, float transExperience,
			String qualifyDescription, String resumeName, Date liveinDate,
			float liveinSpan, String translationLevel, Set goodAtFields,
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

	public byte[] getLphoto()
	{
		return this.lphoto;
	}

	public void setLphoto(byte[] lphoto)
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