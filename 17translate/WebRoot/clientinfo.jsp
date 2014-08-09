<%@ page language="java" import="java.util.*,org.translate.min.entity.*;" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'freeinfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/clientinfo.css">
	
	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script> 
	<%
		Client clientinfo = (Client)session.getAttribute("myinfo");
		if(clientinfo == null)
			clientinfo = new Client();
		
	 %>
  </head>
  
  <body>
    <div align="center">
    
    	<div class="divone">
    		<jsp:include page="loginHead.html"></jsp:include>	
    	</div>

    	<div class="divtwo">
    	
    		<div class="two_partone">
    			<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
				 <div class="b d1 h">
				 	<div class="divimg">
				 		<img id="myimg" src="images/daren.jpg"/>
				 		<form action="">
				 			<input  type="button" class="button" id="img" name="img" value="上传照片"/>
				 		</form>
				 	</div>
				 	<div class="divname">
				 		<table style="width: 180px;margin-top: 2px;">
				 			<tr>
				 				<td colspan="2" style="color:#008B8B"><a href="#" style="font-weight: bold;"><%=clientinfo.getUserName() %></a></td>
				 			</tr>
				 			<tr>
				 				<td>姓名：</td>
				 				<td><%=clientinfo.getClintName() %></td>
				 			</tr>
				 			<tr>
				 				<td>电话:</td>
				 				<td><%=clientinfo.getPhoneNumber() %></td>
				 			</tr>

				 			<tr>
				 				<td colspan="2" style="height:20px;">邮箱：</td>
				 			</tr>
				 			<tr>
				 				<td colspan="2" style="height:20px"><%=clientinfo.getMailBox() %></td>
				 			</tr>
				 		</table>
				 	</div>
				    <div class="items">

				    	<div id="item">
				    		<span class="word"><a href="#">我的资料</a></span>
				    	</div>
				    	<div id="item">
				    		<span class="word"><a href="#">我的通知</a></span>
				    	</div>
				    	<div id="item">
				    		<span class="word word3"><a href="#">已完成订单</a></span>
				    	</div>
				    	<div id="item">
				    		<span class="word word3"><a href="#">未完成订单</a></span>
				    	</div>
				    	
				    </div>
				 </div>
    			<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    			
    						
    		</div>


    		<div class="two_parttwo">
    			<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
				 <div class="b d1 k">
				 	
				 	<div class="detialinfo">
				 		<div style="width:100%;height:40px;line-height: 40px;text-align: left;border-bottom: 1px dotted rgb(210,210,210);">
				 			<span class="word" style="margin-left:10px;">我的资料</span>
				 			<span class="word1" style="light-height:40px;margin-left: 428px;"><a href="joinus.jsp">修改资料</a></span>
				 			<span class="word1" style="light-height:40px;margin-left: 4px;"><a href="joinus.jsp">修改密码</a></span>
				 		</div>
				 		<div class="infoitem">
				 			<span class="word" style="margin-left:10px;float: left;color: gray;font-size: 12px;">真实姓名:</span>
				 			<span class="word" style="margin-left:50px;float: left;color: gray;font-size: 12px;"><%=clientinfo.getClintName() %></span>
				 		</div>
				 		<div class="infoitem">
				 			<span class="word" style="margin-left:10px;float: left;color: gray;font-size: 12px;">电话号码:</span>
				 			<span class="word" style="margin-left:50px;float: left;color: gray;font-size: 12px;"><%=clientinfo.getPhoneNumber() %></span>
				 		</div>
				 		<div class="infoitem">
				 			<span class="word" style="margin-left:10px;float: left;color: gray;font-size: 12px;">电子邮箱:</span>
				 			<span class="word" style="margin-left:50px;float: left;color: gray;font-size: 12px;"><%=clientinfo.getMailBox() %></span>
				 		</div>
				 		<div class="infoitem">
				 			<span class="word" style="margin-left:10px;float: left;color: gray;font-size: 12px;">学校名称:</span>
				 			<span class="word" style="margin-left:50px;float: left;color: gray;font-size: 12px;"><%=clientinfo.getSchoolName() %></span>
				 		</div>
				 	</div>
				 </div>
    			<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    		</div>
    	
    	
    	
    	</div>

    	<div class="divthree">
    		<div class="partone">
				<ul>
					<li>Copyright © 2014 17translate.com  |  <a href="#">服务条款</a>  |  <a href="#">隐私政策</a></li>
					<li><a href="#">使用翻译吧前必读 </a></li>
					<li>湖南新新翻译有限公司 </li>
					<li>湘ICP证10000013号  湘公网安备11010502025099号 </li>
				</ul>
			
			</div>
			<div class="parttwo">
				<span><a href="placeOrder.jsp">自助下单</a> | <a href="#">关于我们 </a> |  <a href="joinus.jsp">加入我们</a>  |  <a href="#">联系我们</a>  |  <a href="#">意见反馈</a></span> 
			</div>
    	</div>
    
    
    
    </div>
  </body>
</html>
