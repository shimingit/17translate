package org.translate.core.service;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.translate.min.message.response.TextMessage;
import org.translate.min.util.MessageUtil;


public class CoreService
{
	/**
	 * 处理微信发来的请求
	 */
	public static String processReqquest(HttpServletRequest request)
	{
		String responseMessage = null;

		//xml请求解析
		try
		{
			//默认返回的文本消息内容
			String responseContent = "请求处理异常，请稍后尝试";
			Map<String, String> requestMap = MessageUtil.parseXml(request);
			//发送方账号（openId）
			String fromUserName = requestMap.get("FromUserName");
			//公众账号
			String toUserName = requestMap.get("ToUserName");
			//消息类型
			String messageType = requestMap.get("MsgType");
			
			//恢复文本消息
			TextMessage textMessage = new TextMessage();  
            textMessage.setToUserName(fromUserName);  
            textMessage.setFromUserName(toUserName);  
            textMessage.setCreatTime(new Date().getTime());  
            textMessage.setMessageType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
            textMessage.setFuncFlag(0); 
			
            // 文本消息  
            if (messageType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {  
                responseContent = "您发送的是文本消息！";  
            }  
            // 图片消息  
            else if (messageType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {  
                responseContent = "您发送的是图片消息！";  
            }  
            // 地理位置消息  
            else if (messageType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {  
                responseContent = "您发送的是地理位置消息！";  
            }  
            // 链接消息  
            else if (messageType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {  
                responseContent = "您发送的是链接消息！";  
            }  
            // 音频消息  
            else if (messageType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) {  
                responseContent = "您发送的是音频消息！";  
            }  
            // 图文消息
            else if (messageType.equals(MessageUtil.RESP_MESSAGE_TYPE_NEWS)) {  
            	responseContent = "您发送的是图文消息！";  
            }  
            // 事件推送  
            else if (messageType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {  
                // 事件类型  
                String eventType = requestMap.get("Event");  
                // 订阅  
                if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {  
                    responseContent = "谢谢您的关注！";  
                }  
                // 取消订阅  
                else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {  
                    // TODO 取消订阅后用户再收不到公众号发送的消息，因此不需要回复消息  
                }  
                // 自定义菜单点击事件  
                else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {  
                	String eventKey = requestMap.get("EventKey");  
                	  
                    if (eventKey.equals("11")) {  
                        responseContent = "天气预报菜单项被点击！";  
                    } else if (eventKey.equals("12")) {  
                        responseContent = "公交查询菜单项被点击！";  
                    } else if (eventKey.equals("13")) {  
                        responseContent = "周边搜索菜单项被点击！";  
                    } else if (eventKey.equals("14")) {  
                        responseContent = "历史上的今天菜单项被点击！";  
                    } else if (eventKey.equals("21")) {  
                        responseContent = "歌曲点播菜单项被点击！";  
                    } else if (eventKey.equals("22")) {  
                        responseContent = "经典游戏菜单项被点击！";  
                    } else if (eventKey.equals("23")) {  
                        responseContent = "美女电台菜单项被点击！";  
                    } else if (eventKey.equals("24")) {  
                        responseContent = "人脸识别菜单项被点击！";  
                    } else if (eventKey.equals("25")) {  
                        responseContent = "聊天唠嗑菜单项被点击！";  
                    } else if (eventKey.equals("31")) {  
                        responseContent = "Q友圈菜单项被点击！";  
                    } else if (eventKey.equals("32")) {  
                        responseContent = "电影排行榜菜单项被点击！";  
                    } else if (eventKey.equals("33")) {  
                        responseContent = "幽默笑话菜单项被点击！";  
                    }    
                }  
            }  
            textMessage.setContent(responseContent);  
            responseMessage = MessageUtil.textMessageToXml(textMessage);  
		} catch (Exception e)
		{
			e.printStackTrace();
		} 
		return responseMessage;
	}
	
}
