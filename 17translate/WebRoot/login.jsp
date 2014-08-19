<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
	
	<style type="text/css">
		.divone{
			width:1359.17px;
			height:auto;
		}
		.divtwo{
			width: 1352.34px;
			height: auto;
			margin-top:30px;
			text-align: center;
		}
		.divthree{
			width:956.2px;
			height: 30px;
			margin-top: 10px;
			text-align: center;
			border-top: 1px solid lightgray;
		}
	
	</style>
  </head>
  
  <body>
  <div align="center">
   <div class="divone" >
    
   <jsp:include page="loginHead.html"></jsp:include>
   </div>
   <div class="divtwo" align="center">
   	<jsp:include page="loginframe.jsp"></jsp:include> 
   </div>
   <div class="divthree">
   Copyright © 2014 17translate.com
   
   </div>
   </div>
  </body>
</html>
