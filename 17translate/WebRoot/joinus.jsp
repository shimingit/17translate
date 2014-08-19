<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'joinus.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/joinus.css">
	<link  rel="stylesheet" type="text/css" href="css/xuanfustyle.css">
	<link href="css/basic.css" type="text/css" rel="stylesheet" />
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
	$("input").focus(function()
	{
		$(this).css("border","2px solid lightgray");
	});
	$("input").blur(function()
	{
		$(this).css("border","1px solid lightgray");
	});
	
	$(".textarea").focus(function()
	{
		$(this).css("border","2px solid lightgray");
	});
	$(".textarea").blur(function()
	{
		$(this).css("border","1px solid lightgray");
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
  
  <body style="background: white">
    <div align="center">
    
    	<div class="divone">
    		<jsp:include page="loginHead.html"></jsp:include>
   		</div>
    	
    	
    	
    	
    	
    	<div class="divtwo">
    	
    		<div class="two_desc">
    		<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
					<div  class="b d1 h"  >
						<div id="title">
							<span class="baseword">译员入驻</span>
						</div>
						<div id="description">
							<span class="word">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;一起翻译吧是一个主要针对高校网站新闻翻译的众包平台，我们主要是通过借助互联网的力量来将各类高校网站新闻
							翻译成不同语言版本，以便信息及时有效的得到传播。为了服务各类高校，也为了凝聚我们大家的力量，同时也为了
							展示您的才华，请加入我们吧，有偿贡献您的知识。</span>
						</div>
						<div id="procedure">
							<div id="fylc">
								<span class="baseword">入驻流程</span>
							</div>
							<div id="fylcimg">
								<img src="images/procedure.png" style="height:30px;width:820px;margin-left: 100px;margin-top: 10px"/>
							</div>
							
						</div>
					</div>
				<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    		</div>
    		
    		<div class="two_cont">
				<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
					<div  class="b d1 h"  >
						
						
						<div class="two_content tc_01" >
							<p class="word" style="font-size:16px;margin: 10px 0 auto 8px;">请如实填写您的相关信息<span style="font-size: 12px;color: #F4A460">( 星号为必填信息 )</span></p>
						</div>
						<form action="joinusclub" method="get">
						<div class="two_content ">
							<div class="namediv">
								<span class="word" style="font-size: 16px">姓名：</span><input class="inout" name="realname" type="text" value=""><span style="color:red;margin:auto 2px auto 2px">*</span>
							</div>
							<div class="namediv">
								<span class="word" style="font-size: 16px">电话号码：</span><input class="inout" name="phonenumber" type="text" value=""><span style="color:red;margin:auto 2px auto 2px">*</span>
							</div>
							<div class="namediv">
								<span class="word" style="font-size: 16px">邮箱：</span><input class="inout" name="emailbox" type="text" value=""><span style="color:rgb(247,248,249);margin:auto 2px auto 2px">*</span>
							</div>
							<div class="namediv">
								<span class="word" style="font-size: 16px">翻译经验：</span><select class="inout" name="translatespan" value="">
									<option value="0">0 - 1年
									<option value="1">1 - 2年
									<option value="2">2 - 3年
									<option value="3">3 - 4年
									<option value="4">4年以上
								</select><span style="color:rgb(247,248,249);margin:auto 2px auto 2px">*</span>
							</div>
						</div>
						
						<div class="two_content">
							<div class="galanguage word"><span style="font-size: 16px">擅长语言:</span></div>
							<div class="language">
								<div class="check">
									<input type="checkbox" value="英语" style="width:20px;height:20px" name="gtlanguages"/><span class="word" style="vertical-align:6px;">英语</span>
								</div>
								<div class="check">
									<input type="checkbox" value="日语" style="width:20px;height:20px" name="gtlanguages"/><span class="word" style="vertical-align:6px;">日语</span>
								</div>
								<div class="check">
									<input type="checkbox" value="德语" style="width:20px;height:20px" name="gtlanguages"/><span class="word" style="vertical-align:6px;">德语</span>
								</div>
								<div class="check">
									<input type="checkbox" value="韩语" style="width:20px;height:20px" name="gtlanguages"/><span class="word" style="vertical-align:6px;">韩语</span>
								</div>
								<div class="check">
									<input type="checkbox" value="法语" style="width:20px;height:20px" name="gtlanguages"/><span class="word" style="vertical-align:6px;">法语</span>
								</div>
								<div class="check">
									<input type="checkbox" value="俄语" style="width:20px;height:20px" name="gtlanguages"/><span class="word" style="vertical-align:6px;">俄语</span>
								</div>
								<div class="check">
									<input type="checkbox" value="西班牙语" style="width:20px;height:20px" name="gtlanguages"/><span class="word" style="vertical-align:6px;">西班牙语</span>
								</div>
								<div class="check">
									<input type="checkbox" value="意大利语" style="width:20px;height:20px" name="gtlanguages"/><span class="word" style="vertical-align:6px;">意大利语</span>
								</div>
								<div class="check">
									<input type="checkbox" value="阿拉伯语" style="width:20px;height:20px" name="gtlanguages"/><span class="word" style="vertical-align:6px;">阿拉伯语</span>
								</div>
								<div class="check">
									<input type="checkbox" value="葡萄牙语" style="width:20px;height:20px" name="gtlanguages"/><span class="word" style="vertical-align:6px;">葡萄牙语</span>
								</div>
							</div>
						
						</div>
						<div class="two_content">
							
							<div class="gafields word"><span style="font-size: 16px">擅长领域:</span></div>
							
							<div class="fields">
								<div class="check">
									<input type="checkbox" value="重要会议" style="width:20px;height:20px" name="gtfields"/><span class="word" style="vertical-align:6px;">重要会议</span>
								</div>
								<div class="check">
									<input type="checkbox" value="重要通知" style="width:20px;height:20px" name="gtfields"/><span class="word" style="vertical-align:6px;">重要通知</span>
								</div>
								<div class="check">
									<input type="checkbox" value="校园广播" style="width:20px;height:20px" name="gtfields"/><span class="word" style="vertical-align:6px;">校园广播</span>
								</div>
								<div class="check">
									<input type="checkbox" value="招生简章" style="width:20px;height:20px" name="gtfields"/><span class="word" style="vertical-align:6px;">招生简章</span>
								</div>
								<div class="check">
									<input type="checkbox" value="学生论文" style="width:20px;height:20px" name="gtfields"/><span class="word" style="vertical-align:6px;">学生论文</span>
								</div>
								<div class="check">
									<input type="checkbox" value="老师简介" style="width:20px;height:20px" name="gtfields"/><span class="word" style="vertical-align:6px;">老师简介</span>
								</div>
								<div class="check">
									<input type="checkbox" value="趣味生活" style="width:20px;height:20px" name="gtfields"/><span class="word" style="vertical-align:6px;">趣味生活</span>
								</div>
								<div class="check">
									<input type="checkbox" value="院系介绍" style="width:20px;height:20px" name="gtfields"/><span class="word" style="vertical-align:6px;">院系介绍</span>
								</div>
							</div>
						
						</div>
						<div class="two_content" style="height:190px;">
							<div class="selfdesc word"><span style="font-size: 16px">自我介绍:</span></div>
							<div class="desc" style="text-align: left">
								<textarea class="textarea word" id="selfdescription" name="selfdescription" rows="9" cols="80" style="padding:6px;font-size: 14px;height:170;width:670px"></textarea>
							</div>
						</div>
						<div class="two_content" style="height:190px;">
							<div class="certification word"><span style="font-size: 16px">翻译资质:</span></div>
							<div class="desc" style="text-align: left">
								<textarea class="textarea word" id="certification" name="certification" rows="9" cols="80" style="padding:6px;font-size: 14px;height:170;width:670px"></textarea>
							</div>
						</div>
						<div class="two_content" style="height:80px">
							<div class="fileupload word"><span style="font-size: 16px">上传凭证:</span></div>
							<div class="upload" >
							<iframe src="upload.html" style="WIDTH:100%; HEIGHT:80%;" scrolling="no" frameborder="no">
							</iframe>
							
							</div>
						<div class="two_content" >
							<div class="subspace"></div>
							<div class="sub" style="height: 50px;text-align: left;">
								<input type="submit" id="allsubmit" name="allsubmit" value="提交信息" style="background: #FFE4C4;color: black;font-size: 14px;font-weight: bold;height: 40px;width:180px;margin-left:168px;border-color: #808000"/>
								<input type="reset" id="allreset" name="allreset" value="重置信息" style="background: #FFE4C4;color: black;font-size: 14px;font-weight: bold;height: 40px;width:180px;margin-left: 40px;border-color: #808000"/>
							
							</div>
						</div>
						
					
						
						
						
						
						
						
						
						
					</div></form>
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
