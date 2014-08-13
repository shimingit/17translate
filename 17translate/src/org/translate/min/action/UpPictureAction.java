package org.translate.min.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.MyInfoBiz;

import com.opensymphony.xwork2.ActionSupport;

public class UpPictureAction extends ActionSupport implements ServletRequestAware,SessionAware,ServletResponseAware
{

	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> session;
	private HttpServletResponse response;
	private HttpServletRequest request;
	private MyInfoBiz myinfobiz;
	private File picturefile;
	
	public void upLoadPicture()
	{
		//String username = (String)session.get("username");
		String username = "sa";
		try
		{   
			ServletOutputStream out = response.getOutputStream();
			if(null == picturefile)
			{
				   out.println("<script>alert('please select a picture!');history.back(-1);</script>");
			}			
			else
			{
				InputStream in = new FileInputStream(picturefile);
				long imgsize = in.available();//文件大小
				if(((imgsize / 1024)/ 1024) > 2)//不超过2兆
				{
					out.print("<script>alert('the picture size is too large!');history.back(-1);</script>");
				}
				boolean isUpdateOk = myinfobiz.updatePicture(username, in);
				if(isUpdateOk)
				{
					out.println("<script>history.back(-1);window.parent.window.document.getElementById('myimg').src='identifycode?'"+Math.random() +
							";parent.$.XYTipsWindow.removeBox();</script>");
				}
			}
			
			
			
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void setSession(Map<String, Object> session)
	{
		this.session = session;
	}

	public MyInfoBiz getMyinfobiz()
	{
		return myinfobiz;
	}

	public void setMyinfobiz(MyInfoBiz myinfobiz)
	{
		this.myinfobiz = myinfobiz;
	}

	public void setServletResponse(HttpServletResponse response)
	{
		this.response = response;
	}

	public void setServletRequest(HttpServletRequest request)
	{
		this.request = request;
	}

	public File getPicturefile()
	{
		return picturefile;
	}

	public void setPicturefile(File picturefile)
	{
		this.picturefile = picturefile;
	}
	
}
