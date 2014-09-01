<%@ page language="java" import="java.util.*,org.translate.min.entity.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'freeinfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/liveininfo.css">
	
	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script> 
	<link href="css/box_style.css" type="text/css" rel="stylesheet" />
	<script type="text/javascript" src="js/jquery.XYTipsWindow.min.2.8.js"></script>
	
	
	<link href="css/skin.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.3/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.3/demo/demo.css">
	<script type="text/javascript" src="jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript">
		$(function()
		{
			//$("#myimg").attr("src","myphoto?" + Math.random() );
			$("#livein").click(function()
			{
				location.href = "joinus.jsp";
			});
			
			$("#img").click(function()
			{
				$.XYTipsWindow
				({
					___title:"我们会为你而感到骄傲~",
					___content:"iframe:uppicture.jsp",
					___width:"356",
					___height:"175",
					___showbg:true,
					___drag:"___boxTitle"
				});
				
				return false;
			});
			
			$("#rolein").click(
				function()
				{
					$('#w').window('setTitle','实名认证');
			  		$('#w').window('open');
					$('#ff').form('clear');
					$('#ff').attr("action","addNews");
				}
			);
			
			$("#addimg").click(function()
			{
				var inputcount = $("input[name='zhengjian']").size()+1;
				var idname= 'zhengjian' + inputcount;
				var trname = 'tr' + inputcount;
				var trelement = "<tr id='"+trname+"'><td></td><td>" +'<input type="file" id='+idname+' name="zhengjian" style="display: none;" onchange="ye2.value=value">'+
									'&nbsp;<input name="ye2" style="color: green;height: 25px"><input type="button" value="选择图片" onclick="'+idname+'.click()" style="border: 1px solid gray;background:rgb(220,220,220);width: 60px">'+
									'&nbsp;<input type="button" value="删除" onclick="removetr(\''+trname+'\');" style="border: 1px solid gray;background:rgb(220,220,220);width: 60px">'
													+
									"</td></tr>";
				$(trelement).insertAfter("#insertpoint");
			});
			
		
			
		});
	function removetr(idname)
	{
		$(document.getElementById(idname)).remove();
	}
	function addarea(hasrolein)
	{
		//alert(hasrolein);
	 	if('no' == hasrolein)
		{
	    	$.messager.alert('提示','通过实名认证后才可申请加入更多领域!','info');
	    	return false;
		} 
		$.XYTipsWindow
		({
			___title:"申请入驻更多的领域，不超过3个~",
			___content:"iframe:addbelongsfield.jsp",
			___width:"326",
			___height:"255",
			___showbg:true,
			___drag:"___boxTitle"
		});
		
	}
	</script>
	
