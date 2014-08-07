<%@ page language="java" import="java.util.*,org.translate.min.entity.News" pageEncoding="UTF-8"%>
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
	
	
	<link type='text/css' href='css/confirm.css' rel='stylesheet' media='screen' />
	<script src='js/jquery.simplemodal.js' type='text/javascript'></script>
	<script src='js/confirm.js' type='text/javascript'></script>
	
	
	<link rel="stylesheet" type="text/css" href="css/prompt.css">
	<link  rel="stylesheet" type="text/css" href="css/xuanfustyle.css">
	<link  rel="stylesheet" type="text/css" href="css/translate.css">
	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script> 
	<script type="text/javascript" src="js/jquery.prompt.js"></script>
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
		
		$("#savedraft").click(function()
		{
			var drafttitle = $("#drafttitle").val();
			var draftdescription = $("#draftdescription");
			var newsid = $("#originnewsid").val();
			var articlecontent = $("#wysiwyg").val();
			
			$.ajax({  
            url: 'draftnews',  
            type: 'post',  
            data: {drafttitle:drafttitle,draftdescription:draftdescription,originnewsid:newsid,articlecontent:articlecontent},  
            success: function(data)
					{
						//var dataObj = eval("(" + data +")");
						if(data.isSaveOk == "ok")
						{
							var def = {
										content:"<span style='font-weight:bold;'>您的翻译草稿保存成功！</span>",
										time:1000
									   };
							$.Prompt(def);
							$.Prompt();
						}
						else
						{
							var def = {
										content:"<span style='font-weight:bold;'>对不起，您的草稿保存失败！</span>",
										time:1000
									   };
							$.Prompt(def);
							$.Prompt();
						}
					}
                 }); 
           return false;
		});
		
});
function showEWM(){
			document.getElementById("EWM").style.display = 'block';
		}
	function hideEWM(){
		document.getElementById("EWM").style.display = 'none';
	}
</script>
<%
	News thisnews = (News)session.getAttribute("thisnews");
 %>
  </head>
  
  <body>
	  <div align="center">
	    <div class="divone">
    		<jsp:include page="loginHead.html"></jsp:include>
    	</div>
    	
    	
	    <div class='divtwo'>
	    <form name="submitnews" action="submittnews" method="post">
	    	<div class="info">
	    		<input type="hidden" id="originnewsid" name="originnewsid" value="<%=thisnews.getNewId()%>"/>
					<div class="b d1 k">
						<div class="art word" style="font-size: 16px;color:black">译文信息</div>
						<div>
								<div class="infocont"><span class="word">链接:</span><input type="text" id="link" name="link" value="<%=thisnews.getNetLink() %>" style="height:35px;width:350px" disabled="disabled"/></div>
								<div class="infocont" style="float:right"><span class="word" style="color:black">标题简介译文</span><img src="images/fanyiarrow2.png" style="height:40px;width:40px"/></div>
						</div>
						<div>
							<div class="infocont"><span class="word">标题:</span><input type="text" id="title" name="title" style="height:35px;width:350px" disabled="disabled"/></div>
							<div class="infocont" style="float:right"><span class="word">标题:</span><input type="text" id="drafttitle" name="drafttitle" value="<%=thisnews.getNewTitle() %>" style="height:35px;width:350px"/></div>
						</div>
					
						<div>
							<div class="infocont" style="height:78px"><span class="word">简介:</span><textarea class="word" id="description" name="description" style="height:73px;width:350px;vertical-align: middle;" disabled="disabled"/></textarea></div>
							<div class="infocont" style="height:78px;float: right"><span class="word">简介:</span><textarea class="word" id="draftdescription" name="draftdescription" style="height:73px;width:350px;vertical-align: middle;"/><%=thisnews.getDescription() %></textarea></div>
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
								<input class="but" type="button" id="savedraft" name="save" value="保存草稿">
							</div>
						</div>
						
						<div class="objectarticle">
							<div class="art word" style="font-size: 16px;color:black">译文</div>
								<%@include file="textedit.html" %>
							</div>
							<div class="oribun" style="text-align: right;">
								
								<input class="but" type="button" id="submitnews" name="submitnews" value="提交译文" style="margin-right:13px">
								
								
							</div>
							
							<div id='confirm' style='display:none;'>
								<a href='#' title='Close' class='modalCloseX simplemodal-close'>x</a>
								<div class='header'><span>确认</span></div>
								<p class='message'></p>
								<div class='buttons'>
								<div class='no simplemodal-close'>是</div><div class='yes'>否</div>
							</div>
							
						</div>
				<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>	
	    	</div>
	    
	     </form>
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
