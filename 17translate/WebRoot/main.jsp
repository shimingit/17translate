<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>我要翻译在线平台</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/newsSpecial.css">
	<link  rel="stylesheet" type="text/css" href="css/xuanfustyle.css">
	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
	<script type="text/javascript" src="js/posfixed.js"></script>
<style type="text/css">
.divone {
	width: 100%;
	height: auto;
	z-index:1000;
}

.divtwo {
	width:997.18px;
	height: 330px;
	margin-top:10px;
	text-align:right;
}
.divtwo .picturediv{
	width:60%;
	height:auto;
	margin:4px 4px;
	text-align:center;
	float:left;
}
.divtwo .logindiv{
	width:35%;
	height:298px;
	border:2px dashed lightgray;
	text-align:center;
	float: right;
	font-size: 12px;
}
.divthree {
	width:997.18px;
	height: 1005px;
	margin-top:10px;
	text-align: center;
	font-size: 13px;
}
.divfour {
	width:997.18px;
	height: 300px;
	margin-top:10px;
	padding-top:10px;
	text-align: center;
	font-size: 13px;
	border-top: 1.5px solid lightgray;
	color: gray;
}
.partone{
	width: 33%;
	height: 200px;
	float: left;
	text-align: left;
	font-size: 13px;
}
.partone ul li{
	margin-top: 3px;
}
.partone ul li a{
	color: #778899;
}
.parttwo{
	width: 40%;
	height: 100px;
	float: right;
	margin-right: 2px;
	text-align: right;
	font-size: 13px;
	
}
.parttwo span a{
	color: #778899;
}
.news{
	width:100%;
	height:225px;
	margin-top: 6px;
	overflow: hidden;
	border-top-width: 1px;
	border-top-color: lightgray;
	border-top-style: dashed;
}
.news div{
	width:175.6px;
	height:60px;
	margin: 8px 10px 2px 10px;
	float: left;
	text-align: left;
	
}

.news li em{
	background-color:lightgray;
	width:20px;
	height:16px;
	overflow:hidden;
	display:block;
	position:absolute;
	left:0;
	top:0;
	text-align:center;
	font-style:normal;
	color:#333;
	background-position:0 -16px;
}
.news .top em{
	background-position:0 0;
	color:black;
}
.news .num{
	position:absolute;
	right:10px;
	top:0;
	color:#999;
}
.news .top p a{
	font:normal 62.5%/1.5 Helvetica, Arial, sans-serif;
	color: #808080;
	font-size: 13px;
}

