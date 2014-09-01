<%@ page language="java" import="java.util.*,org.translate.min.entity.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>领域翻译员</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">




	
	<link rel="stylesheet" type="text/css" href="css/recomendNews.css">
	<link  rel="stylesheet" type="text/css" href="css/xuanfustyle.css">
	<link  rel="stylesheet" type="text/css" href="css/areatranslators.css">
	<link  rel="stylesheet" type="text/css" href="css/translatordetailinfo.css">
	
	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script> 
	
	
	
	
<style type="text/css">
.title,.field,.link{
	width:90%;
	height:25;
	text-align: left;
}
</style>
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
	$("#return").click(function()
	{
		history.go(-1);
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
	LiveinTranslator translatordetailinfo = (LiveinTranslator)session.getAttribute("translatordetailinfo");
	if (null == translatordetailinfo)
		translatordetailinfo = new LiveinTranslator();
	String username = translatordetailinfo.getLuserName();
	String imgpath = basePath + "imgrepository/" + username +  "/" + username + ".jpg";
	System.out.println(imgpath);
 %>
  </head>
  
  <body style='background-color: rgb(255,255,255)'>
	<div align="center">
	
    <div class="divone">
    	<jsp:include page="loginHead.html"></jsp:include>
    
    </div>

    <div class="divtwo">
    	
    	<div class="two_part01">
		<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
				<div class="b d1 k">
					
					<div style="width:100%;height:32px;border-bottom: 1px solid rgb(232,232,232);margin-top:5px;text-align: left"><span class="word" style="margin-left:6px;font-size: 15px;">校园新闻领域翻译员</span>
						<span class="word" style="float: right"><a id="return" href="#">返回</a>&nbsp;&nbsp;&nbsp;&nbsp;</span>
					</div>
					
					
					
				<div style="width:100%;height:712px;text-align: left">
				
					
					<div class="translatordetail">
						<div id="info1">
							<div id="left">
								<img src="<%=imgpath %>" style="height:110px;width:90px;margin: 2px auto 2px 14px;">
								<p class="word" style="font-weight: normal;margin-left:28px "><%=translatordetailinfo.getLuserName() %></p>
								
							</div>
							
							<div id="right">
								<p class="word" style="font-weight: normal">电话号码：<%=translatordetailinfo.getLphoneNumber() %></p>
								<p class="word" style="font-weight: normal">常用邮箱：<%=translatordetailinfo.getLmailBox() %></p>
								<p class="word" style="font-weight: normal">翻译等级：<%=translatordetailinfo.getTranslationLevel() %></p>
								<p> 
									<input class="button" type="submit" value="找TA翻译" style="padding: 6px">
									<input class="button" type="submit" value="给TA发短信" style="padding: 6px">
								</p>
							</div>
						</div>					
						<div id="info2">
							<p class="word">Ta的简介：</p>
							<p class="word" style="padding: 4px">
							&nbsp;&nbsp;&nbsp;&nbsp;
							
							</p>
							<br/><br/>	
						</div>
					</div>
					
				
				</div>
					
					
					
					
					
					
					
				</div>
			<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    	</div>
    	
    	<div class="two_part02">
    	
    		<div id="types" style="height:150px;margin-top: 0px">
    		
    			<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
				<div class="b d1 k">
					<div class="d01">
							<div style="width:100%;height:27px;border-bottom:1px solid lightgray;text-align: left;margin-top: 2px">
								<span style="font-size: 15;font-weight: bold;color:#A9A9A9;margin-left:10px">翻译说明</span>
							</div>
						
							<div style="width:97%;height:70px;text-align: left">
								<ul >
									<li style="color:gray;font-size: 14px">1.下单成功后系统可以为您匹配最佳翻译员</li>
									<li style="color:gray;font-size: 14px">2.您也可以选择该领域特定的翻译员翻译,如果该译员无法认领任务，系统仍然为您匹配最佳翻译员</li>
								</ul>
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
