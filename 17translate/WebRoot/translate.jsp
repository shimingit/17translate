<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'translate.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link  rel="stylesheet" type="text/css" href="css/xuanfustyle.css">
	<link  rel="stylesheet" type="text/css" href="css/translate.css">
	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script> 
<script type="text/javascript">
		$(document).ready(function()
		{
				$(window).scroll(function() {
			if ($(window).scrollTop() > 300) {
				$('#jump li:eq(0)').fadeIn(800);
			} else {
				$('#jump li:eq(0)').fadeOut(800);
			}
		});
	
		$("#top").click(function() 
		{
			$('body,html').animate(
			{
				scrollTop: 0
			},
			1000);
				return false;
		});
		$(".but").mouseover(function()
		{
			$(this).css("background","#FFE4E1");
			$(this).css("border","1px solid #BDB76B");
		});
		$(".but").mouseout(function()
		{
			$(this).css("background","#FFFAF0");
			$(this).css("border","1px solid gray");
		});
		
});
function showEWM(){
			document.getElementById("EWM").style.display = 'block';
		}
	function hideEWM(){
		document.getElementById("EWM").style.display = 'none';
	}
</script>
  </head>
  
  <body>
	  <div align="center">
	    <div class="divone">
    		<jsp:include page="loginHead.html"></jsp:include>
    	</div>
    	
    	
	    <div class='divtwo'>
	    	<div class="info">
	    		
					<div class="b d1 k">
						<div class="art word" style="font-size: 16px;color:black">译文信息</div>
						<div>
								<div class="infocont"><span class="word">链接:</span><input type="text" id="link" name="link" style="height:35px;width:350px" disabled="disabled"/></div>
						</div>
						<div>
							<div class="infocont"><span class="word">标题:</span><input type="text" id="title" name="title" style="height:35px;width:350px" disabled="disabled"/></div>
						</div>
					
						<div>
							<div class="infocont" style="height:78px"><span class="word">简介:</span><textarea class="word" id="description" name="description" style="height:73px;width:350px;vertical-align: middle;" disabled="disabled"/></textarea></div>
						</div>
					</div>
				<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>	
	    	</div>
	    	<div class="content" >
	    		<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
					<div class="b d1 k">
						
						<div class="originarticle">
							<div class="art word" style="font-size: 16px;color:black">原文</div>
							<textarea class="word oricontent" disabled="disabled"></textarea>
							<div class="oribun" >
								<input class="but" type="button" id="cancel" name="cancel" value="取消">
								<input class="but" type="button" id="save" name="save" value="保存草稿">
							</div>
						</div>
						
						<div class="objectarticle">
							<div class="art word" style="font-size: 16px;color:black">译文</div>
								<%@include file="textedit.html" %>
							</div>
							<div class="oribun" style="text-align: right;">
								<input class="but" type="button" id="sum" name="sub" value="提交译文" style="margin-right:13px">
							</div>
						</div>
				<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>	
	    	</div>
	    
	    
	    </div>
	    
	    
	    
	    
	    
	    <div class='divthree'>
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
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    <ul id="jump">
	<li style="display:none;"><a id="top" href="#top"></a></li>
	<li>
		<a id="weixin" href="javascript:void(0)" onmouseover="showEWM()" onmouseout="hideEWM()">
			<div id="EWM">
				<img src="images/weixin.jpg" />
			</div>
		</a>
	</li>

	</ul>
  </body>
</html>
