<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'payfee.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<%
		int totalwords = Integer.parseInt(request.getParameter("totalwords"));
		float totalcost = Float.parseFloat(request.getParameter("totalcost"));
		String origin = request.getParameter("origin");
		String object = request.getParameter("object");
		
		
	 %>
  </head>
  
  <body>
    <%=totalwords %>
    <%=totalcost %>
    <%=origin %>
    <%=object %>
  </body>
</html>
