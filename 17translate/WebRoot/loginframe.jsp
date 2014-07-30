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
<style type="text/css">

	.shadow{
		background: #cccccc;
		position: relative;
		width:60%;
	}
	.shadow .content{
		background: #f0fff0;
		padding:2px;
		height:360px;
	  position: relative;
	  top:-3px;
	  left:-2px;
	  border:0.5px solid lightgray;
	}
	.shadow .login{
		border-right:1px solid lightgray;
		width: 50%;
		height:auto;
		margin-top:20px;
		float: left;
	}
	.shadow .weixin{
	width: 49%;
	height:250px;
	float:right;
	
	}
  </style>
  </head>
  
  <body>
  <div align="center">
  <div class="shadow">
    <div class="content">
	    <div class="login">
	   	 <jsp:include page="login.html"></jsp:include>
	    </div>
	    <div class="weixin">
	    	<img  src="images/weixin.jpg" style="width: 130px;height: 130px;margin-top: 80px">
	    	<div>微信扫描二维码登录</div>
	    	<div style="border:width:150px; height:60px;margin-top:10px">
               	<span style="font-size:15px">微信账号登录</span><a href="#"><img src="images/weixinlogo.jpg" style="width:50px;height:50px;margin-left:10px"/></a>
            </div>
	    </div>
        </div>
    
  </div>
  </div>
  </body>
</html>
