<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'loginselect.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link type="text/css" href="css/jquery-ui.min.css" rel="stylesheet" />	
	<link type="text/css" href="css/tabstyle.css" rel="stylesheet" />	
	

<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui.min.js"></script>	
	<script type="text/javascript">
		$(function() {
			var tabs1 = $("#tabs")			
			.tabs({collapsible: true})
			.tabs("rotate", 1000); 		
		});				
	</script>
  </head>
  
  <body>
   <div align="center">
    <div id="wrapper" style="width: 100%;">	
	<div id="tabs" style="background:rgba(251, 251, 251, 1);height: auto;border: none">
		<ul>
			<li><a id="a" href="#tabs-1">我是客户</a></li>
			<li><a id="a" href="#tabs-2">我是翻译员</a></li>
		</ul>
		<div id="tabs-1" style="text-align: center;">
				wefgs
		</div>
		<div id="tabs-2">
			fhkigh
		</div>
		
	</div>
</div>
</div>
  </body>
</html>
