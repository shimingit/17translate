<%@ page language="java" import="java.util.*,org.translate.min.entity.PublicNewsId" pageEncoding="UTF-8"%>

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
	//List<PublicNewsId> publicnews = (List<PublicNewsId> )session.getAttribute("publicnews");
	List<String> areatranslators = (List<String>)session.getAttribute("areatranslators");
	if(null == areatranslators)areatranslators = new ArrayList<String>();
	int currentpage = -1;//当前页面
	int totalpage = -1;//总共页数
	int pageNum = 12;//每页最多显示8条新闻
	int newsindex = -1;//当前指向第几条新闻
	if(null == request.getParameter("currentpage"))
		currentpage = 1;
	else 
		currentpage = Integer.parseInt(request.getParameter("currentpage"));
	if(areatranslators.size() % 8 == 0 && areatranslators.size() != 0)
		totalpage = areatranslators.size() / 12;
	else
		totalpage = areatranslators.size() / 12 + 1;
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
					
					<div style="width:100%;height:32px;border-bottom: 1px solid rgb(232,232,232);margin-top:5px;text-align: left"><span class="word" style="margin-left:6px;font-size: 15px;">校园新闻领域翻译员</span></div>
					
					
					
				<div style="width:100%;height:712px;text-align: left">
				
					
						<% 
							for(int i = newsindex; (i < newsindex + pageNum) && i < areatranslators.size(); i++ )
							{
								String temp = areatranslators.get(i);
								String[] params = temp.split("&");
								String username = params[0];
								String finishednewsnum = params[1];
								String commentnum = params[2];
								String fans = params[3];
								String status = params[4];
								String imgpath = basePath + "imgrepository/" + username +  "/" + username + ".jpg";
						%>
					<div class="translator">
						
					
						
						 <div id="trans1">
							<div style="float:left"><a href="translatordetailinfo?username='<%=username %>'"><img src='<%=imgpath%>'></a></div>
							<div style="float:left">
								<p><a href="translatordetailinfo?username=<%=username %>" style="font-size: 15px;font-weight: bold;margin-left: 10PX"><%=username %></a></p>
								<p>
									 <input class="button" type="submit" value="找TA翻译" style="padding: 6px">
								</p>
							</div>
						</div>
						
						<div id="trans2">
							 <p>已完成翻译文章： <a href="#" style="color:blue"><%=finishednewsnum %></a>  篇</p>
							 <p>Ta的评论： <a href="#" style="color:blue"><%=commentnum %></a> 条</p>
							 <p>目前状态： <%=status %></p>
							 <p>粉丝数： <%=fans %> 个</p>
						</div>
					</div>
					
					<% 
						}
					%>
					<%
						if(areatranslators.size() == 0)
						{
					 %>
					 	<span style="margin:20px">该领域暂无翻译员！</span>
					 <%
					 	}
					  %>
				</div>
					
					<div class="page">
						<span class="word1">
							共&nbsp;<span style="color:green"><%=totalpage %></span>&nbsp;页&nbsp;&nbsp;当前页面&nbsp;&nbsp;第&nbsp;<span style="color:green"><%=currentpage %></span>&nbsp;页&nbsp;&nbsp;
							<a href="areatranslators.jsp?currentpage=1" style="color:green">首页</a>
							<%if(currentpage == 1){ %>
							&nbsp;&nbsp;<a href="areatranslators.jsp?currentpage=1" style="color:green">上一页</a>
							&nbsp;&nbsp;<a href="areatranslators.jsp?currentpage=<%=(currentpage + 1) %>" style="color:green">下一页</a>
							<%}else if(currentpage == totalpage){ %>
							&nbsp;&nbsp;<a href="areatranslators.jsp?currentpage=<%=currentpage - 1 %>" style="color:green">上一页</a>
							&nbsp;&nbsp;<a href="areatranslators.jsp?currentpage=<%=totalpage %>" style="color:green">下一页</a>	
							<%} 
							else{%>
							&nbsp;&nbsp;<a href="areatranslators.jsp?currentpage=<%=currentpage-1 %>" style="color:green">上一页</a>
							&nbsp;&nbsp;<a href="areatranslators.jsp?currentpage=<%=(currentpage + 1) %>" style="color:green">下一页</a>
							<%} %>
							&nbsp;&nbsp;<a href="areatranslators.jsp?currentpage=<%=totalpage %>" style="color:green">尾页</a>
						</span>
					</div>
					
					
					
					
					
				</div>
			<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    	</div>
    	
    	<div class="two_part02">
    		<div id="search1">
    		
    			<div class="container">
				  <div id="search">
				    <label for="search">请输入关键字：</label>
				    <input type="text" name="q">
				    <input class="button" type="submit" value="Search">
				  </div>
				</div>

			
			 <a href="selectplaceOrder.jsp" class="button1 blue medium"><span style="color: white;">我要翻译---->下单</span></a> 
			
		
    		</div>
    		<div id="types" style="height:150px;">
    		
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
