<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<form action="A/second.action" method="post">
	<table>
		<tr>
			
			<td> 用户名&nbsp; </td>
			<td>
				<input type="text" name="userName">
			</td>
		</tr>
		
		<tr>
			<td> 密码&nbsp; </td>
			<td>
				<input type="password" name="passWord">
			</td>
		</tr>
		<tr>
		<td colspan="2" align="center">
		<input type="submit" value="登陆">
		<input type="reset" value="重置">
		</td>
		</tr>
	</table>
	
	</form>
</div>

</body>
</html>