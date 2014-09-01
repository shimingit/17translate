<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'payfee.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
		<link  rel="stylesheet" type="text/css" href="css/xuanfustyle.css">
	<link rel="stylesheet" type="text/css" href="css/payfee.css">
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
			$("#image1").mouseover(function()
			{
				$(this).css("border","2px solid #90EE90");
				$("#arrow1").css("display","block");
				$("#arrow2").css("display","none");
			});
			$("#image1").mouseout(function()
			{
				$(this).css("border","none");
			});
			$("#image2").mouseover(function()
			{
				$(this).css("border","2px solid #90EE90");
				$("#arrow2").css("display","block");
				$("#arrow1").css("display","none");
			});
			$("#image2").mouseout(function()
			{
				$(this).css("border","none");
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
		//获取用户下单参数
		int totalwords = Integer.parseInt(request.getParameter("totalwords"));
		float totalcost = Float.parseFloat(request.getParameter("totalcost"));
		String orderid = request.getParameter("orderId");
		String origin = request.getParameter("origin");
		String object = request.getParameter("object");
		String username = (String)session.getAttribute("username"); 
		
	 %>
	 
  </head>
  
  <body>
  <div align="center">
    <div class="divone"><jsp:include page="loginHead.html"></jsp:include></div>
    
    
    <div class="divtwo">


    	<div class="two_partone">
    		<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
					<div  class="b d1 k"  >
						<div id="t"><span class="word" style="margin-left:4px;color:green">订单信息</span></div>
						<div id="info"><span class="word"style="font-size:15px;"><span style="color:#FFA500"><%=username %></span>&nbsp;您好，订单已提交，请尽快付款<span class="word"style="color:#1E90FF;font-size:12px;">（我们在您付款成功后会尽快安排翻译）</span></span></div>
						<div id="info"><span class="word"style="font-size:15px;">原文语言：<%=origin %>&nbsp;&nbsp;&nbsp;&nbsp;目标语言：<%=object %>，总字数：<span style="color:#FFA500"><%= totalwords%></span>字</span></div>
						<div id="info"><span class="word">订单号：<span style="color:#FFA500"><%= orderid%></span>，您需要支付 <span style="color:#FFA500"><%=totalcost %> </span>元。</span></div>
						
			        </div>
		    <b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    	</div>

    	<div class="two_parttwo">
    		<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
					<div  class="b d1 k"  style="background: rgb(255,255,255)">
						<div id="t"><span class="word" style="margin-left:4px;color:green">付款方式</span></div>
						<div id="pay">
							<div class="left"><img id="arrow1" src="images/jiantou.jpg" style="width:80px;height:60px;"></img></div>
							<div class="middle"><a href="#"><img id="image1" src="images/zhifubao.jpg" style="width:85px;height:60px;"></img></a></div>
							<div class="right">
								<span class="word">支付宝支付，快捷支付，信用卡和借记卡</span>
							</div>
						</div>
						<div id="pay">
							<div class="left"><img id="arrow2" src="images/jiantou.jpg" style="width:80px;height:60px;display: none"></img></div>
							<div class="middle"><a href="#"><img id="image2" src="images/kuaiqian.jpg" style="width:85px;height:60px;"></img></a></div>
							<div class="right">
								<span class="word">支持企业银行</span>
							</div>
						</div>
						<div id="payinfo">
							<span class="word" >
								<a href="#">我的订单</a>
								<a href="#">继续下单</a>
							</span>
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
