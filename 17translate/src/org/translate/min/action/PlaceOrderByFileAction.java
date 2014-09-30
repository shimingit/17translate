package org.translate.min.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.PlaceOrderBiz;
import org.translate.min.util.ArticleUtil;

import com.opensymphony.xwork2.ActionSupport;

public class PlaceOrderByFileAction extends ActionSupport implements ServletRequestAware,SessionAware
{

	private static final long serialVersionUID = 1L;
	
	private String ufilename;
	private String uoriginlanguage;
	private String uobjectlanguage;
	private String ufromfield;
	private Map<String, Object> session;
	private HttpServletRequest request;
	private PlaceOrderBiz pob;
	private File articlefile;
	private String latestdate;
	
	private int wordcount;
	private float cost;
	private String orderId;
	
	
	public String dealPlaceOrder()
	{
		String username = (String)session.get("username");
//		System.out.println(username+">"+ufilename+">"+uoriginlanguage+">"+uobjectlanguage+">"+ufromfield+">"+articlefile.getName());
		System.out.println(latestdate);
		orderId = ArticleUtil.getOrderIdByUUId();
		
	//	pob.dealPlaceorder(username, uoriginlanguage, uobjectlanguage, ufromfield, wordcount, cost, orderId,);
		
		
		String directory = "../webapps/17translate/filerepository/" + username;
		File file = new File(directory);
		ufilename = orderId + ufilename.substring(ufilename.lastIndexOf("."));
		
		
		if(!file.exists())
			file.mkdir();
//		
		String fullpath = directory + "/in" + ufilename;
		String outpath = directory + "/out" + orderId+".pdf";
		
//		HttpServletResponse response = ServletActionContext.getResponse();
		try
		{   
			InputStream in = new FileInputStream(articlefile);
			
			StringBuffer contentbuffer = new StringBuffer();
			
			File imgfile = new File(fullpath);
			if(imgfile.exists())
			{
				imgfile.delete();
				imgfile.createNewFile();
			}
			OutputStream os = new FileOutputStream(imgfile);
			int len = 0;
			byte[] b = new byte[1024];
			
			while((len = in.read(b)) != -1)
			{
				os.write(b);
				contentbuffer.append(new String(b,0,len));
			}
			in.close();
			os.flush();
			os.close();
			
			wordcount = ArticleUtil.countwords(uoriginlanguage, contentbuffer.toString());
			cost = ArticleUtil.conutcost(wordcount, uoriginlanguage, uobjectlanguage);
			
			//System.out.println("content:"+ contentbuffer.toString()+" wordcount:" + wordcount+" cost:"+cost);
			
			
			boolean flag = pob.dealPlaceorder(username, uoriginlanguage, uobjectlanguage, ufromfield, wordcount, cost,latestdate, orderId, fullpath,outpath);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return SUCCESS;
	}

	public void setSession(Map<String, Object> session)
	{
		this.session = session;
	}
	

	public PlaceOrderBiz getPob()
	{
		return pob;
	}

	public void setPob(PlaceOrderBiz pob)
	{
		this.pob = pob;
	}

	public void setServletRequest(HttpServletRequest request)
	{
		this.request = request;
	}

	public String getUfilename()
	{
		return ufilename;
	}

	public void setUfilename(String ufilename)
	{
		this.ufilename = ufilename;
	}

	public String getUoriginlanguage()
	{
		return uoriginlanguage;
	}

	public void setUoriginlanguage(String uoriginlanguage)
	{
		this.uoriginlanguage = uoriginlanguage;
	}

	public String getUobjectlanguage()
	{
		return uobjectlanguage;
	}

	public void setUobjectlanguage(String uobjectlanguage)
	{
		this.uobjectlanguage = uobjectlanguage;
	}

	public String getUfromfield()
	{
		return ufromfield;
	}

	public void setUfromfield(String ufromfield)
	{
		this.ufromfield = ufromfield;
	}

	public File getArticlefile()
	{
		return articlefile;
	}

	public void setArticlefile(File articlefile)
	{
		this.articlefile = articlefile;
	}

	public int getWordcount()
	{
		return wordcount;
	}

	public void setWordcount(int wordcount)
	{
		this.wordcount = wordcount;
	}

	public float getCost()
	{
		return cost;
	}

	public void setCost(float cost)
	{
		this.cost = cost;
	}

	public String getOrderId()
	{
		return orderId;
	}

	public void setOrderId(String orderId)
	{
		this.orderId = orderId;
	}

	public String getLatestdate()
	{
		return latestdate;
	}

	public void setLatestdate(String latestdate)
	{
		this.latestdate = latestdate;
	}
	
	
}
