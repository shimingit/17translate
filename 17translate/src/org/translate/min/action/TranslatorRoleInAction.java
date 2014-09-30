package org.translate.min.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.LiveinTranslatorBiz;

import com.opensymphony.xwork2.ActionSupport;

public class TranslatorRoleInAction extends ActionSupport implements RequestAware,SessionAware
{

	private static final long serialVersionUID = 1L;

	private String realname;
	private File certificate;
	private String certificatefm;
	private File[] zhengjian;
	private String[] zhengjianfm;
	private String phonenumber;
	private String ensureinfo;
	
	private LiveinTranslatorBiz ltlb;
	private Map<String, Object> session;

	private Map<String, Object> request;

	public void dealrolein() 
	{
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		Writer out = null;
		InputStream certificateis = null;
		InputStream[] zhengjianis = null;
		try
		{
			out = response.getWriter();
			if(certificate == null)
			{
				out.write("<script>alert('请选择一张身份证正面照片!');history.back(-1);</script>");
				return;
			}
			else
			{
				certificateis = new FileInputStream(certificate);
				
				if(certificateis.available() / 1024 / 1024 > 2)
				{
					out.write("<script>alert('身份证正面图太大，请重新选择！');history.back(-1);</script>");
					return;
				}
			}
			if(null == zhengjian || 0 == zhengjian.length)
			{
				out.write("<script>alert('请选择要至少一张证件照片！');history.back(-1);</script>");
				return;
			}
			else
			{
				zhengjianis = new FileInputStream[zhengjian.length];
				int i = 0;
				for(File file : zhengjian)
				{
					zhengjianis[i] = new FileInputStream(file);
					if(zhengjianis[i].available() / 1024 / 1024 > 2)
					{
						out.write("<script>alert('证件照片太大，请从新选择！');history.back(-1);</script>");
						return;
					}
					++i;
				}
			}
		} catch (IOException e1)
		{
			e1.printStackTrace();
		}
		
		//获取当前登录用户的账号密码
		String username = (String) session.get("username");
		String[] zhengjianpath = new String[zhengjianfm.length];
		String directory = "../webapps/17translate/imgrepository/" + username;
		
		String certificatepath = "_certificate_" + certificatefm.substring(certificatefm.lastIndexOf("."));
		
		
		for(int i = 0; i < zhengjianfm.length; i++)
		{
			zhengjianpath[i] = "_zhengjian_" + i + zhengjianfm[i].substring(zhengjianfm[i].lastIndexOf("."));
		}
		
		File file = new File(directory);
		if(!file.exists())
			file.mkdir();
		
		String renzhengdirectory = directory + "/renzheng/";
		
		file = new File(renzhengdirectory);
		if(!file.exists())
			file.mkdir();
		
		String certificateimg = renzhengdirectory + certificatepath;
		
		System.out.println(certificateimg);
		
		File certificateimgfile = new File(certificateimg);
		
		try
		{
			
			OutputStream certificateos = new FileOutputStream(certificateimgfile);
			
			byte[] b = new byte[100];
			
			int len = 0;
			while((len = certificateis.read(b)) != -1)
			{
				certificateos.write(b, 0, len);
			}
			certificateis.close();
			certificateos.flush();
			certificateos.close();
			
			boolean  flag = ltlb.addImgPath(username, certificateimg, "identifycard");
			
			if(flag == false)
			{
				out.write("<script>alert('身份证正面图插入失败！');history.back(-1);</script>");
				return;
			}
			OutputStream[] zjopf = new FileOutputStream[zhengjianpath.length];
			for(int i = 0; i < zhengjianpath.length; i++)
			{
				String path = renzhengdirectory + zhengjianpath[i];
				zjopf[i] = new FileOutputStream(path);
				
				System.out.println(path);
				
				byte[] b2 = new byte[100];
				int len2 = 0;
				
				while((len2 = zhengjianis[i].read(b2)) != -1)
				{
					zjopf[i].write(b2, 0, len2);
				}
				
				zhengjianis[i].close();
				zjopf[i].flush();
				zjopf[i].close();
				
				flag = ltlb.addImgPath(username, path, "certificate");
				
				if(flag == false)
				{
					out.write("<script>alert('证件图片插入失败！');history.back(-1);</script>");
					return;
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

	public void setRequest(Map<String, Object> request)
	{
		this.request = request;
	}

	public void setLtlb(LiveinTranslatorBiz ltlb)
	{
		this.ltlb = ltlb;
	}

	public String getRealname()
	{
		return realname;
	}

	public void setRealname(String realname)
	{
		this.realname = realname;
	}

	public File getCertificate()
	{
		return certificate;
	}

	public void setCertificate(File certificate)
	{
		this.certificate = certificate;
	}

	public File[] getZhengjian()
	{
		return zhengjian;
	}

	public void setZhengjian(File[] zhengjian)
	{
		this.zhengjian = zhengjian;
	}

	public String[] getZhengjianfm()
	{
		return zhengjianfm;
	}

	public void setZhengjianfm(String[] zhengjianfm)
	{
		this.zhengjianfm = zhengjianfm;
	}

	public String getPhonenumber()
	{
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}

	public String getEnsureinfo()
	{
		return ensureinfo;
	}

	public void setEnsureinfo(String ensureinfo)
	{
		this.ensureinfo = ensureinfo;
	}

	public String getCertificatefm()
	{
		return certificatefm;
	}

	public void setCertificatefm(String certificatefm)
	{
		this.certificatefm = certificatefm;
	}
	
}