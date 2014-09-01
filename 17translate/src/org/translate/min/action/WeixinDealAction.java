package org.translate.min.action;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import org.apache.struts2.ServletActionContext;
import org.translate.core.service.CoreService;
import org.translate.min.thread.TokenThread;
import org.translate.min.util.SignUtil;

import com.opensymphony.xwork2.ActionSupport;

public class WeixinDealAction extends ActionSupport
{

	private static final long serialVersionUID = 1L;
	
	public WeixinDealAction()
	{
		System.out.println("WeixinDealAction constractor");
		 // 获取params.properties中配置的参数  
		Properties property = new Properties();
		try
		{
			
			property.load(new FileInputStream("../webapps/17translate/WEB-INF/classes/params.properties"));
			TokenThread.appid = property.getProperty("appid");
			TokenThread.appsecret = property.getProperty("appsecret");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
        // 未配置appid、appsecret时给出提示  
        if ("".equals(TokenThread.appid) || "".equals(TokenThread.appsecret))
        {  
        } 
        else
        {  
            // 启动定时获取access_token的线程  
        	new Thread(new TokenThread()).start(); 
        	
        }  
	}
	
	public String dealPostAndGet() throws Exception
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		
		String method = request.getMethod();

		System.out.println("request method:"+method);
		if("GET".equals(method))
		{
			 String signature = request.getParameter("signature");  
	        // 时间戳  
	         String timestamp = request.getParameter("timestamp");  
	        // 随机数  
	         String nonce = request.getParameter("nonce");  
	        // 随机字符串  
	         String echostr = request.getParameter("echostr");  
	  
	         PrintWriter out = response.getWriter();  
	        // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败  
	         if (SignUtil.checkSignature(signature, timestamp, nonce)) 
	         {  
	             out.print(echostr);  
	         } 
	         out.close();  
	         out = null;  
		}
		else if("POST".equals(method))
		{
			// 将请求、响应的编码均设置为UTF-8（防止中文乱码）  
	        request.setCharacterEncoding("UTF-8");  
	        response.setCharacterEncoding("UTF-8"); 
	        // 调用核心业务类接收消息、处理消息  
	        String respMessage = CoreService.processReqquest(request);  
	        // 响应消息  
	        PrintWriter out = response.getWriter();  
	        out.print(respMessage);  
	        out.close(); 
	        out = null; 
		}		
		return SUCCESS;
	}
}
