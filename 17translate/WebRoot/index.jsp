<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/prompt.css">
	<link type='text/css' href='css/confirm.css' rel='stylesheet' media='screen' />
	
	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
	<script type="text/javascript" src="js/jquery.prompt.js"></script>
	<script src='js/jquery.simplemodal.js' type='text/javascript'></script>
	<script src='js/confirm.js' type='text/javascript'></script>
	<script type="text/javascript">
		$(document).ready(function()
		{
			var def = {
					content:"<span style='font-weight:bold;'>您的翻译草稿保存成功！</span>",
					time:1000
				};
				$.Prompt(def);
				$.Prompt();
		});
	
	</script>
  </head>
  
  <body>
<div  style="height: 110px">
<form name="submitnews" action="fanyi" method="post">
	<input class="but" type="button" id="submitnews" name="submitnews" value="提交译文" style="margin-right:13px">
</form>
</div>
<div id='confirm' style='display:none;'>
	<a href='#' title='Close' class='modalCloseX simplemodal-close'>x</a>
	<div class='header'><span>确认</span></div>
	<p class='message'></p>
	<div class='buttons'>
	<div class='no simplemodal-close'>否</div><div class='yes'>是</div>
</div>
</div> 







</body>
</html>