</style>
<script type="text/javascript">
$(document).ready(function(){

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
	
	$(".daimag").mouseover(function()
	{
		$(this).attr("id","daimagchange");
	});
	
	$(".daimag").mouseout(function()
	{
		$(this).attr("id","daimag");
	});
	$('.divone').posfixed({
		distance : 0,
		pos : 'top',
		type : 'while',
		hide : false
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
	List<String> fieldallocateresult = (List<String>)session.getAttribute("fieldallocateresult");
	
	if(fieldallocateresult == null)
		fieldallocateresult = new ArrayList<String>();
 %>
</head>

<body>

	
	
	
	
	

	<div align="center">
		<div class="divone">
			<jsp:include page="loginHead.html"></jsp:include>
		</div>
		<div class="divtwo">
			<div class="picturediv">
			<%@include file="pictureSlide.html" %>
			</div>
			<div class="logindiv">
				
				
				<iframe src="tabs.html" width="100%" height="100%" >
				</iframe>
				
				
				
				
			
           	</div>
		</div>
		
		
		<div class="divthree">
		
			<div class="pillar">
				<b class="b1"></b><b class="b2"></b><b class="b3"></b><b class="b2"></b><b class="b4"></b>
				<div class="boxcontent">
				<h1 >热门领域
					<span style="font-style: italic;font-size: 14px;float: right;margin-right: 6px"><a href="#" style="color: #FF6347;">更多</a></span>
				</h1>
				
			<div class="news">
					
					
					<% 
						for(String result : fieldallocateresult)
						{ 
							String[] params = result.split("&");
					%>
					<div>
						<div style="width:45px;height:53px;margin: 2px"><a href="#"><img src="images/area1.gif" style="width:40px;height:38px"/></a></div>
						<div style="width:118px;height:53px;margin: 2px;">
							<p class="word" style="font-size: 13px;margin-left: 0"><a id="<%=params[0] %>" href="areatranslator?fieldid=<%=params[0] %>" style="color:gray"><%=params[1] %></a></p>
							<p class="word" style="font-size: 13px;font-weight:normal;margin-left: 0;margin-top: -4px">目前译员数：<%=params[2] %>个</p>
						</div>
					</div>
					<%
					}
					 %>
				
					
					
			</div>
				</div>
				<b class="b4"></b><b class="b2"></b><b class="b3"></b><b class="b2"></b><b class="b1"></b>
			</div>
			
			<div class="join">
			
				<div class="da">
					<h1 style="line-height: 25px">招兵买马
						<img  src="images/m4.jpg" style="width: 40px;height:30px;vertical-align: middle;"/>
					</h1>
				</div>
				<div class="dawrap">

					<div class="lizhi">
						<ul>
							<li>如果您自信译文水平可以达到我们对译文的要求</li>
							<li>如果您有责任心，可以按约定时间完成稿件翻译任务</li>
							<li>如果您接受编辑的修改意见并即时返回成稿</li>
							<li>如果您接受编辑的修改意见并即时返回成稿</li>
							<li>如果您接受编辑的修改意见并即时返回成稿</li>
							<li>如果您接受编辑的修改意见并即时返回成稿</li>
							<li>如果您接受编辑的修改意见并即时返回成稿</li>
							<li>如果您接受编辑的修改意见并即时返回成稿</li>
						</ul>
						
					</div> 
					
					<div ><a href="joinus.jsp" style="font-size: 16px;font-weight: bold;color: #DEB887;font-style: italic;text-decoration: underline;">
							<img src="images/jus4.jpg" style="width:100%;height:50px;margin-top: 8px">
					</a></div> 		
				</div>
				
			</div>
			
			<div class="divadd">
				<div class="addone">
					<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
					    <div class="b d1 k">
					    	
					    	<div class="da"><h1 style="line-height: 25px">成功案例
					    		<span style="font-style: italic;font-size: 14px;font-weight:bold;float: right;margin-right: 20px"><a href="#" style="color: #FF6347;">更多</a></span>
					    	</h1></div>
					    	 
					    	<div class="successorder">
					    		<p class="word1"><a href="#" style="color:gray">经济发展靠市场的手而非政府</a>&nbsp;&nbsp;&nbsp;<span style="font-size: 13px;color: blue;">来自：shimin</span></p>
					    		<p class="word1" style="font-size: 13px;color:gray">目标语种：英语&nbsp;&nbsp;&nbsp;来自领域：重要会议
					    			<span style="float: right;" class="word"><a href="#" style="color:gray;margin-right: 20px;font-size: 13px">查看评论</a></span>
					    		</p>
					    	</div>
					    	<div class="successorder">
					    		<p class="word1"><a href="#" style="color:gray">经济发展靠市场的手而非政府</a>&nbsp;&nbsp;&nbsp;<span style="font-size: 13px;color: blue;">来自：shimin</span></p>
					    		<p class="word1" style="font-size: 13px;color:gray">目标语种：英语&nbsp;&nbsp;&nbsp;来自领域：重要会议
					    			<span style="float: right;" class="word"><a href="#" style="color:gray;margin-right: 20px;font-size: 13px">查看评论</a></span>
					    		</p>
					    	</div>
					    	<div class="successorder">
					    		<p class="word1"><a href="#" style="color:gray">经济发展靠市场的手而非政府</a>&nbsp;&nbsp;&nbsp;<span style="font-size: 13px;color: blue;">来自：shimin</span></p>
					    		<p class="word1" style="font-size: 13px;color:gray">目标语种：英语&nbsp;&nbsp;&nbsp;来自领域：重要会议
					    			<span style="float: right;" class="word"><a href="#" style="color:gray;margin-right: 20px;font-size: 13px">查看评论</a></span>
					    		</p>
					    	</div>
					    	<div class="successorder">
					    		<p class="word1"><a href="#" style="color:gray">经济发展靠市场的手而非政府</a>&nbsp;&nbsp;&nbsp;<span style="font-size: 13px;color: blue;">来自：shimin</span></p>
					    		<p class="word1" style="font-size: 13px;color:gray">目标语种：英语&nbsp;&nbsp;&nbsp;来自领域：重要会议
					    			<span style="float: right;" class="word"><a href="#" style="color:gray;margin-right: 20px;font-size: 13px">查看评论</a></span>
					    		</p>
					    	</div>
					    	<div class="successorder">
					    		<p class="word1"><a href="#" style="color:gray">经济发展靠市场的手而非政府</a>&nbsp;&nbsp;&nbsp;<span style="font-size: 13px;color: blue;">来自：shimin</span></p>
					    		<p class="word1" style="font-size: 13px;color:gray">目标语种：英语&nbsp;&nbsp;&nbsp;来自领域：重要会议
					    			<span style="float: right;" class="word"><a href="#" style="color:gray;margin-right: 20px;font-size: 13px">查看评论</a></span>
					    		</p>
					    	</div>
					    
						</div>
				    <b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>	
				</div>
				
				<div class="addtwo">
					<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
					    <div class="b d1 k">
					    	
					    	<div id="t1">
					    		<span class="word">翻译达人</span>
					    		<img src="images/superman4.jpg" style="width:40px;height:30px;vertical-align: middle;">
					    	</div>
					    
					    	<div id="t2">
					    		<div class="dadesc1">
									<img id="daimag" class="daimag" src="images/daren.jpg" title="恐高的鸟 粉丝:10" align="left">
								</div>
					    		<div class="dadesc1">
									<img id="daimag" class="daimag" src="images/daren01.jpg" title="恐高的鸟 粉丝:10" align="left">
								</div>
								<div class="dadesc1">
									<img id="daimag" class="daimag" src="images/daren02.jpg" title="恐高的鸟 粉丝:10" align="left">
								</div>
								<div class="dadesc1">
									<img id="daimag" class="daimag" src="images/daren03.jpg" title="恐高的鸟 粉丝:10" align="left">
								</div>
								<div class="dadesc1">
									<img id="daimag" class="daimag" src="images/daren04.jpg" title="恐高的鸟 粉丝:10" align="left">
								</div>
								<div class="dadesc1">
									<img id="daimag" class="daimag" src="images/daren05.jpg" title="恐高的鸟 粉丝:10" align="left">
								</div>
								<div class="dadesc1">
									<img id="daimag" class="daimag" src="images/daren06.jpg" title="恐高的鸟 粉丝:10" align="left">
								</div>
								<div class="dadesc1">
									<img id="daimag" class="daimag" src="images/daren07.jpg" title="恐高的鸟 粉丝:10" align="left">
								</div>
								<div class="dadesc1">
									<img id="daimag" class="daimag" src="images/daren08.jpg" title="恐高的鸟 粉丝:10" align="left">
								</div>
								<div class="dadesc1">
									<img id="daimag" class="daimag" src="images/weixind.jpg" title="恐高的鸟 粉丝:10" align="left">
								</div>
								<div class="dadesc1">
									<img id="daimag" class="daimag" src="images/daren07.jpg" title="恐高的鸟 粉丝:10" align="left">
								</div>
								<div class="dadesc1">
									<img id="daimag" class="daimag" src="images/daren07.jpg" title="恐高的鸟 粉丝:10" align="left">
								</div>
								<div class="dadesc1">
									<img id="daimag" class="daimag" src="images/daren07.jpg" title="恐高的鸟 粉丝:10" align="left">
								</div>
								<div class="dadesc1">
									<img id="daimag" class="daimag" src="images/daren07.jpg" title="恐高的鸟 粉丝:10" align="left">
								</div>
								
					    	</div>
						
						</div>
				    <b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>	
				</div>
			</div>
			
			
			
			
			
			<div class="divadd" style="height:200px">
				<div class="addone" style="height:200px">
					<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
					    <div class="b d1 k">
					    	
					    	<div class="da"><h1 style="line-height: 25px">服务理念</h1></div>
					    	<div class="concept">
					    		<ul>
							         <li>我们的服务范围主要包括 各类高校新闻，学术论文，毕业论文等与校园息息相关的领域</li>
							         <li>对于您的任务，我们会为您匹配最佳解决方案。我们力求把简单做到极致。</li>
							         <li>我们起点简单，但是我们追求卓越。我们有耐心，不怕您不放心。</li>
							    </ul>
					    	</div>
					    	<div class="procedure">
					    		<p class="word" style="font-weight: normal;">服务流程:</p>
					    		<p class="word" style="margin-left: 20px;color: rgba(168, 141, 141, 1);">
					    			注册<img src="images/jiantou.jpg" style="width:40px;height:25px;vertical-align: middle;margin-bottom: 4px;">
					    			上传或粘贴原稿<img src="images/jiantou.jpg" style="width:40px;height:25px;vertical-align: middle;margin-bottom: 4px;">
					    			确认订单，付款<img src="images/jiantou.jpg" style="width:40px;height:25px;vertical-align: middle;margin-bottom: 4px;">
					    			等待译文，验收，评价
					    		</p>
					    	</div>
					    
						</div>
				    <b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>	
				</div>
				
				<div class="addtwo" style="height:200px">
					<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
					    <div class="b d1 k">
					    	
					    	<div id="t1">
					    		<span class="word">联系我们</span>
					    	</div>
					    
					    	<div id="t2">
					    		
					    		<div id="item" style="height: 40px">
					    			<p class="word2">我们的服务电话：<span style="color:#1F4E6B;">13203234617（陈）</span></p>
					    			<p class="word2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					    			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					    			<span style="color:#1F4E6B;">13035310271（石）</span></p>
					    		</div>
					    		<div id="item">
					    			<span class="word2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们的邮箱：<span style="color:#1F4E6B;">&nbsp;toshimin132@gmail.com</span></span>
					    		</div>
					    		
					    		<div id="item" style="height:40px;">
					    			<p class="word2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们的QQ：<span style="color:#1F4E6B;">&nbsp;1045446965</span></p>
					    			<p class="word2">
					    			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					    			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					    			<span style="color:#1F4E6B;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;45712902</span></p>
					    		</div>
								<span class="word2" style="line-height: 40px">扫描右侧二维码关注我们</span>
					    	</div>
						
						</div>
				    <b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>	
				</div>
			</div>
			
			
			
			
			<div class="threebuttom">
				<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
					    <div class="b d1 k">
					    	
					    	
					    	
					    	<div class="concern">
					    		<p class="word" style="font-weight: normal;margin-left: 25px;line-height: 30px">关注我们微信号 <span style="color:green;">woyaofanyi</span></p>
					    		<p class="word" style="font-weight: normal;margin-left: 125px"><img src="images/weixin.jpg" style="width:120px;height:120px"/></p>
					    		<p class="word" style="font-weight: normal;margin-left: 120px">微信扫一扫关注我们</p>
					    	</div>
					    
					    </div>
				<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>	
			</div>
			
			
			
			
		</div>
		
	<div class="divfour">
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
