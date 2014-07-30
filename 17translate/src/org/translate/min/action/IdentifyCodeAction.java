package org.translate.min.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.translate.min.biz.IdentifyCode;

import com.opensymphony.xwork2.ActionSupport;

public class IdentifyCodeAction extends ActionSupport implements
ServletRequestAware, ServletResponseAware
{
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
	private HttpServletResponse response;
	private IdentifyCode code;



public void setServletResponse(HttpServletResponse response)
{
	this.response = response;
}

public void setServletRequest(HttpServletRequest request)
{
	this.request = request;
}

public IdentifyCode getCode()
{
	return code;
}

public void setCode(IdentifyCode code)
{
	this.code = code;
}
public void generateIdentifyCode() throws Exception
{
	code.creatIdentifyCode(request.getSession(), response);
	System.out.println(request.getSession().getAttribute("identifyCode"));
	response.getOutputStream().flush();
	response.getOutputStream().close();
}


}
