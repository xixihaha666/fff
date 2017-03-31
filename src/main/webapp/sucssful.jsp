<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <a href="B/three.action">下载</a> -->
<form action="B/three.action" method="post" enctype="multipart/form-data">
<table>
	<tr>成功页面</tr>
	<tr>${requestScope.user.passWord} </tr>
	<tr>${requestScope.ss}</tr>
</table>
 
<h1>这是二级页面</h1>

<input type="file" name="upLoadFile">
<input type="submit" value="转三级页面">


</form>

</body>
</html>