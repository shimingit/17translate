package org.translate.min.biz;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public interface IdentifyCode
{
	public void creatIdentifyCode(HttpSession session, HttpServletResponse response)
			throws Exception, Exception;
}
