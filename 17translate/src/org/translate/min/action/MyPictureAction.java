package org.translate.min.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.translate.min.biz.MyInfoBiz;

import com.opensymphony.xwork2.ActionSupport;

public class MyPictureAction extends ActionSupport implements
		ServletRequestAware
{
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
	private HttpServletResponse response;
	private MyInfoBiz myinfobiz;

	public void getMyPhoto() throws Exception
	{
		response = ServletActionContext.getResponse();
		String username = (String)request.getSession().getAttribute("username");
		String imgpath = myinfobiz.getMyPicture(username);
		InputStream is = new FileInputStream(new File(imgpath));
		response.setContentType("image/jpg"); 
		ServletOutputStream sout = response.getOutputStream();
		byte b[] = new byte[is.available()];// 创建byte数组用作缓冲
		if(null != is)
		{
	        is.read(b);
	        System.out.println(b.length);
	        sout.write(b);
	        is.close();
	        sout.flush(); 
	        sout.close(); //关闭输入流
		}
	}

	public void setServletResponse(HttpServletResponse response)
	{
		this.response = response;
	}

	public void setServletRequest(HttpServletRequest request)
	{
		this.request = request;
	}

	public MyInfoBiz getMyinfobiz()
	{
		return myinfobiz;
	}

	public void setMyinfobiz(MyInfoBiz myinfobiz)
	{
		this.myinfobiz = myinfobiz;
	}
	
}