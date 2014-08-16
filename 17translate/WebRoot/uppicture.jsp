<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upfile.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/style.css">
	
	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script> 
	
<style type="text/css">
	.word{
	font-family:Arial,Helvetica,sans-serif;
	font-size:13px;
	vertical-align:middle;
	color:gray;
	font-weight: bold;
}

</style>
<script type="text/javascript">
	$(document).ready(function()
	{
		$(".btn_grey").click(function()
		{   
			//$(window.parent.window.document.getElementById("myimg")).attr("src","identifycode?"+Math.random()); 
			//alert($("#picturefile").val());
			//alert(window.parent.window.document.getElementById('myimg').src);
			//window.parent.window.document.getElementById('myimg').src='identifycode?'+Math.random();
			$("#imgname").val($("#picturefile").val());
			$("form[name='form1']").submit();
			
			//parent.$.XYTipsWindow.removeBox();
		    return false;
		});  
	});
	
</script>
  </head>
  
  <body>
  <form name="form1" enctype="multipart/form-data" method="post" action="uppicture">
  <table width="350" height="150"  border="0" cellpadding="0" cellspacing="0" background="images/upFile_bg.gif">
    <tr>
      <td valign="top"><table width="100%" height="145"  border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td height="49" colspan="2">&nbsp; <br></td>
        </tr>
        <tr>
          <td width="9%" height="53">&nbsp;</td>
          <td width="91%" class="word">请选择上传的图片：<br>
            <input id="picturefile" name="picturefile" type="file" size="35">
            <input type="hidden" id="imgname" name="imgname" value="">
            <br>
  			          注：文件大小请控制在5M以内，格式为格式为GIF或JPG。</td>
        </tr>
        <tr>
          <td colspan="2" align="center"><input name="Submit" type="submit" class="btn_grey" value="提交">
            &nbsp;
            <input name="Submit2" type="button" class="btn_close" onClick="parent.$.XYTipsWindow.removeBox(); " value="关闭"></td>
        </tr>
      </table></td>
    </tr>
  </table>
</form>
  </body>
</html>
