package org.translate.min.action;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.translate.min.biz.MyInfoBiz;
import org.translate.min.biz.UtilBiz;
import org.translate.min.entity.FinishedOrder;
import org.translate.min.entity.MyDraft;
import org.translate.min.entity.MyLabel;
import org.translate.min.entity.MyTranslate;
import org.translate.min.entity.Notice;

import com.opensymphony.xwork2.ActionSupport;

public class MyInfoAction extends ActionSupport implements RequestAware,SessionAware
{
	private Map<String, Object> session;
	private Map<String, Object> request;
	private String currentuser;
	private String role;
	private int[] field;
	
	private MyInfoBiz myinfobiz;
	private UtilBiz utilbiz;

	
	private static final long serialVersionUID = 1L;

	public void addBelongsField()
	{
		String username =(String)session.get("username");
		utilbiz.addFieldAllocate(username, field);
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		try
		{
			Writer out = response.getWriter();
			out.write("<script>history.back(-1);" +
					"window.parent.location.href='myinfo';parent.$.XYTipsWindow.removeBox();</script>");
			out.flush();
			out.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public String liveinMyDraft()
	{
		String username = (String)session.get("username");
		
		List<MyDraft> liveindraft =  myinfobiz.getMyDraft(username);
		session.put("liveindraft", liveindraft);
		return SUCCESS;
	}
	public String liveinMyTranslate()
	{
		String username = (String)session.get("username");
		List<MyTranslate> liveintranslate =  myinfobiz.getMyTranslate(username);
		session.put("liveintranslate", liveintranslate);
		return SUCCESS;
	}
	public String liveinMyWallet()
	{
		return SUCCESS;
	}
	
	
	public String freeMyDraft()
	{
		String username = (String)session.get("username");
		
		List<MyDraft> freedraft =  myinfobiz.getMyDraft(username);
		session.put("freedraft", freedraft);
		return SUCCESS;
	}
	public String freeMyTranslate()
	{
		String username = (String)session.get("username");
		List<MyTranslate> freetranslate =  myinfobiz.getMyTranslate(username);
		session.put("freetranslate", freetranslate);
		return SUCCESS;
	}
	public String clientMyNotice()
	{
		String username = (String)session.get("username");
		
		List<Notice> clientnotice =  myinfobiz.getMyNotice(username);
		session.put("clientnotice", clientnotice);
		return SUCCESS;
	}
	public String freeMyNotice()
	{
		String username = (String)session.get("username");
		
		List<Notice> freenotice =  myinfobiz.getMyNotice(username);
		session.put("freenotice", freenotice);
		return SUCCESS;
	}
	public String liveinMyNotice()
	{
		String username = (String)session.get("username");
		
		List<Notice> liveinnotice =  myinfobiz.getMyNotice(username);
		session.put("liveinnotice", liveinnotice);
		return SUCCESS;
	}
	
	public String clientFinishedOrder()
	{
		String clientname = (String)session.get("username");
		List<FinishedOrder> finishedorders = myinfobiz.getFinishedOrder(clientname);
		session.put("finishedorders", finishedorders);
		return SUCCESS;
	}
	public String clientNoFinishedOrder()
	{
		String clientname = (String)session.get("username");
		List<FinishedOrder> nofinishedorders = myinfobiz.getNoFinishedOrder(clientname);
		session.put("nofinishedorders", nofinishedorders);
		return SUCCESS;
	}
	
		
	
	public String dealMyInfo()
	{
		//获取用户名和用户身份
		String username = (String)session.get("username");
		role = (String)session.get("role");
		System.out.println("当前登录用户："+currentuser);
		System.out.println("当前用户身份："+role);
		if(currentuser.equals(username))
		{
			//获取对应客户信息并保存在session中
			Object myinfo = myinfobiz.getMyInfo(username, role).get(0);
			session.put("myinfo", myinfo);
			//System.out.println(myinfobiz.getMyInfo(username, role).size());
			
			if("livein".equals(role))
			{
				List<String> mylabel = myinfobiz.getMyLabel(username);
				List<String> mybelongsfield = myinfobiz.getMyBelongsField(username);
				session.put("mylabel", mylabel);
				session.put("mybelongsfield", mybelongsfield);
			}
		}
		else
		{
			role = "error";
		}
		System.out.println("role:"+role);
		return SUCCESS;
	}
	
	public void setSession(Map<String, Object> session)
	{
		this.session = session;
	}
	public void setRequest(Map<String, Object> request)
	{
		this.request =request;
	}
	public String getRole()
	{
		return role;
	}
	public void setRole(String role)
	{
		this.role = role;
	}

	public void setMyinfobiz(MyInfoBiz myinfobiz)
	{
		this.myinfobiz = myinfobiz;
	}

	public String getCurrentuser()
	{
		return currentuser;
	}

	public void setCurrentuser(String currentuser)
	{
		this.currentuser = currentuser;
	}

	public int[] getField()
	{
		return field;
	}

	public void setField(int[] field)
	{
		this.field = field;
	}
	public void setUtilbiz(UtilBiz utilbiz)
	{
		this.utilbiz = utilbiz;
	}

}
