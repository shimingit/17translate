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

<title>My JSP 'main.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/newsSpecial.css">
	<link  rel="stylesheet" type="text/css" href="css/xuanfustyle.css">
	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<style type="text/css">
.divone {
	width: 99.5%;
	height: auto;
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
	height: 255px;
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
	height:215px;
	margin-top: 6px;
	overflow: hidden;
	border-top-width: 1px;
	border-top-color: gray;
	border-top-style: dashed;
}
.news li{
	height:16px;
	line-height:16px;
	overflow:hidden;
	position:relative;
	padding:0 70px 0 30px;
	margin:5px 0 10px 0;
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
	font-size: 13.5px;
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
		<div class="divtwo">
			<div class="picturediv">
			<%@include file="pictureSlide.html" %>
			</div>
			<div class="logindiv">
				
				
				<iframe src="tabs.html" width="100%" height="100%">
				</iframe>
				
				
				
				
			
           	</div>
		</div>
		
		
		<div class="divthree">
		
			<div class="pillar">
				<b class="b1"></b><b class="b2"></b><b class="b3"></b><b class="b2"></b><b class="b4"></b>
				<div class="boxcontent">
				<h1 >推荐翻译
					<span style="margin-left: 270px;font-style: italic;font-size: 14px;"><a href="recomendNews.jsp" style="color: #FF6347;">更多</a></span>
				</h1>
				<div class="news">
					<ul>
						<li class="top">
							<em>01</em><p><a href="#" target="_blank">新闻01新闻01新闻01新闻01新闻01新闻01</a></p><span class="num">100人点击</span>
						</li>
						<li class="top">
							<em>02</em><p><a href="#" target="_blank">新闻02新闻02新闻02新闻02新闻02新闻02</a></p><span class="num">100人点击</span>
						</li>
						<li class="top">
							<em>03</em><p><a href="#" target="_blank">新闻03新闻03新闻03新闻03新闻03新闻03</a></p><span class="num">100人点击</span>
						</li>
						<li class="top">
							<em>04</em><p><a href="#" target="_blank">新闻04新闻04新闻04新闻04新闻04新闻04</a></p><span class="num">100人点击</span>
						</li>
						<li class="top">
							<em>05</em><p><a href="#" target="_blank">新闻05新闻05新闻05新闻05新闻05新闻05</a></p><span class="num">100人点击</span>
						</li>
						<li class="top">
							<em>06</em><p><a href="#" target="_blank">新闻06新闻06新闻06新闻06新闻06新闻06</a></p><span class="num">100人点击</span>
						</li>
						<li class="top">
							<em>07</em><p><a href="#" target="_blank">新闻05新闻05新闻05新闻05新闻05新闻05</a></p><span class="num">100人点击</span>
						</li>
					
					</ul>
				</div>
				
				
				
				</div>
				<b class="b4"></b><b class="b2"></b><b class="b3"></b><b class="b2"></b><b class="b1"></b>
			</div>
			
			<div class="join">
			
				<div class="da">
					<h1>翻译达人
					<span>-------- 优秀是一种习惯</span>
					</h1>
				</div>
				<div class="dawrap">
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
					<div class="dadesc1">
						<img id="daimag" class="daimag" src="images/daren07.jpg" title="恐高的鸟 粉丝:10" align="left">
					</div>
					<div class="dadesc1">
						<img id="daimag" class="daimag" src="images/daren07.jpg" title="恐高的鸟 粉丝:10" align="left">
					</div>
					
					
				</div>
				<div class="dawrap">
					<div class="lizhi">
						<ul>
							<li>1.如果您自信译文水平可以达到我们对译文的要求</li>
							<li>2.如果您有责任心，可以按约定时间完成稿件翻译任务</li>
							<li>3.如果您接受编辑的修改意见并即时返回成稿</li>
						</ul>
						<div><a href="joinus.jsp" style="font-size: 16px;font-weight: bold;margin-left: 100px;color: #DEB887;font-style: italic;text-decoration: underline;">加入我们吧</a></div>
					</div>
				</div>
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
