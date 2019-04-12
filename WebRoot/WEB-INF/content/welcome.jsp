<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎页面</title>
</head>
<body>
	欢迎！<br>
	<p>用户名：${userName }</p>
	<p>密码：${password }</p>
	<input type="button" value="返回" onClick="location='index.jsp'"/>
</body>
</html>