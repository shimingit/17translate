package org.translate.min.pojo;

public class LiveinInfo
{
	private int id;
	private String username;
	private String realname;
	private String phonenumber;
	private String mailbox;
	private String translationcoin;
	private String fans;
	private String liveindate;
	private String translationlevel;
	private String detailinfo;
	
	public LiveinInfo()
	{
		// TODO Auto-generated constructor stub
	}
	public LiveinInfo(int id,String username,String realname,String phonenumber,
			String mailbox,String translationcoin,String fans,String liveindate,
			String translationlevel)
	{
		this.id = id;
		this.username = username;
		this.realname = realname;
		this.phonenumber = phonenumber;
		this.mailbox = mailbox;
		this.translationcoin = translationcoin;
		this.fans = fans;
		this.liveindate = liveindate;
		this.translationlevel = translationlevel;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getRealname()
	{
		return realname;
	}
	public void setRealname(String realname)
	{
		this.realname = realname;
	}
	public String getPhonenumber()
	{
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	public String getMailbox()
	{
		return mailbox;
	}
	public void setMailbox(String mailbox)
	{
		this.mailbox = mailbox;
	}
	public String getTranslationcoin()
	{
		return translationcoin;
	}
	public void setTranslationcoin(String translationcoin)
	{
		this.translationcoin = translationcoin;
	}
	public String getFans()
	{
		return fans;
	}
	public void setFans(String fans)
	{
		this.fans = fans;
	}
	public String getLiveindate()
	{
		return liveindate;
	}
	public void setLiveindate(String liveindate)
	{
		this.liveindate = liveindate;
	}
	public String getTranslationlevel()
	{
		return translationlevel;
	}
	public void setTranslationlevel(String translationlevel)
	{
		this.translationlevel = translationlevel;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getDetailinfo()
	{
		return detailinfo;
	}
	public void setDetailinfo(String detailinfo)
	{
		this.detailinfo = detailinfo;
	}
	
}