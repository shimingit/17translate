<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ltranslatorinfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/skin.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.3/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.3/demo/demo.css">
	<script type="text/javascript" src="jquery-easyui-1.3.3/jquery.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
	
	
	<script type="text/javascript">
		function newUser()
		{
			$('#w').window('setTitle','添加用户');
	  		$('#w').window('open');
			$('#ff').form('clear');
			$('#ff').attr("action","addNews");
		}
		function deleteUser()
		{
			  var row = $("#dg").datagrid("getSelected");
	          if(row==null)
	          {
	        	 $.messager.alert('提示','请选择要删除的用户!','info');
	        	 return false;
	          }
	          $.messager.confirm('确认', '确定删除该用户吗?', function(r)
	          {
				if (r)
				{
					alert("您要删除的用户名是："+row.username);
				}
			  });
		}
	 function editUser() 
	 {
         var row = $("#dg").datagrid("getSelected");
         if (row==null) 
         {
             $.messager.alert('提示','请选择要编辑的用户!','info');
             return false;
         }
         
     }
	 
	 
	
	
	$(document).ready(function()
	{
		$('#dg').datagrid({onLoadSuccess : function(data)
		{
 		  // $('#dg').datagrid('selectRow',1);
 		  
 		    var fields =  $('#dg').datagrid('getColumnFields');  
		     $('#sss').searchbox(
		     {    
		  		  menu:'#mm'  
		    });  
		   
		}});
		
		$("#translator").combobox({
			url:'getfreetranslators',
			textField:'name',
			valueField:'fusername',
			editable: false,
			panelHeight: 'auto'
		});
		
	
	});
	function searchData(value,name)
	{
    	$('#dg').datagrid('load', { "searchKey": name, "searchValue": value });
	}
	</script>
  </head>
  
  <body>
    <table width="100%" border="0" cellpadding="0" cellspacing="0">
   		
   		<!-- 第一部分 头部标题 -->
   		<tr>
		    <td width="17" valign="top" background="images/mail_leftbg.gif"><img src="images/left-top-right.gif" width="17" height="29" /></td>
		    <td valign="top" background="images/content-bg.gif">
			    <table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" class="left_topbg" id="table2">
			      <tr>
			        <td height="31"><div class="titlebt">译员信息</div></td>
			      </tr>
			    </table>
		    </td>
		    <td width="16" valign="top" background="images/mail_rightbg.gif"><img src="images/nav-right-bg.gif" width="16" height="29" /></td>
 		</tr>
 		
 		<!-- 第二部分  -->
 		<tr>
 			<td valign="middle" background="images/mail_leftbg.gif">&nbsp;</td>
 		
 			
 			
 			<td valign="top" bgcolor="#F7F8F9">
 				
 				<table width="100%" height="144" border="0" cellpadding="0" cellspacing="0" class="line_table">
 				
 				
 				  <tr>
			        <td colspan="2" valign="top">&nbsp;</td>
			        <td>&nbsp;</td>
			        <td valign="top">&nbsp;</td>
			      </tr>
 				  
 				  <!-- 内容 -->
 				  <tr>
	 				  <td colspan="4">
	 				  	<table id="dg" title="用户管理" class="easyui-datagrid" style="width:1100px;height:365px" url="getltranslatorinfo" toolbar="#toolbar" pagination="true" rownumbers="true" fitColumns="true" singleSelect="true">
					        <thead>
					            <tr>
					            	<th data-options="field:'id',checkbox:true"></th>
					                <th data-options="field:'username', width:25">用户名</th>
					                <th data-options="field:'realname', width:25">姓名</th>
					                <th data-options="field:'phonenumber', width:35">电话号码</th>
					                <th data-options="field:'mailbox', width:35">邮箱</th>
					                <th data-options="field:'translationcoin', width:20">翻译币</th>
					                <th data-options="field:'fans', width:20">粉丝数</th>
					                <th data-options="field:'liveindate', width:30">入驻日期</th>
					                <th data-options="field:'translationlevel', width:30">翻译等级</th>
					                <th data-options="field:'detailinfo', width:15">操作</th>
					            </tr>
					        </thead>
	  				  </table>
	  				 <div id="toolbar">
				        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">添加用户</a>
				        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">编辑用户</a>
				        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="deleteUser()">删除用户</a>
				        &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
				        <input id="sss" class="easyui-searchbox" data-options="prompt:'Please Input Value'" searcher='searchData' style="width:260px;"></input>
				   		<div id="mm" style="width:100px"> 
				   			<div name="luserName">用户名</div> 
				   			<div name="lrealName">姓名</div> 
				   			<div name="lphoneNumber">电话号码</div> 
	   				    </div>
	  				  </td>
 				  </tr>
 				 
 				 <tr>
			        <td colspan="2">&nbsp;</td>
			        <td>&nbsp;</td>
			        <td>&nbsp;</td>
			      </tr>
 				 
 				 <tr>
			        <td height="40" colspan="4">
				        <table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
				          <tr>
				            <td></td>
				          </tr>
				        </table>
				    </td>
     			 </tr>
     			 
 				</table>
 			
 			</td>
 			
 			
 			
 			<td background="images/mail_rightbg.gif">&nbsp;</td>
 		
 		</tr>
   		
   		<!-- 第三部分 -->
   		
   		<tr>
		    <td valign="bottom" background="images/mail_leftbg.gif"><img src="images/buttom_left2.gif" width="17" height="17" /></td>
		    <td background="images/buttom_bgs.gif"><img src="images/buttom_bgs.gif" width="17" height="17"></td>
		    <td valign="bottom" background="images/mail_rightbg.gif"><img src="images/buttom_right2.gif" width="16" height="17" /></td>
  		</tr>
   		
    </table>
    
    
    
    
    
    
    
    
  	
    <div id="w" class="easyui-window" data-options="iconCls:'icon-save',closed:true,modal:true">
		<div style="text-align:center; padding:1px;">
			<form id="ff" method="post">
			<table width="340px" cellspacing="1" cellpadding="2" border="0" align="center">
					<tr>
	                    <td style="width: 80px;height:30px" >请选择译员：</td>
	                    <td><input style="width:200px" id="translator" name="translatorname" class="easyui-combobox"/></td>
	                </tr>
			</table>
			</form>
		</div>
		<div style="text-align:center;padding:5px;">
	        <a href="javascript:void(0)" onclick="$('#ff').submit();" id="btn-ok" class="easyui-linkbutton" icon="icon-save">保存</a>  
	        <a href="javascript:void(0)" id="btn-cancel" class="easyui-linkbutton" icon="icon-cancel" onclick="$('#w').window('close');>取消</a> 
	    </div> 
	</div>
	
	
   
   
   	
	
	
  </body>
</html>
 