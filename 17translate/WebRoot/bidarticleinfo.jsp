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
	
	
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.3/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.3/demo/demo.css">
	<link href="css/skin.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="jquery-easyui-1.3.3/jquery.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
	
	
	<link  rel="stylesheet" type="text/css" href="css/jquery.simple-dtpicker.css">
	<script type="text/javascript" src="js/jquery.simple-dtpicker.js"></script> 
	
	
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


function bidsubmit()
{
	var bidprice = $("#bidprice").val();
	var latestdate = $("#mlatestdate").val();
	var leftwords = $("#leftwords").val();
	var formid = $("#formid").val();
	if(bidprice.length == 0)
	{
		 $.messager.alert('警告','竞标价不可为空!','error');
		 return;
	}
	else
	{
		var index = bidprice.indexOf("0");  
		if(index == 0 && bidprice.length > 1)
		{
			var reg = /^[0]{1}[.]{1}[0-9]{1,2}$/; 
			if(!reg.test(bidprice))
			{  
				$.messager.alert('提示','请填写一个合格的竞标价格!','info');
                return;  
            }
		}
		else
		{
			var reg = /^[1-9]{1}[0-9]{0,10}[.]{0,1}[0-9]{0,2}$/; 
			if(!reg.test(bidprice))
			{  
				$.messager.alert('提示','竞标价格格式不正确!','info');
                return;  
            } 
		}
	}
	
	if(latestdate.length <= 0)
	{
		 $.messager.alert('警告','最迟交付时间不可为空!','error');
		 return;
	}
	else 
	{
		var rege = /\d{4}-\d{2}-\d{2}\s\d{2}:\d{2}$/;
		if(!rege.test(latestdate))
		{
			$.messager.alert('提示','日期格式不正确!','info');
			return;
		}
	}
	
	  $.ajax({  
            url: 'bidrequest',  
            type: 'post',  
            data: {bidprice:bidprice,latestdate:latestdate,leftwords:leftwords,formid:formid},  
            success: function(data)
					{
						//var dataObj = eval("(" + data +")");
						if(data.result == 'true')
						{
							$.messager.alert('提示','提交竞标信息成功!','info');
							$('#w').window('close');
						}
					}
            });
}








function showEWM(){
			document.getElementById("EWM").style.display = 'block';
		}
function hideEWM(){
	document.getElementById("EWM").style.display = 'none';
}

</script>
<%
	//News thisnews = (News)session.getAttribute("thisnews");
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
					
					
				
			
						&nbsp;&nbsp;你好世界，世界你好。					
	
					
					
				</div>
			<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    	</div>
    	
    	<div class="two_part02" >
    		
    		<div id="types">
    		
    			<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
				<div class="b d1 h" >
					<div class="d01" style="height:360px">
							<div style="width:100%;height:27px;border-bottom:1px solid lightgray;text-align: left;margin-top: 2px">
								<span style="font-size: 15;font-weight: bold;color:rgba(159, 140, 140, 1);margin-left:10px">文章信息</span>
							</div>
							<div style="width:97%;height:260px;padding: 0px;">
								
								
								<div class="info">
								 
								   <div class="item" style="height: 20px">
								   		<span class="word1" >标题：</span>
								   </div>
								   <div class="item">
								   		<span class="word1" style="font-size: 15px;color:rgba(154, 174, 55, 1)">1232324</span>
								   </div>
								   <div class="item" style="height: 20px">
								   		<span class="word1" >作者：<span style="color:rgb(110,110,110)">12</span></span>
								   </div>
								   <div class="item">
								   		<span class="word1">原文语言：<span style="color:rgb(110,110,110)">中文</span>&nbsp;&nbsp;目标语言：<span style="color:rgb(110,110,110)">英语</span></span>
								   </div>
								   <div class="item">
								   		<span class="word1">翻译领域：<span style="color:rgba(164,60,52,1)">学生论文</span>&nbsp;&nbsp;原文字数：<span style="color:rgba(164,60,52,1)">1200</span></span>
								   </div>
								   <div class="item" style="height: 20px">
								   		<span class="word1">最迟交付时间：<span style="color:rgba(164,60,52,1)">2014-10-09 21:31</span></span>
								   </div>
								   <div class="item" style="height: 20px">
								   		<span class="word1">建议竞标价格：<span style="color:rgba(183,21,21,1);font-weight: bold">￥100</span></span>
								   </div>
								   <div class="item" style="height: 20px">
								   		<span class="word1" >原文链接：</span>
								   </div>
								   <div class="item">
								   		<span><a href="" style="color:rgb(110,110,110)">12</a></span>
								   </div>
								   <div class="item">
								   		<span class="word1" >简介：</span>
								   </div>
								   <div class="item" style="height:80px;overflow: auto">
										<span class="word1" style="color:rgb(110,110,110)">12</span>
								   </div>
								</div>
								
							</div>
					</div>
				
    		</div>
    		<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    	</div>
    	
    	<div id="bid">
    		
    		<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
				<div class="b d1 h" >
				
					<div style="width:100%;height:27px;border-bottom:1px solid lightgray;text-align: left;margin-top: 2px">
						<span style="font-size: 15;font-weight: bold;color:rgba(36, 2, 149, 1);margin-left:10px">我要竞标</span>
					</div>
					
					<div style="width:97%;height:260px;padding: 0px;margin-top: 8px">
						<form id="bidform" action="" method="post">
							<table width="100%" cellspacing="1" cellpadding="2" border="0" align="center" class="word1">
								<tr>
				                    <td style="width: 100px;height:30px" >我的竞标价：</td>
				                    <td><input style="width:126px;height:24px" id="bidprice" name="bidprice"/> 元</td>
	             			    </tr>
	             			    <tr>
				                    <td style="width: 100px;height:30px" >最迟交付时间：</td>
				                    <td>
				                    	
										<input type="hidden" name="formid" value="#id" id="formid"/>
										<div class="dropdown"> 
										   <input type="text" id="mlatestdate" name="mlatestdate" value="" style="width:190px;min-height:24px;padding:4px;" >
												<script type="text/javascript">
													$(function(){
														$('*[name=mlatestdate]').appendDtpicker();
													});
													
												</script>
										</div> 
				                    
				                    </td>
	                			</tr>	
	                			
	                			 <tr>
				                    <td style="width: 100px;height:30px;vertical-align: top;" >我的留言：</td>
				                    <td><textarea style="width:190px;height:144px" id="leftwords" name="leftwords" class=""/></textarea></td>
	            			     </tr>
	                			 
	                			 <tr>
	                			 	<td colspan="3" style="text-align: right;padding-top: 8px">
	                			 		<input class="button" id="i51bid" type="button" value="竞标" style="padding:2px 6px 2px 6px;color:rgba(171, 12, 12, 1)" onclick="bidsubmit();"/>
	                			 		<input class="button" id="i51bid" type="button" value="清空" style="padding:2px 6px 2px 6px" onclick="bidformclear"/>
	                			 	</td>
	                			 </tr>
	                				
							</table>
						</form>
					
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
