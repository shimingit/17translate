package org.translate.min.message.response;

public class Article
{
	//图文消息名称
	private String title;
	//图文消息描述
	private String description;
	//图片链接，支持jpg,png格式，较好的效果为大图640*320，小图80*80，限制图片链接的域名需要与开发者填写的基本资料中的Url一致  
	private String pictureUrl;
	//点击图文消息跳转链接
	private String url;
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public String getPictureUrl()
	{
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl)
	{
		this.pictureUrl = pictureUrl;
	}
	public String getUrl()
	{
		return url;
	}
	public void setUrl(String url)
	{
		this.url = url;
	}
	
	
}
