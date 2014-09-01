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
		 // ��ȡparams.properties�����õĲ���  
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
        // δ����appid��appsecretʱ������ʾ  
        if ("".equals(TokenThread.appid) || "".equals(TokenThread.appsecret))
        {  
        } 
        else
        {  
            // ������ʱ��ȡaccess_token���߳�  
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
	        // ʱ���  
	         String timestamp = request.getParameter("timestamp");  
	        // �����  
	         String nonce = request.getParameter("nonce");  
	        // ����ַ���  
	         String echostr = request.getParameter("echostr");  
	  
	         PrintWriter out = response.getWriter();  
	        // ͨ������signature���������У�飬��У��ɹ���ԭ������echostr����ʾ����ɹ����������ʧ��  
	         if (SignUtil.checkSignature(signature, timestamp, nonce)) 
	         {  
	             out.print(echostr);  
	         } 
	         out.close();  
	         out = null;  
		}
		else if("POST".equals(method))
		{
			// ��������Ӧ�ı��������ΪUTF-8����ֹ�������룩  
	        request.setCharacterEncoding("UTF-8");  
	        response.setCharacterEncoding("UTF-8"); 
	        // ���ú���ҵ���������Ϣ��������Ϣ  
	        String respMessage = CoreService.processReqquest(request);  
	        // ��Ӧ��Ϣ  
	        PrintWriter out = response.getWriter();  
	        out.print(respMessage);  
	        out.close(); 
	        out = null; 
		}		
		return SUCCESS;
	}
}
