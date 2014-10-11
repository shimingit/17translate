package org.translate.min.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.LiveinTranslatorBiz;
import org.translate.min.pojo.IdentifyRequestInfo;
import org.translate.min.pojo.LiveinInfo;

import com.opensymphony.xwork2.ActionSupport;

public class BgIdentifyRequestAction extends ActionSupport implements RequestAware,SessionAware
{

	private static final long serialVersionUID = 1L;
	
	private String page;
	private String rows;
	private String total;
	private String searchKey;
	private String searchValue;
	
	private LiveinTranslatorBiz ltlb;
	private Map<String, Object> session;

	private Map<String, Object> request;

	
	public void getIdentifyRequest()
	{
		System.out.println("page:" + page + " rows:" + rows + " searchKey:" + searchKey + " searchValue:" + searchValue);
		List<IdentifyRequestInfo> liveinlist = ltlb.getIdentifyRequest(page, rows, searchKey, searchValue);
		total = String.valueOf(ltlb.getRequestTotal());
		
		JSONArray jsonObj = JSONArray.fromObject(liveinlist);
		HttpServletResponse response = ServletActionContext.getResponse();
		try
		{
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			JSONObject result=new JSONObject();
			result.put("rows", jsonObj);
			result.put("total", total);
			out.print(result.toString());
			out.flush();
			out.close();
		} catch (IOException e)
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

	public void setPage(String page)
	{
		this.page = page;
	}

	public void setRows(String rows)
	{
		this.rows = rows;
	}

	public String getTotal()
	{
		return total;
	}

	public void setTotal(String total)
	{
		this.total = total;
	}

	public String getRows()
	{
		return rows;
	}

	public String getPage()
	{
		return page;
	}

	public String getSearchKey()
	{
		return searchKey;
	}

	public void setSearchKey(String searchKey)
	{
		this.searchKey = searchKey;
	}

	public String getSearchValue()
	{
		return searchValue;
	}

	public void setSearchValue(String searchValue)
	{
		this.searchValue = searchValue;
	}
	
}
 