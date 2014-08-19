<%@ page language="java" import="java.util.*,org.translate.min.entity.PublicNewsId" pageEncoding="UTF-8"%>

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




	
	<link rel="stylesheet" type="text/css" href="css/recomendNews.css">
	<link  rel="stylesheet" type="text/css" href="css/xuanfustyle.css">
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
});

function showEWM(){
			document.getElementById("EWM").style.display = 'block';
		}
function hideEWM(){
	document.getElementById("EWM").style.display = 'none';
}

</script>
<%
	List<PublicNewsId> publicnews = (List<PublicNewsId> )session.getAttribute("publicnews");
	int currentpage = -1;//当前页面
	int totalpage = -1;//总共页数
	int pageNum = 8;//每页最多显示8条新闻
	int newsindex = -1;//当前指向第几条新闻
	if(null == request.getParameter("currentpage"))
		currentpage = 1;
	else 
		currentpage = Integer.parseInt(request.getParameter("currentpage"));
	if(publicnews.size() % 8 == 0 && publicnews.size() != 0)
		totalpage = publicnews.size() / 8;
	else
		totalpage = publicnews.size() / 8 + 1;
	if(currentpage > totalpage)
		currentpage = totalpage;
	newsindex = (currentpage - 1) * 8;
	
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
					
					<div style="width:100%;height:32px;border-bottom: 1px solid rgb(232,232,232);margin-top:5px;text-align: left"><span class="word" style="margin-left:6px;font-size: 15px;">在线翻译任务</span></div>
					
					
					
				<div style="width:100%;height:712px;">
				
					<%
						for(int i = newsindex; i < newsindex + 8 && (i + 1) <= publicnews.size();i++)
						{					
							PublicNewsId news = publicnews.get(newsindex);
					 %>
					<div  class="specialnews">
						<div class="title" >
							<span class="word1"><a href="translatenew?newsid=<%=news.getNewId()%>"><%=news.getNewTitle() %></a>&nbsp;&nbsp;&nbsp;<span style="font-weight: normal">作者：<%=news.getAuthor() %></span></span>
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								原文语种：<%=news.getOriginlanguage() %>&nbsp;&nbsp;目标语种：<%=news.getObjectlanguage() %>
							</span>
							<span class="word1" style="float: right;font-weight: normal">翻译状态：<span style="color:red">待翻译</span></span>
						</div>
						<div class="link">
							<span class="word1" style="font-weight: normal">
								原文链接：<a href="<%=news.getNetLink()%>"><%=news.getNetLink() %></a>
							</span>
						</div>
					</div>
					<%} %>
				</div>
					
					<div class="page">
						<span class="word1">
							共&nbsp;<span style="color:green"><%=totalpage %></span>&nbsp;页&nbsp;&nbsp;当前页面&nbsp;&nbsp;第&nbsp;<span style="color:green"><%=currentpage %></span>&nbsp;页&nbsp;&nbsp;
							<a href="recomendNews.jsp?currentpage=1" style="color:green">首页</a>
							<%if(currentpage == 1){ %>
							&nbsp;&nbsp;<a href="recomendNews.jsp?currentpage=1" style="color:green">上一页</a>
							&nbsp;&nbsp;<a href="recomendNews.jsp?currentpage=<%=(currentpage + 1) %>" style="color:green">下一页</a>
							<%}else if(currentpage == totalpage){ %>
							&nbsp;&nbsp;<a href="recomendNews.jsp?currentpage=<%=currentpage - 1 %>" style="color:green">上一页</a>
							&nbsp;&nbsp;<a href="recomendNews.jsp?currentpage=<%=totalpage %>" style="color:green">下一页</a>	
							<%} 
							else{%>
							&nbsp;&nbsp;<a href="recomendNews.jsp?currentpage=<%=currentpage-1 %>" style="color:green">上一页</a>
							&nbsp;&nbsp;<a href="recomendNews.jsp?currentpage=<%=(currentpage + 1) %>" style="color:green">下一页</a>
							<%} %>
							&nbsp;&nbsp;<a href="recomendNews.jsp?currentpage=<%=totalpage %>" style="color:green">尾页</a>
						</span>
					</div>
					
					
					
					
					
				</div>
			<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    	</div>
    	
    	<div class="two_part02">
    		<div id="search1">
    		
    			<div class="container">
				  <div id="search">
				    <label for="search">请输入文章标题：</label>
				    <input type="text" name="q">
				    <input class="button" type="submit" value="Search">
				  </div>
				</div>

			
			 <a href="selectplaceOrder.jsp" class="button1 blue medium"><span style="color: white;">我要翻译---->下单</span></a> 
			
		
    		</div>
    		<div id="types">
    		
    			<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
				<div class="b d1 k">
					<div class="d01">
							<div style="width:100%;height:27px;border-bottom:1px solid lightgray;text-align: left;margin-top: 2px">
								<span style="font-size: 15;font-weight: bold;color:#A9A9A9;margin-left:10px">原文语种</span>
							</div>
							<div style="width:97%;height:130px;">
								
							
							<div  style="width:auto;height:20px;float: left;margin: 4px;">
								<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
									<div  class="b d1 k language" style="background: #6495ED;cursor: pointer;">
										<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">全部</span>
									</div>
								<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
							</div>
							<div  style="width:auto;height:20px;float: left;margin: 4px">
								<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
									<div class="b d1 k language" style="background: #DCDCDC;cursor: pointer;">
										<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">中文</span>
									</div>
								<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
							</div>
							<div  style="width:auto;height:20px;float: left;margin: 4px">
								<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
									<div class="b d1 k language" style="background: #DCDCDC;cursor: pointer;">
										<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">英语</span>
									</div>
								<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
							</div>
							<div  style="width:auto;height:20px;float: left;margin: 4px">
								<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
									<div  class="b d1 k language" style="background: #DCDCDC;cursor: pointer;">
										<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">日语</span>
									</div>
								<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
							</div>
							<div  style="width:auto;height:20px;float: left;margin: 4px">
								<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
									<div  class="b d1 k language" style="background: #DCDCDC;cursor: pointer;">
										<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">德语</span>
									</div>
								<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
							</div>
							<div  style="width:auto;height:20px;float: left;margin: 4px">
								<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
									<div class="b d1 k language" style="background: #DCDCDC;cursor: pointer;">
										<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">韩语</span>
									</div>
								<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
							</div>
							<div  style="width:auto;height:20px;float: left;margin: 4px;margin-top: 10px">
								<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
									<div class="b d1 k language" style="background: #DCDCDC;cursor: pointer;">
										<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">法语</span>
									</div>
								<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
							</div>
							<div  style="width:auto;height:20px;float: left;margin: 4px;margin-top: 10px">
								<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
									<div class="b d1 k language" style="background: #DCDCDC;cursor: pointer;">
										<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">俄语</span>
									</div>
								<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
							</div>
							<div  style="width:auto;height:20px;float: left;margin: 4px;margin-top: 10px">
								<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
									<div class="b d1 k language" style="background: #DCDCDC;cursor: pointer;">
										<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">西班牙语</span>
									</div>
								<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
							</div>
							<div  style="width:auto;height:20px;float: left;margin: 4px;margin-top: 10px">
								<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
									<div class="b d1 k language" style="background: #DCDCDC;cursor: pointer;">
										<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">意大利语</span>
									</div>
								<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
							</div>
							<div  style="width:auto;height:20px;float: left;margin: 4px;margin-top: 10px">
								<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
									<div class="b d1 k language" style="background: #DCDCDC;cursor: pointer;">
										<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">阿拉伯语</span>
									</div>
								<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
							</div>
							<div  style="width:auto;height:20px;float: left;margin: 4px;margin-top: 10px">
								<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
									<div class="b d1 k language" style="background: #DCDCDC;cursor: pointer;">
										<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">葡萄牙语</span>
									</div>
								<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
							</div>
							
							
						</div>
					
					</div>
					
					
					<div class="d02">
					
						<div style="width:100%;height:27px;border-bottom:1px solid lightgray;text-align: left;margin-top: 2px">
							<span style="font-size: 15;font-weight: bold;color:#A9A9A9;margin-left:10px">原文分类</span>
						</div>
				
						<div  style="width:auto;height:20px;float: left;margin: 4px;">
							<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
								<div  class="b d1 k articletype" style="background: #6495ED;cursor: pointer;">
									<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">全部</span>
								</div>
							<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
						</div>
						<div  style="width:auto;height:20px;float: left;margin: 4px;">
							<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
								<div  class="b d1 k articletype" style="background: #DCDCDC;cursor: pointer;">
									<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">重要会议</span>
								</div>
							<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
						</div>
						<div  style="width:auto;height:20px;float: left;margin: 4px;">
							<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
								<div  class="b d1 k articletype" style="background: #DCDCDC;cursor: pointer;">
									<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">重要通知</span>
								</div>
							<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
						</div>
						<div  style="width:auto;height:20px;float: left;margin: 4px;">
							<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
								<div  class="b d1 k articletype" style="background: #DCDCDC;cursor: pointer;">
									<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">校园广播</span>
								</div>
							<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
						</div>
						<div  style="width:auto;height:20px;float: left;margin: 4px;margin-top: 10px">
							<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
								<div  class="b d1 k articletype" style="background: #DCDCDC;cursor: pointer;">
									<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">招生简章</span>
								</div>
							<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
						</div>
						<div  style="width:auto;height:20px;float: left;margin: 4px;margin-top: 10px">
							<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
								<div  class="b d1 k articletype" style="background: #DCDCDC;cursor: pointer;">
									<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">学生论文</span>
								</div>
							<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
						</div>
						<div  style="width:auto;height:20px;float: left;margin: 4px;margin-top: 10px">
							<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
								<div  class="b d1 k articletype" style="background: #DCDCDC;cursor: pointer;">
									<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">老师简介</span>
								</div>
							<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
						</div>
						<div  style="width:auto;height:20px;float: left;margin: 4px;margin-top: 10px">
							<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
								<div  class="b d1 k articletype" style="background: #DCDCDC;cursor: pointer;">
									<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">趣味生活</span>
								</div>
							<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
						</div>
						<div  style="width:auto;height:20px;float: left;margin: 4px;margin-top: 10px">
							<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
								<div  class="b d1 k articletype" style="background: #DCDCDC;cursor: pointer;">
									<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);">院系介绍</span>
								</div>
							<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
						</div>
						
					</div>
					
					
					<div class="d03">
						
						<div style="width:100%;height:27px;border-bottom:1px solid lightgray;text-align: left;margin-top: 2px">
							<span style="font-size: 15;font-weight: bold;color:#A9A9A9;margin-left:10px">一起翻译啦~</span>
						</div>
						<div style="text-align: left">
							<ul style="font-size: 12px;color: gray">
								<li>1.您可以选择任何感兴趣的文章进行翻译
								<li>2.翻译是一种态度，我们希望您能用心对待
								<li>3.对您完成的每次翻译都会有意外的惊喜
								<li>4.如果你很棒，欢迎<a href="joinus.jsp" style="color: #6495ED;font-weight: bold">加入我们</a>平台，您将获得更多的回报
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
