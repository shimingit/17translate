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
	
	
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.3/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.3/demo/demo.css">
	<link href="css/skin.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="jquery-easyui-1.3.3/jquery.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
	
	<link  rel="stylesheet" type="text/css" href="css/jquery.simple-dtpicker.css">
	<script type="text/javascript" src="js/jquery.simple-dtpicker.js"></script> 
	
	
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
	
});
function i51bid(formid)
{
	$('#w').window('setTitle','我要竞标');
	$('#w').window('open');
	$('#ff').form('clear');
	$('#ff').attr("action","bidrequest");
	$("#formid").val(formid);
}
function bidsubmit()
{
	var bidprice = $("#bidprice").val();
	var latestdate = $("#latestdate").val();
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
	
		
	return false;
}


function showEWM(){
			document.getElementById("EWM").style.display = 'block';
		}
function hideEWM(){
	document.getElementById("EWM").style.display = 'none';
}

</script>
<%
	List<PublicNewsId> publicnews = (List<PublicNewsId> )session.getAttribute("publicnews");
	if(null == publicnews)
		publicnews = new ArrayList<PublicNewsId>();
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
					
					<div style="width:100%;height:32px;border-bottom: 1px solid rgb(232,232,232);margin-top:5px;text-align: left"><span class="word" style="margin-left:6px;font-size: 15px;">在线竞标任务</span></div>
					
					
					
				<div style="width:100%;height:712px;">
				
					<div  class="specialnews" style="border-bottom:1px solid rgba(230,225,225,1);height:110px">
						<div class="title" >
							<span class="word1"><a href="#" style="color:rgba(37,110,206,1)">春天里的一米阳光</a>&nbsp;&nbsp;&nbsp;<span style="font-weight: normal">作者：小石头</span></span>
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								原文语种：中文&nbsp;&nbsp;目标语种：英语&nbsp;&nbsp;建议翻译价格：￥<span style="color:rgba(183,21,21,1);font-weight: bold">100</span>
							</span>
							<span class="word1" style="float: right;font-weight: normal">翻译状态：<span style="color:red">待翻译</span></span>
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								翻译领域：<span style="color:rgba(164,60,52,1)">学生论文</span>&nbsp;&nbsp;原文字数：<span style="color:rgba(164,60,52,1)">1000</span>&nbsp;&nbsp;最迟交付时间：<span style="color:rgba(164,60,52,1)">2014-10-09 21:31</span>
							</span>
							
							<span class="word1" style="float: right">
								<input class="button" id="detailbidinfo" type="button" value="详细信息" style="padding:2px 4px 2px 4px;font-weight: normal"/>
							</span>
							
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								原文链接：<a href="#" style="color:rgb(106,106,140,1)">################</a>
							</span>
							
							<span class="word1" style="float: right;font-weight: normal">
								<input class="button" id="51bid" type="button" value="我要竞标" style="padding:2px;color:rgba(125,132,9,1)" onclick="i51bid(this.id);"/>
							</span>
							
						</div>
					</div>
					<div  class="specialnews" style="border-bottom:1px solid rgba(230,225,225,1);height:110px">
						<div class="title" >
							<span class="word1"><a href="#" style="color:rgba(37,110,206,1)">春天里的一米阳光</a>&nbsp;&nbsp;&nbsp;<span style="font-weight: normal">作者：小石头</span></span>
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								原文语种：中文&nbsp;&nbsp;目标语种：英语&nbsp;&nbsp;建议翻译价格：￥<span style="color:rgba(183,21,21,1);font-weight: bold">100</span>
							</span>
							<span class="word1" style="float: right;font-weight: normal">翻译状态：<span style="color:red">待翻译</span></span>
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								翻译领域：<span style="color:rgba(164,60,52,1)">学生论文</span>&nbsp;&nbsp;译文字数：<span style="color:rgba(164,60,52,1)">1000</span>&nbsp;&nbsp;最迟交付时间：<span style="color:rgba(164,60,52,1)">2014-10-09 21:31</span>
							</span>
							
							<span class="word1" style="float: right">
								<input class="button" id="detailbidinfo" type="button" value="详细信息" style="padding:2px 4px 2px 4px;font-weight: normal"/>
							</span>
							
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								原文链接：<a href="#" style="color:rgb(106,106,140,1)">################</a>
							</span>
							
							<span class="word1" style="float: right;font-weight: normal">
								<input class="button" id="51bid" type="button" value="我要竞标" style="padding:2px;color:rgba(125,132,9,1)"/>
							</span>
							
						</div>
					</div>
					<div  class="specialnews" style="border-bottom:1px solid rgba(230,225,225,1);height:110px">
						<div class="title" >
							<span class="word1"><a href="#" style="color:rgba(37,110,206,1)">春天里的一米阳光</a>&nbsp;&nbsp;&nbsp;<span style="font-weight: normal">作者：小石头</span></span>
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								原文语种：中文&nbsp;&nbsp;目标语种：英语&nbsp;&nbsp;建议翻译价格：￥<span style="color:rgba(183,21,21,1);font-weight: bold">100</span>
							</span>
							<span class="word1" style="float: right;font-weight: normal">翻译状态：<span style="color:red">待翻译</span></span>
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								翻译领域：<span style="color:rgba(164,60,52,1)">学生论文</span>&nbsp;&nbsp;译文字数：<span style="color:rgba(164,60,52,1)">1000</span>&nbsp;&nbsp;最迟交付时间：<span style="color:rgba(164,60,52,1)">2014-10-09 21:31</span>
							</span>
							
							<span class="word1" style="float: right">
								<input class="button" id="detailbidinfo" type="button" value="详细信息" style="padding:2px 4px 2px 4px;font-weight: normal"/>
							</span>
							
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								原文链接：<a href="#" style="color:rgb(106,106,140,1)">################</a>
							</span>
							
							<span class="word1" style="float: right;font-weight: normal">
								<input class="button" id="51bid" type="button" value="我要竞标" style="padding:2px;color:rgba(125,132,9,1)"/>
							</span>
							
						</div>
					</div>
					<div  class="specialnews" style="border-bottom:1px solid rgba(230,225,225,1);height:110px">
						<div class="title" >
							<span class="word1"><a href="#" style="color:rgba(37,110,206,1)">春天里的一米阳光</a>&nbsp;&nbsp;&nbsp;<span style="font-weight: normal">作者：小石头</span></span>
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								原文语种：中文&nbsp;&nbsp;目标语种：英语&nbsp;&nbsp;建议翻译价格：￥<span style="color:rgba(183,21,21,1);font-weight: bold">100</span>
							</span>
							<span class="word1" style="float: right;font-weight: normal">翻译状态：<span style="color:red">待翻译</span></span>
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								翻译领域：<span style="color:rgba(164,60,52,1)">学生论文</span>&nbsp;&nbsp;译文字数：<span style="color:rgba(164,60,52,1)">1000</span>&nbsp;&nbsp;最迟交付时间：<span style="color:rgba(164,60,52,1)">2014-10-09 21:31</span>
							</span>
							
							<span class="word1" style="float: right">
								<input class="button" id="detailbidinfo" type="button" value="详细信息" style="padding:2px 4px 2px 4px;font-weight: normal"/>
							</span>
							
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								原文链接：<a href="#" style="color:rgb(106,106,140,1)">################</a>
							</span>
							
							<span class="word1" style="float: right;font-weight: normal">
								<input class="button" id="51bid" type="button" value="我要竞标" style="padding:2px;color:rgba(125,132,9,1)"/>
							</span>
							
						</div>
					</div>
					<div  class="specialnews" style="border-bottom:1px solid rgba(230,225,225,1);height:110px">
						<div class="title" >
							<span class="word1"><a href="#" style="color:rgba(37,110,206,1)">春天里的一米阳光</a>&nbsp;&nbsp;&nbsp;<span style="font-weight: normal">作者：小石头</span></span>
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								原文语种：中文&nbsp;&nbsp;目标语种：英语&nbsp;&nbsp;建议翻译价格：￥<span style="color:rgba(183,21,21,1);font-weight: bold">100</span>
							</span>
							<span class="word1" style="float: right;font-weight: normal">翻译状态：<span style="color:red">待翻译</span></span>
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								翻译领域：<span style="color:rgba(164,60,52,1)">学生论文</span>&nbsp;&nbsp;译文字数：<span style="color:rgba(164,60,52,1)">1000</span>&nbsp;&nbsp;最迟交付时间：<span style="color:rgba(164,60,52,1)">2014-10-09 21:31</span>
							</span>
							
							<span class="word1" style="float: right">
								<input class="button" id="detailbidinfo" type="button" value="详细信息" style="padding:2px 4px 2px 4px;font-weight: normal"/>
							</span>
							
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								原文链接：<a href="#" style="color:rgb(106,106,140,1)">################</a>
							</span>
							
							<span class="word1" style="float: right;font-weight: normal">
								<input class="button" id="51bid" type="button" value="我要竞标" style="padding:2px;color:rgba(125,132,9,1)"/>
							</span>
							
						</div>
					</div>
					<div  class="specialnews" style="border-bottom:1px solid rgba(230,225,225,1);height:110px">
						<div class="title" >
							<span class="word1"><a href="#" style="color:rgba(37,110,206,1)">春天里的一米阳光</a>&nbsp;&nbsp;&nbsp;<span style="font-weight: normal">作者：小石头</span></span>
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								原文语种：中文&nbsp;&nbsp;目标语种：英语&nbsp;&nbsp;建议翻译价格：￥<span style="color:rgba(183,21,21,1);font-weight: bold">100</span>
							</span>
							<span class="word1" style="float: right;font-weight: normal">翻译状态：<span style="color:red">待翻译</span></span>
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								翻译领域：<span style="color:rgba(164,60,52,1)">学生论文</span>&nbsp;&nbsp;译文字数：<span style="color:rgba(164,60,52,1)">1000</span>&nbsp;&nbsp;最迟交付时间：<span style="color:rgba(164,60,52,1)">2014-10-09 21:31</span>
							</span>
							
							<span class="word1" style="float: right">
								<input class="button" id="detailbidinfo" type="button" value="详细信息" style="padding:2px 4px 2px 4px;font-weight: normal"/>
							</span>
							
						</div>
						<div class="field">
							<span class="word1" style="font-weight: normal">
								原文链接：<a href="#" style="color:rgb(106,106,140,1)">################</a>
							</span>
							
							<span class="word1" style="float: right;font-weight: normal">
								<input class="button" id="51bid" type="button" value="我要竞标" style="padding:2px;color:rgba(125,132,9,1)"/>
							</span>
							
						</div>
					</div>
					
					
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
    		<div id="types" style="margin-top:0px">
    		
    			<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
				<div class="b d1 k" style="height:69%">
					<div class="d01">
							<div style="width:100%;height:27px;border-bottom:1px solid lightgray;text-align: left;margin-top: 2px">
								<span style="font-size: 15;font-weight: bold;color:#A9A9A9;margin-left:10px">竞标原则</span>
							</div>
							
							<div style="width:97%;height:130px;">
									
							</div>
					
					</div>
					
					
					
					
					
					<div class="d03">
						
						<div style="width:100%;height:27px;border-bottom:1px solid lightgray;border-top:1px solid lightgray;text-align: left;margin-top: 2px">
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


