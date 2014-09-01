<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'placeOrder.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link  rel="stylesheet" type="text/css" href="css/xuanfustyle.css">
	<link  rel="stylesheet" type="text/css" href="css/placeOrder.css">
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
			$("input").focus(function()
			{
				$(this).css("border","2px solid lightgray");
			});
			$("input").blur(function()
			{
				$(this).css("border","1px solid lightgray");
			});
			
			
			$("#originp").click(function()
			{ 
			    var ul = $("#origin"); 
			    if(ul.css("display")=="none"){ 
			        ul.slideDown("fast"); 
			    }else{ 
			        ul.slideUp("fast"); 
		   		 } 
		    	
			});
			$("#origin li a").click(function(){
				var txt = $(this).text();
				$("#originlanguage").val(txt);
			    $("#originp").html(txt); 
			    var value = $(this).attr("rel"); 
			    $("#origin").hide(); 
				return false;
			});
			$("#objectp").click(function()
			{ 
			    var ul = $("#object"); 
			    if(ul.css("display")=="none"){ 
			        ul.slideDown("fast"); 
			    }else{ 
			        ul.slideUp("fast"); 
		   		 } 
		    	
			});
			$("#object li a").click(function(){
				var txt = $(this).text(); 
				$("#objectlanguage").val(txt);
			    $("#objectp").html(txt); 
			    var value = $(this).attr("rel"); 
			    $("#object").hide(); 
				return false;
			});
			$("#domainp").click(function()
			{ 
			    var ul = $("#domain"); 
			    if(ul.css("display")=="none"){ 
			        ul.slideDown("fast"); 
			    }else{ 
			        ul.slideUp("fast"); 
		   		 } 
		    	
			});
			$("#domain li a").click(function(){
				var txt = $(this).text(); 
				$("#fromfield").val(txt);
			    $("#domainp").html(txt); 
			    var value = $(this).attr("rel"); 
			    $("#domain").hide(); 
				return false;
			});
			
			$("#allsubmit").click(function()
			{
				
				var title = $("#title").val();
				var wysiwyg = $("#wysiwyg").val();
				var originlanguage = $("#originlanguage").val();
				var objectlanguage = $("#objectlanguage").val();
				var fromfield = $("#fromfield").val();
				
				if(title.length <= 0)
				{
					alert("文章标题不为空！");
					return false;
				}
				if(wysiwyg.length <= 20)
				{
					alert("原文字数太少！");
					return false;
				}
				
				var flag = confirm("原文语言："+ originlanguage+",目标语言:"+objectlanguage+",来自领域:"+fromfield);
				if(!flag) return false;	
				return true;
			});
			
			$("#allreset").click(function()
			{
				 var flag = confirm("你确定放弃所填写的信息？");
				 if(flag)
				 {
				 	$("#wysiwyg").html("");
				 	return true;
				 }
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

  </head>
  
  <body style="background: white">
    <div align="center">
    
    	<div class="divone">
    		<jsp:include page="loginHead.html"></jsp:include>
    	</div>
    	
    	
    	<div class="divtwo">
    	<form action="placeorder" method="post">
    		<div class="two_part01">
		    	<div class="articleinfo">
		    		<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
						<div class="b d1 k">
							<div class="art word" style="font-size: 16px;color:black">原文信息</div>
							<div>
								<div class="infocont"><span class="word">链接:</span><input type="text" id="link" name="link" style="height:35px;width:350px"/></div>
							</div>
							<div>
								<div class="infocont"><span class="word">标题:</span><input type="text" id="title" name="title" style="height:35px;width:350px"/><span style="color:red;margin:auto 2px auto 2px">*</span></div>
							</div>
							<div>
								<div class="infocont"><span class="word">作者:</span><input type="text" id="author" name="author" style="height:35px;width:350px"/></div>
							</div>
							<div>
								<div class="infocont" style="height:78px"><span class="word">简介:</span><textarea class="word" id="description" name="description" style="height:73px;width:350px;vertical-align: middle;"/></textarea></div>
							</div>
						</div>
					<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
		    	</div>
		    	
		    	<div class="articlecontent">
		    		<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
						<div class="b d1 k">
							<div class="art word" style="font-size: 16px;color:black">原文内容</div>
							<jsp:include page="textedit.html"></jsp:include>
						</div>
					<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
		    	</div>
		    	<div class="sub" style="height: 50px;text-align: left;text-align: left">
					<input type="submit" id="allsubmit" name="allsubmit" value="提交订单" style="background: #FFE4C4;color: black;font-size: 14px;font-weight: bold;height: 40px;width:180px;border-color: #808000"/>
					<input type="reset" id="allreset" name="allreset" value="重置订单" style="background: #FFE4C4;color: black;font-size: 14px;font-weight: bold;height: 40px;width:180px;margin-left: 40px;border-color: #808000"/>		
			    </div>
	    	</div>
    		
    		
    		<div class="two_part02">
    			<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
					<div class="b d1 k">
						<div class="art word" style="font-size: 16px;color:black">语种分类</div>
						<div class="laclass">
							
							<div class="min"><span class="word" style="font-size: 14px">原文语种:</span></div>
							<input type="hidden" name="originlanguage" value="英语" id="originlanguage"/>
							<div class="dropdown"> 
							    <p id="originp" class="uilan word">英语</p> 
								    <ul id="origin" class="word"> 
								        <li><a href="#" rel="1">中文</a></li> 
								        <li><a href="#" rel="1">日语</a></li> 
								        <li><a href="#" rel="2">德语</a></li> 
								        <li><a href="#" rel="3">法语</a></li> 
								        <li><a href="#" rel="4">俄语</a></li> 
								        <li><a href="#" rel="4">英语</a></li> 
								        <li><a href="#" rel="5">西班牙语</a></li> 
								    </ul> 
							</div> 
						
						
						</div>
						<div class="laclass">
							<div class="min"><span class="word" style="font-size: 14px">目标语种:</span></div>
							<input type="hidden" name="objectlanguage" value="英语" id="objectlanguage"/>
							<div class="dropdown"> 
							    <p id="objectp" class="uilan word">英语</p> 
								    <ul id="object" class="word"> 
								        <li><a href="#" rel="1">中文</a></li> 
								        <li><a href="#" rel="1">日语</a></li> 
								        <li><a href="#" rel="2">德语</a></li> 
								        <li><a href="#" rel="3">法语</a></li> 
								        <li><a href="#" rel="4">俄语</a></li> 
								        <li><a href="#" rel="4">英语</a></li> 
								        <li><a href="#" rel="5">西班牙语</a></li> 
								    </ul> 
							</div> 
						
						</div>
						<div class="laclass">
							<div class="min"><span class="word" style="font-size: 14px">翻译领域:</span></div>
							<input type="hidden" name="fromfield" value="学生论文" id="fromfield"/>
							<div class="dropdown"> 
							    <p id="domainp" class="uilan word">学生论文</p> 
								    <ul id="domain" class="word"> 
								        <li><a href="#" rel="1">校园广播</a></li> 
								        <li><a href="#" rel="2">老师简介</a></li> 
								        <li><a href="#" rel="3">重要会议</a></li> 
								        <li><a href="#" rel="4">校园通知</a></li> 
								        <li><a href="#" rel="5">娱乐生活</a></li> 
								        <li><a href="#" rel="5">学生论文</a></li> 
								    </ul> 
							</div> 
						
						</div>
					</div>
				
				<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    		
    		</div>
    		
    		
    	</form>
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
