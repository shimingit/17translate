<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
System.out.println(basePath);
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
		function detailinfo()
		{
			var row = $("#dg").datagrid("getSelected");
			if (row==null) 
        	{
            	 $.messager.alert('提示','请选择用户!','info');
             	 return false;
        	}
			
			var username = row.username;
			var realname = row.realname;
			var phonenumber = row.phonenumber;
			var basepath = '<%=basePath%>' + 'imgrepository/' + username + "/renzheng/";
			$.ajax({  
            url: 'getidentifyimgpath',  
            type: 'post',  
            data: {currentuser:username},  
            success: function(data)
					{
						//var dataObj = eval("(" + data +")");
						for(var key in data.imgpathmap)
						{
							var path = data.imgpathmap[key];
							var count = 0;
							var fullpath = basepath + path;
							
							if('certificate' == key)
									$('#certificateid').attr('src', fullpath);	
							else
							{
								var title = "证件" + (++count) + "的图片："; 
								var identifyimg = "<tr>\
												  <td style='width: 90px;text-align: right;vertical-align: top;' >"+ title +"</td>\
	                                               <td style='height:200px;'>\
	                    	                       <img id='certificateid' src='"+ fullpath +"' style='width:380px;height:300px'>\
	                                               </td>\
	                                               </tr>";
	                            $(identifyimg).insertAfter("#insertpoint");
							}												
						}
					}
                  });
			$('#un').text(username);
			$('#rn').text(realname);
			$('#pn').text(phonenumber);
			
			
			$('#w').window('setTitle','用户 ' + username + ' 的认证信息');
	  		$('#w').window('open');
		}

	 function identifyok() 
	 {
         var row = $("#dg").datagrid("getSelected");
         if (row==null) 
         {
             $.messager.alert('提示','请选择用户!','info');
             return false;
             
         } 
         var username = row.username;
         
         
         $.ajax({  
            url: 'passidentifyrequest',  
            type: 'post',  
            data: {currentuser:username},  
            success: function(data)
					{
						//var dataObj = eval("(" + data +")");
						if(data.result == 'true')
							$.messager.alert('提示','操作成功!','info');
							$('#dg').datagrid('load');
					}
                  });
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
			        <td height="31"><div class="titlebt">实名请求</div></td>
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
	 				  	<table id="dg" title="实名请求管理" class="easyui-datagrid" style="width:1100px;height:385px" url="getidentifyrequest" toolbar="#toolbar" pagination="true" rownumbers="true" fitColumns="true" singleSelect="true">
					        <thead>
					            <tr>
					            	<th data-options="field:'id',checkbox:true"></th>
					                <th data-options="field:'username', width:25">用户名</th>
					                <th data-options="field:'realname', width:25">姓名</th>
					                <th data-options="field:'phonenumber', width:35">电话号码</th>
					        
					            </tr>
					        </thead>
	  				  </table>
	  				 <div id="toolbar">
				        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="identifyok();">认证通过</a>
				        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="detailinfo();">详细信息</a>
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
			<table width="480px" cellspacing="1" cellpadding="2" border="0" align="center">
					<tr>
	                    <td style="width: 90px;height:30px;text-align: right" >用户名：</td>
	                    <td><span id="un"></span></td>
	                </tr>
					<tr>
	                    <td style="width: 90px;height:30px;text-align: right" >姓   名：</td>
	                    <td><span id="rn"></span></td>
	                </tr>
					<tr>
	                    <td style="width: 90px;height:30px;text-align: right" >电话号码：</td>
	                    <td><span id="pn"></span></td>
	                </tr>
					<tr id="insertpoint">
	                    <td style="width: 90px;text-align: right;vertical-align: top;" >身份证正面图：</td>
	                    <td style="height:200px">
	                    	<img id="certificateid" src="" style="width:380px;height:300px">
	                    </td>
	                </tr>
			</table>
		</div>
		<div style="text-align:center;padding:5px;">
	        <a href="javascript:void(0)" id="btn-cancel" class="easyui-linkbutton" icon="icon-cancel" onclick="$('#w').window('close');">关闭</a> 
	    </div> 
	</div>
	
	
   
   
   	
	
	
  </body>
</html>
 