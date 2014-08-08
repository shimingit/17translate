<%@ page language="java" import="java.util.*,org.translate.min.entity.News,org.translate.min.entity.PublicNewsId" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'recomendNews.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">




	
	<link rel="stylesheet" type="text/css" href="css/originArticle.css">
	<link  rel="stylesheet" type="text/css" href="css/xuanfustyle.css">
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
	
	$("#top").click(function() {
		$('body,html').animate({
			scrollTop: 0
		},
		1000);
		return false;
	});
	$(".language").click(function()
	{
		$(".language").css("background","#DCDCDC");
		$(".language span").css("color","rgb(97,97,51)");
		$(this).css("background","#6495ED");
		$(this).children().css("color","white");
	});
	$(".language").mouseenter(function()
	{
		$(this).css("border","2px solid #DCDCDC");
	});
	$(".language").mouseleave(function()
	{
		$(this).css("border","");
	});
	$(".articletype").click(function()
	{
		$(".articletype span").css("color","rgb(97,97,51)");
		$(".articletype").css("background","#DCDCDC");
		$(this).css("background","#6495ED");
		$(this).children().css("color","white");
	});
	$(".articletype").mouseenter(function()
	{
		$(this).css("border","2px solid #DCDCDC");
	});
	$(".articletype").mouseleave(function()
	{
		$(this).css("border","");
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

    <div class="divtwo">
    	
    	<div class="two_part01" >
	    	<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
				<div class="b d1 k" style="overflow: auto">
					
					
				
			
						&nbsp;&nbsp;<%=thisnews.getNewContent() %>					
	
					
					
				</div>
			<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    	</div>
    	
    	<div class="two_part02" >
    		
    		<div id="types">
    		
    			<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
				<div class="b d1 h">
					<div class="d01">
							<div style="width:100%;height:27px;border-bottom:1px solid lightgray;text-align: left;margin-top: 2px">
								<span style="font-size: 15;font-weight: bold;color:#A9A9A9;margin-left:10px">文章信息</span>
							</div>
							<div style="width:97%;height:260px;">
								
								
								<div class="info">
								 
								   <div class="item" style="height: 20px">
								   		<span class="word1" >标题：</span>
								   </div>
								   <div class="item">
								   		<span class="word1" style="font-size: 15px;color:rgb(110,110,110)"><%=thisnews.getNewTitle() %></span>
								   </div>
								   <div class="item" style="height: 20px">
								   		<span class="word1" >作者：<span style="color:rgb(110,110,110)"><%=thisnews.getAuthor() %></span></span>
								   </div>
								   <div class="item">
								   		<span class="word1">原文语言：<span style="color:rgb(110,110,110)"><%=thisnews.getLanguage().getLanguageName() %></span>&nbsp;&nbsp;所属领域：<span style="color:rgb(110,110,110)"><%=thisnews.getFromField() %></span></span>
								   </div>
								   <div class="item" style="height: 20px">
								   		<span class="word1" >原文链接：</span>
								   </div>
								   <div class="item">
								   		<span><a href="<%=thisnews.getNetLink() %>" style="color:rgb(110,110,110)"><%=thisnews.getNetLink() %></a></span>
								   </div>
								   <div class="item">
								   		<span class="word1" >简介：</span>
								   </div>
								   <div class="item" style="height:80px;overflow: auto">
										<span class="word1" style="color:rgb(110,110,110)"><%=thisnews.getDescription() %></span>
								   </div>
								</div>
								
								<div id="search1">
									 <a href="translate.jsp" class="button1 blue medium"><span style="color: white;">开始翻译</span></a> 
					    		</div>	
							</div>
					</div>
				
    		</div>
    		<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    	</div>
    
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
	</div>
  </body>
</html>
