<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addbelongsfield.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script> 
	
	<style type="text/css">
		.divone{
			width:98%;
			height:30px;
			margin:6px auto 6px auto;
		}
		.divtwo{
			width:98%;
			height:150px;
			margin:6px auto 6px auto;
		}
		.divthree{
			width:98%;
			height:40px;
			margin:6px auto 6px auto;
			text-align: center;
		}
		.word{
			font-family:Arial,Helvetica,sans-serif;
			font-size:1.0em;
			vertical-align:middle;
			color:black;
			font-weight: bold;
		}
		.divtwo #fielditem{
			width:90px;
			height:30px;
			margin: 4px 6px 4px 6px;
			float:left;
		}
		.button{
		  position: relative;
		  display: inline-block;
		  padding: 8px 11px;
		  font-size: 13px;
		  font-weight: bold;
		  color: #333;
		  text-shadow: 0 1px 0 rgba(255,255,255,0.9);
		  white-space: nowrap;
		  background-color: #eaeaea;
		  background-image: -moz-linear-gradient(#fafafa, #eaeaea);
		  background-image: -webkit-linear-gradient(#fafafa, #eaeaea);
		  background-image: linear-gradient(#fafafa, #eaeaea);
		  background-repeat: repeat-x;
		  border-radius: 3px;
		  border: 1px solid #ddd;
		  border-bottom-color: #c5c5c5;
		  box-shadow: 0 1px 3px rgba(0,0,0,.05);
		  vertical-align: middle;
		  cursor: pointer;
		  -moz-box-sizing: border-box;
		  box-sizing: border-box;
		  -webkit-touch-callout: none;
		  -webkit-user-select: none;
		  -khtml-user-select: none;
		  -moz-user-select: none;
		  -ms-user-select: none;
		  user-select: none;
		  -webkit-appearance: none;
		
		}
		.button:hover,
		.button:active {
		  background-position: 0 -15px;
		  border-color: #ccc #ccc #b5b5b5;
		}
		.button:active {
		  background-color: #dadada;
		  border-color: #b5b5b5;
		  background-image: none;
		  box-shadow: inset 0 3px 5px rgba(0,0,0,.15);
		}
		.button:focus{
		  outline: none;
		  border-color: #51a7e8;
		  box-shadow: inset 0 1px 2px rgba(0,0,0,.075), 0 0 5px rgba(81,167,232,.5);
		}
	</style>
	<script type="text/javascript">
		$(function()
		{
			$("#addsubmit").click(function()
			{
				var belongsfieldCount=0;
		   	    $("[name='field']").each(function()
		   	    {
			        if($(this).attr("checked")){
			            belongsfieldCount++;
			        }
		   		});
		   		if(belongsfieldCount <= 0)
		   		{
		   			alert('请选择至少一个入驻的领域！');
		   			return;
		   		}
		   		if(belongsfieldCount > 3)
		   		{
		   			alert('入驻领域不能超过3个！');
		   			return;
		   		}
		   		
		   		$("#addform").submit();
			});
			
			$("#addreset").click(function()
			{
				$("#addform")[0].reset();
			});
		});
	</script>
  </head>
  
  <body>
    <div class="divone">
    	<span class="word" style="line-height: 30px">请选择要入驻的领域：</span>
    </div>
    <form id="addform" action="addbelongsfield">
    <div class="divtwo">
    
    	<div id="fielditem">
    		<input type="checkbox" id="field" name="field" value="1" style="vertical-align: middle;"/><span class="word" style="font-size:13px;line-height: 30px">重要会议</span>
    	</div>
    	<div id="fielditem">
    		<input type="checkbox" id="field" name="field" value="2" style="vertical-align: middle;"/><span class="word" style="font-size:13px;line-height: 30px">重要通知</span>
    	</div>
    	<div id="fielditem">
    		<input type="checkbox" id="field" name="field" value="3" style="vertical-align: middle;"/><span class="word" style="font-size:13px;line-height: 30px">校园广播</span>
    	</div>
    	<div id="fielditem">
    		<input type="checkbox" id="field" name="field" value="4" style="vertical-align: middle;"/><span class="word" style="font-size:13px;line-height: 30px">招生简章</span>
    	</div>
    	<div id="fielditem">
    		<input type="checkbox" id="field" name="field" value="5" style="vertical-align: middle;"/><span class="word" style="font-size:13px;line-height: 30px">学生论文</span>
    	</div>
    	<div id="fielditem">
    		<input type="checkbox" id="field" name="field" value="6" style="vertical-align: middle;"/><span class="word" style="font-size:13px;line-height: 30px">老师简介</span>
    	</div>
    	<div id="fielditem">
    		<input type="checkbox" id="field" name="field" value="7" style="vertical-align: middle;"/><span class="word" style="font-size:13px;line-height: 30px">趣味生活</span>
    	</div>
    	<div id="fielditem">
    		<input type="checkbox" id="field" name="field" value="8" style="vertical-align: middle;"/><span class="word" style="font-size:13px;line-height: 30px">院系介绍</span>
    	</div>
    
    </div>
    <div class="divthree">
    	<input  type="button" class="button" id="addsubmit" name="addsubmit" value="提交"/>&nbsp;
    	<input  type="button" class="button" id="addreset" name="addreset" value="重置"/>
    </div>
    </form>
  </body>
</html>
