package org.translate.min.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Client entity. @author MyEclipse Persistence Tools
 */

public class Client implements java.io.Serializable
{

	// Fields

	private Integer clientId;
	private String userName;
	private String password;
	private String mailBox;
	private String clintName;
	private String phoneNumber;
	private String schoolName;
	private Set orders = new HashSet(0);
	private Set news = new HashSet(0);

	// Constructors

	/** default constructor */
	public Client()
	{
	}

	/** minimal constructor */
	public Client(String userName, String password, String mailBox)
	{
		this.userName = userName;
		this.password = password;
		this.mailBox = mailBox;
	}

	/** full constructor */
	public Client(String userName, String password, String mailBox,
			String clintName, String phoneNumber, String schoolName,
			Set orders, Set news)
	{
		this.userName = userName;
		this.password = password;
		this.mailBox = mailBox;
		this.clintName = clintName;
		this.phoneNumber = phoneNumber;
		this.schoolName = schoolName;
		this.orders = orders;
		this.news = news;
	}

	// Property accessors

	public Integer getClientId()
	{
		return this.clientId;
	}

	public void setClientId(Integer clientId)
	{
		this.clientId = clientId;
	}

	public String getUserName()
	{
		return this.userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getMailBox()
	{
		return this.mailBox;
	}

	public void setMailBox(String mailBox)
	{
		this.mailBox = mailBox;
	}

	public String getClintName()
	{
		return this.clintName;
	}

	public void setClintName(String clintName)
	{
		this.clintName = clintName;
	}

	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getSchoolName()
	{
		return this.schoolName;
	}

	public void setSchoolName(String schoolName)
	{
		this.schoolName = schoolName;
	}

	public Set getOrders()
	{
		return this.orders;
	}

	public void setOrders(Set orders)
	{
		this.orders = orders;
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