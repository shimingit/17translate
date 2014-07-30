package org.translate.min.message.response;

public class BaseMessage
{
	//接收方账号（收到的openID)
	private String toUserName;
	//开发者微信号
	private String fromUserName;
	//消息创建时间
	private long creatTime;
	//消息类型(text/music/news)
	private String messageType;
	//位0x0001被标志时，星标刚收到的消息 
	private int funcFlag;
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
	public int getFuncFlag()
	{
		return funcFlag;
	}
	public void setFuncFlag(int funcFlag)
	{
		this.funcFlag = funcFlag;
	}
	
	
	
}