<div id="w" class="easyui-window" data-options="iconCls:'icon-save',closed:true,modal:true">
		<div style="text-align:center; padding:1px;">
			<form id="ff" method="post">
			<input type="hidden" id="formid" name="formid" value=""/>
			<table width="340px" cellspacing="1" cellpadding="2" border="0" align="center">
					<tr>
	                    <td style="width: 100px;height:30px" >我的竞标价：</td>
	                    <td><input style="width:166px;height:24px" id="bidprice" name="bidprice"/> 元</td>
	                </tr>
					<tr>
	                    <td style="width: 100px;height:30px" >最迟交付时间：</td>
	                    <td>
	                    	
							<input type="hidden" name="fromfield" value="学生论文" id="fromfield"/>
							<div class="dropdown"> 
							   <input type="text" id="latestdate" name="latestdate" value="" style="width:180px;min-height:24px;padding:4px;" >
									<script type="text/javascript">
										$(function(){
											$('*[name=latestdate]').appendDtpicker();
										});
									</script>
							</div> 
	                    
	                    </td>
	                </tr>
	                <tr>
	                    <td style="width: 100px;height:30px;vertical-align: top;" >我的留言：</td>
	                    <td><textarea style="width:180px;height:124px" id="leftwords" name="leftwords" class=""/></textarea></td>
	                </tr>
			</table>
			</form>
		</div>
		<div style="text-align:center;padding:5px;">
	        <a href="javascript:void(0)" onclick="bidsubmit();" id="btn-ok" class="easyui-linkbutton" icon="icon-save">竞标</a>  
	        <a href="javascript:void(0)" id="btn-cancel" class="easyui-linkbutton" icon="icon-cancel" onclick="$('#w').window('close');">放弃</a> 
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
