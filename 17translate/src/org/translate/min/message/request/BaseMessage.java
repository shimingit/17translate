package org.translate.min.message.request;

public class BaseMessage
{
	//开发者微信号
	private String toUserName;
	//发送方账号（一个openID)
	private String fromUserName;
	//消息创建时间
	private long creatTime;
	//消息类型（text/image/location/link)
	private String messageType;
	//消息 id，64位整数
	private long messageId;
	public String getToUserName()
	{
		return toUserName;
	}
	public void setToUserName(String toUserName)
	{
		this.toUserName = toUserName;
	}
	public String getFromUserName()
	{
		return fromUserName;
	}
	public void setFromUserName(String fromUserName)
	{
		this.fromUserName = fromUserName;
	}
	public long getCreatTime()
	{
		return creatTime;
	}
	public void setCreatTime(long creatTime)
	{
		this.creatTime = creatTime;
	}
	public String getMessageType()
	{
		return messageType;
	}
	public void setMessageType(String messageType)
	{
		this.messageType = messageType;
	}
	public long getMessageId()
	{
		return messageId;
	}
	public void setMessageId(long messageId)
	{
		this.messageId = messageId;
	}
	
}
