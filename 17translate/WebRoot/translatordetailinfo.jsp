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
	
	<link rel="stylesheet" type="text/css" href="css/style.css" media="all" />
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
	 $('.tabPanel ul li').click(function(){
		$(this).addClass('hit').siblings().removeClass('hit');
		$('.panes>div:eq('+$(this).index()+')').show().siblings().hide();	
	})
	 
	 
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

    <div class="divtwo" style="height: auto">
    	
    	<div class="two_part01" style="float: right;width:74%;height:auto">
		marg
				<div class="b d1 k" style="height:auto">
					
					<div style="width:100%;height:32px;border-bottom: 1px solid rgb(232,232,232);margin-top:5px;text-align: left"><span class="word" style="margin-left:6px;font-size: 15px;">校园新闻领域翻译员</span>
					</div>
					
					
					
				<div style="width:100%;text-align: left">
				
					
					<div class="translatordetail">
						<div id="info1">
							<div id="left">
								<img src="#" style="height:300px;width:308px;margin: 2px auto 2px 6px;">
								
							</div>
							
							<div id="right">
								<div style="width:100%;height:40px;background: #fff6e3;">
									<p style="line-height: 40px;padding-left: 4px"><img  src="images/shopbg.png" />为了保障交易双方的最大化利益和规范交易流程，建议通过平台交易</p>
								</div>
								
								<div style="width:100%;height:30px;">
									<span class="word1" style="line-height: 30px;margin-left: 20px;color: rgba(132, 50, 50, 1);font-size: 16px">已通过实名认证</span>
								</div>	
								<div style="width:100%;height:32px;">
									<span class="word1" style="font-weight: normal;margin-left: 20px">起步价：￥<span style="line-height: 32px;color: red;font-size: 22px">50</span></span>
								</div>	
								<div style="width:100%;height:32px;">
									<span class="word1" style="font-weight: normal;margin-left: 20px;line-height: 32px">支付方式：<img src="images/zhifubao.jpg" style="width:48px;height:32px;cursor: pointer;"/></span>
								</div>	
								<div style="width:100%;height:32px;">
									<span class="word1" style="font-weight: normal;margin-left: 20px">累计成交次数：<span style="line-height: 32px;color: red;">20</span> 次</span>
								</div>	
								<div style="width:100%;height:32px;">
									<span class="word1" style="font-weight: normal;margin-left: 20px">所有评论：<span style="line-height: 32px;"><a href="#" style="color: blue;">25</a></span> 条</span>
								</div>	
								<div style="width:100%;height:32px;">
									<span class="word1" style="font-weight: normal;margin-left: 20px;line-height: 32px">当前状态：空闲</span>
								</div>	
								
								<div style="width:100%;height:32px;">
									<span class="word1" style="font-weight: normal;margin-left: 20px;line-height: 32px">浏览次数：132 次</span>
								</div>	
																
								<div style="height:10px"></div>
								<div> 
									<input class="button" type="submit" value="找TA翻译" style="padding: 6px;margin-left: 20px">&nbsp;&nbsp;
									<input class="button" type="submit" value="Ta的联系方式" style="padding: 6px">
								</div>
								
								
								
							</div>
						</div>					
						<div id="info2">
						
							<div class="tabPanel" style="margin-top:10px">
								<ul>
									<li class="hit">翻译经验</li>
									<li>评价详情</li>
									<li>成交记录</li>
									<li>给Ta留言</li>
								</ul>
								<div class="panes">
									<div class="pane" style="display:block;">
										<div style="width:98%;">
											<p class="word1" style="font-size: 18px;color:red">服务内容：</p>
											<p class="word1" style="font-size: 18px;font-weight: normal;">
												服务内容描述
											</p>
										</div>
										<div style="width:98%;">
											<p class="word1" style="font-size: 18px;color:red">相关经验：</p>
											<p class="word1" style="font-size: 18px;font-weight: normal;">
												相关经验描述
											</p>
										</div>
									</div>
									
									<div class="pane">
										<p class="word1" style="font-size: 18px;font-weight: normal;">
											评价内容
										</p>
									</div>
									<div class="pane">
										<div style="width:100%;height:38px;border-bottom: 2px solid rgba(185, 80, 22, 0.87);">
										
											<p class="word1" style="line-height: 26px;font-size: 15px;font-weight: bold;">成交记录</p>
										
										</div>
										<br>
										<table width="100%" cellspacing="1" cellpadding="2" border="0" align="center" class="word1" style="font-size: 13px;">
											<tr style="border-bottom:1px solid rgba(233, 203, 203, 1);height: 30px">
												<th style="font-weight: bold">客户</th>
												<th style="font-weight: bold">订单号</th>
												<th style="font-weight: bold">成交金额</th>
												<th style="font-weight: bold">交易时间</th>
											</tr>
										
										</table>								
									</div>
									<div class="pane">
										<p class="word1" style="font-size: 18px;font-weight: normal;">
											留言内容
										</p>
									</div>
								</div>
						    </div>
						
						</div>
					</div>
				</div>
					
					
					
					
					
				</div>
			<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    	</div>
    	
    	<div class="two_part02" style="margin-left:0;width:24%;height: auto">
    	
    		<div id="type" style="margin-top: 0px;">
    		
    			<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
				<div class="b d1 k" style="height: auto">
					<div class="d01" style="height:auto">
							<div style="width:100%;height:27px;border-bottom:1px solid lightgray;text-align: left;margin-top: 2px">
								<span style="font-size: 15;font-weight: bold;color:rgba(16, 111, 101, 1);margin-left:10px">译员信息</span>
							</div>
						
							<div style="width:100%;height:180px;text-align: left;border-bottom:1px solid rgba(225, 219, 219, 1);margin-top: 4px;padding: 4px">
								<div style="width:40%;height:100px;float: left">
									<img id="trnimg" src="" style="width:100%;height:100%">
								</div>
								<div style="width:50%;height:100px;float: left;margin-left: 10px">
									<p class="word1" style="font-weight: normal;line-height: 22px">用户名：小石头</p>
									<p class="word1" style="font-weight: normal;line-height: 22px">翻译等级：中级</p>
									<p class="word1" style="font-weight: normal;line-height: 22px">粉丝数：20 个</p>
									<p class="word1" style="font-weight: normal;line-height: 22px">信誉值：120</p>
									
								</div>
								<div style="width:96%;height:76px;float: left;margin-top: 4px">
									<p class="word1" style="font-weight: normal;line-height: 22px">翻译积分：100</p>
									<p class="word1" style="font-weight: normal;line-height: 22px">交易次数：100 次</p>
									<p class="word1" style="font-weight: normal;line-height: 22px">参与翻译：100 次</p>
								</div>
							</div>
							
							<div style="width:100%;border-bottom:1px solid rgba(225, 219, 219, 1)">
								<div style="width:100%;height:25px;text-align: left;background: rgba(219, 226, 231, 0.5)">
									<span class="word1">&nbsp;&nbsp;服务保障</span>
								</div>
								<div style="width:100%;text-align: left;padding-left: 4px">
									<div style="width:100%;height:20px;">
										<span style="font-weight: normal;line-height: 24px"><img src="images/bao.jpg" style="width:18px;height:20px">按时交稿</span>
									</div>
									<div style="width:100%;height:20px;">
										<span style="font-weight: normal;line-height: 24px"><img src="images/bao.jpg" style="width:18px;height:20px">保证原创</span>
									</div>
									<div style="width:100%;height:20px;">
										<span style="font-weight: normal;line-height: 24px"><img src="images/bao.jpg" style="width:18px;height:20px">免费修改</span>
									</div>
									<div style="width:100%;height:20px;">
										<span style="font-weight: normal;line-height: 24px"><img src="images/bao.jpg" style="width:18px;height:20px">物归原主</span>
									</div>
									<div style="height:4px"></div>
								</div>
							</div>
							
							<div style="width:100%;">
								<div style="width:100%;height:25px;text-align: left;background: rgba(219, 226, 231, 0.5)">
									<span class="word1">&nbsp;&nbsp;人才标签</span>
								</div>
								<div style="width:100%;text-align: left;">
									<div style="width:50px;height:20px;border:1px solid rgba(128, 128, 128, 0.11);background:rgba(231, 224, 224, 0.47);padding: 0 2px 0 3px;cursor: pointer;margin: 6px 4px 2px 6px;float: left">
										校园广播
									</div>
									<div style="width:50px;height:20px;border:1px solid rgba(128, 128, 128, 0.11);background:rgba(231, 224, 224, 0.47);padding: 0 2px 0 3px;cursor: pointer;margin: 6px 4px 2px 6px;float: left">
										重要会议
									</div>
									<div style="width:50px;height:20px;border:1px solid rgba(128, 128, 128, 0.11);background:rgba(231, 224, 224, 0.47);padding: 0 2px 0 3px;cursor: pointer;margin: 6px 4px 2px 6px;float: left">
										学生论文
									</div>
									<div style="width:50px;height:20px;border:1px solid rgba(128, 128, 128, 0.11);background:rgba(231, 224, 224, 0.47);padding: 0 2px 0 3px;cursor: pointer;margin: 6px 4px 2px 6px;float: left">
										校园新闻
									</div>
									<div style="width:50px;height:20px;border:1px solid rgba(128, 128, 128, 0.11);background:rgba(231, 224, 224, 0.47);padding: 0 2px 0 3px;cursor: pointer;margin: 6px 4px 2px 6px;float: left">
										校园新闻
									</div>
									<div style="width:50px;height:20px;border:1px solid rgba(128, 128, 128, 0.11);background:rgba(231, 224, 224, 0.47);padding: 0 2px 0 3px;cursor: pointer;margin: 6px 4px 2px 6px;float: left">
										校园新闻
									</div>
									<div style="width:50px;height:20px;border:1px solid rgba(128, 128, 128, 0.11);background:rgba(231, 224, 224, 0.47);padding: 0 2px 0 3px;cursor: pointer;margin: 6px 4px 2px 6px;float: left">
										校园新闻
									</div>
									
									<div style="height:6px;float: left;width: 100%;border-bottom:1px solid rgba(225, 219, 219, 1)"></div>
								</div>
							</div>
							
							<div style="width:100%;float: left">
								<div style="width:100%;height:25px;text-align: left;background: rgba(219, 226, 231, 0.5)">
									<span class="word1">&nbsp;&nbsp;Ta的简介</span>
								</div>
								<div>
									<p class="word1" style="font-weight: normal;text-align: left;padding: 4px">&nbsp;&nbsp;&nbsp;中华人民共和国</p>
								</div>
								<div style="height:30px"></div>
							</div>
							
					</div>
					
					
					
				</div>
				<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    		
    		</div>
    	</div>
    
    </div>
	<div style="height: 2px;clear: both;"></div>
	<div class="divthree" style="">
		
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