<%
	LiveinTranslator myinfo = (LiveinTranslator)session.getAttribute("myinfo");
	if(null == myinfo)
		myinfo = new LiveinTranslator();
	
	List<String> mylabel = (ArrayList<String>)session.getAttribute("mylabel");
	if(null == mylabel)
		mylabel = new ArrayList<String>();
	List<String> mybelongsfield = (ArrayList<String>)session.getAttribute("mybelongsfield");
	if(null == mybelongsfield)
		mybelongsfield = new ArrayList<String>();
	System.out.println(basePath);
 %>
  </head>
  
  <body>
    <div align="center" >
    	<div class="divone" style="margin-top: 0">
    		<jsp:include page="loginHead.html"></jsp:include>	
    	</div>

    	<div class="divtwo">
    	
    		<div class="two_partone">
    			<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
				 <div class="b d1 h">
				 	<div class="divimg">
				 		<img id="myimg" src='<%=basePath+"imgrepository/minshi/minshi.jpg"%>'/>
				 		<form action="">
				 			<input  type="button" class="button" id="img" name="img" value="上传照片"/>
				 		</form>
				 	</div>
				 	<div class="divname">
				 		<table style="width: 180px;margin-top: 2px;">
				 			<tr>
				 				<td colspan="2" style="color:#008B8B"><a href="#" style="font-weight: bold;"><%=myinfo.getLuserName() %></a></td>
				 			</tr>
				 			<tr>
				 				<td>姓名：</td>
				 				<td><%=myinfo.getLrealName() %></td>
				 			</tr>
				 			<tr>
				 				<td>电话:</td>
				 				<td><%=myinfo.getLphoneNumber() %></td>
				 			</tr>

				 			<tr>
				 				<td colspan="2" style="height:20px;">邮箱：</td>
				 			</tr>
				 			<tr>
				 				<td colspan="2" style="height:20px"><%=myinfo.getLmailBox() %></td>
				 			</tr>
				 		</table>
				 	</div>
				    <div class="items">
				    	<div id="item">
				    		<span class="word"><a href="myliveindraft">我的草稿</a></span>
				    	</div>
				    	<div id="item">
				    		<span class="word"><a href="myliveintranslate">我的翻译</a></span>
				    	</div>
				    	<div id="item">
				    		<span class="word"><a href="liveininfo.jsp">我的资料</a></span>
				    	</div>
				    	<div id="item">
				    		<span class="word"><a href="#">我的钱包</a></span>
				    	</div>
				    	<div id="item">
				    		<span class="word"><a href="myliveinnotice">我的通知</a></span>
				    	</div>
				    </div>
				 </div>
    			<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
    			
    						
    		</div>


    		<div class="two_parttwo">
    			<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
				 <div class="b d1 k">
				 	<div class="desctitle">
				 		<span class="word" style="line-height: 40px;margin-left: 10px">我的简介</span>
				 	<%if(myinfo.getHasLivein().equals("no")) {%>
				 	<input id="livein" class="button" type="submit" value="马上入驻平台" style="padding: 6px;vertical-align: -2px;margin-top: 0px;margin-left: 30px">
				 	<%}else if(myinfo.getHasregister().equals("no")){%>
				 		<span class="word" style="line-height: 30px;margin-left: 10px;font-size: 13px;font-weight: normal;color: rgba(237, 10, 58, 1)">你还未进行实名认证，认证通过后将优先推荐翻译任务</span>
				 		<input id="rolein" class="button" type="submit" value="马上实名认证" style="padding: 6px;vertical-align: -2px;margin-top: 0px;">
				 	<% }%>
				 	
				 	</div>
				 	<div class="desc">
				 		<span class="word" style="margin-left:14px;color: gray;font-size: 12px;"><%=myinfo.getLselfDescription() %></span>
				 	</div>
				 	<div class="detialinfo">
				 		<div style="width:100%;height:40px;line-height: 40px;text-align: left;border-bottom: 1px dotted rgb(210,210,210);">
				 			<span class="word" style="margin-left:10px;">平台信息</span>
				 			<span class="word1" style="light-height:40px;margin-left: 428px;"><a href="joinus.jsp">修改资料</a></span>
				 			<span class="word1" style="light-height:40px;margin-left: 4px;"><a href="joinus.jsp">修改密码</a></span>
				 		</div>
				 		<div class="infoitem">
				 			<span class="word" style="margin-left:10px;float: left;color: gray;font-size: 12px;">入驻平台已：</span>
				 			&nbsp;&nbsp;&nbsp;&nbsp;
				 			<span class="word" style="margin-left:10px;float: left;color: gray;font-size: 12px;"><%=myinfo.getLiveinSpan() %> 天</span>
				 		</div>
				 		<div class="infoitem">
				 			<span class="word" style="margin-left:10px;float: left;color: gray;font-size: 12px;">我所在领域：</span>
				 			&nbsp;&nbsp;&nbsp;&nbsp;
				 			<%for(String field : mybelongsfield){ %>
				 			<span class="word" style="margin-left:10px;float: left;color: gray;font-size: 12px;"><%=field %></span>
				 			<%} %>
				 			<span class="word1" style="light-height:40px;float: right;margin-right: 45px"><button id="addarea" style="font-size: 13px;font-weight: normal;" onclick="return addarea('<%=myinfo.getHasregister()%>');">加入其它领域</button></span>
				 		</div>
				 		<div class="infoitem">
				 			<span class="word" style="margin-left:10px;float: left;color: gray;font-size: 12px;">完成翻译任务：</span>
				 			&nbsp;&nbsp;&nbsp;&nbsp;
				 			<span class="word" style="margin-left:10px;float: left;color: gray;font-size: 12px;">20 次</span>
				 		</div>
				 		<div class="infoitem">
				 			<span class="word" style="margin-left:10px;float: left;color: gray;font-size: 12px;">我的粉丝：</span>
				 			<span class="word" style="margin-left:50px;float: left;color: gray;font-size: 12px;"><%=myinfo.getLfans() %> 个</span>
				 		</div>
				 	</div>
				 	<div class="detialinfo" style="border-bottom: 1px dotted rgb(210,210,210);">
				 		<div style="width:100%;height:40px;line-height: 40px;text-align: left;border-bottom: 1px dotted rgb(210,210,210);">
				 			<span class="word" style="margin-left:10px;">我的标签</span>
				 		</div>
				 		<div class="signs">
				 			
				 		<%
				 			for(String ml : mylabel)
				 			{
				 				
				 		 %>	
				 			<div  style="width:auto;height:20px;float: left;margin: 10px;margin-top: 10px">
								<b class="b1"></b><b class="b2 d1"></b><b class="b3 d1"></b><b class="b4 d1"></b>
									<div class="b d1 k language" style="background: #DCDCDC;cursor: pointer;">
										<span style="font-size: 15px;margin: 4px 6px 4px 6px; color:rgb(97,97,51);"><%=ml %></span>
									</div>
								<b class="b4b d1"></b><b class="b3b d1"></b><b class="b2b d1"></b><b class="b1b"></b>
							</div>
				 		<%
				 		   }
				 		 %>	
				 			
				 			
				 		</div>
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
    
    
    
      <div id="w" class="easyui-window" data-options="iconCls:'icon-save',closed:true,modal:true" style="top:160px">
		<div style="text-align:center; padding:1px;">
			<form id="ff" method="post" enctype="multipart/form-data">
			<table width="380px" cellspacing="1" cellpadding="2" border="0" align="center">
					<tr>
	                    <td style="width: 80px;height:30px" >姓名</td>
	                    <td><input type="text" style="width:230px;height: 25px" id="realname" name="realname"/></td>
	                </tr>
					<tr>
	                    <td style="width: 80px;height:30px">身份证正面图</td>
	                    <td>
	                    	<input type="file" id="certificate" name="certificate" style="display: none;" onchange="ye.value=value">
							<input name="ye" style="color: green;height: 25px">
							<input type="button" value="选择文件" onclick="certificate.click()" style="border: 1px solid gray;background:rgb(220,220,220);width: 60px">
	                    </td>
	                </tr>
	                <tr style="display:none;">
	                	<td></td>
	                	<td>
	                		<img id="certificateimg" src="#" style="width:60px;height:50px">
	                	</td>
	                </tr>
					<tr id="insertpoint">
	                    <td style="width: 80px;height:30px">证书照片</td>
	                    <td>
	                    	<input type="file" id="zhengjian1" name="zhengjian" style="display: none;" onchange="ye1.value=value">
							<input name="ye1" style="color: green;height: 25px">
							<input type="button" value="选择文件" onclick="zhengjian1.click()" style="border: 1px solid gray;background:rgb(220,220,220);width: 60px">
							<input id="addimg" type="button" value="继续上传" style="border: 1px solid gray;background:rgb(220,220,220);width: 60px">
	                    </td>
	                </tr>
	                <tr>
	                    <td style="width: 80px;height:30px" >电话号码</td>
	                    <td><input type="text" style="width:230px;height: 25px" id="realname" name="realname"/></td>
	                </tr>
	                <tr>
	                    <td style="width: 80px;height:30px" >验证信息</td>
	                    <td><input type="text" style="width:98px;height: 25px" id="realname" name="realname"/><input id="addimg" type="button" value="获取验证码" style="border: 1px solid gray;background:rgb(220,220,220);width: 72px"></td>
	                </tr>
			</table>
			</form>
		</div>
		<div style="text-align:center;padding:5px;">
	        <a href="javascript:void(0)" onclick="$('#ff').submit();" id="btn-ok" class="easyui-linkbutton" icon="icon-save">提交</a>  
	        <a href="javascript:void(0)" id="btn-cancel" class="easyui-linkbutton" icon="icon-cancel" onclick="$('#w').window('close');">取消</a>
	    </div> 
	</div>

  </body>
</html>
