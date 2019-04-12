<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" 
    uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
</head>
<body>
	<form:form action="regist" method="post" commandName="user">
		<table align="center">
			<caption>
				<h3>用户注册</h3>
			</caption>
			<tr>
				<td>用户名：</td>
				<td><form:input path="userName" /></td>
				<td><form:errors path="userName" cssStyle="color:red"/></td>
			</tr>
			<tr>
				<td>密&nbsp;&nbsp;码：</td>
				<td><form:input path="password" /></td>
				<td><form:errors path="password" cssStyle="color:red"/></td>
			</tr>
			<tr>
				<td>性&nbsp;&nbsp;别：</td>
				<td>
				  <form:radiobutton path="sex" value="male" label="男"/>
				  <form:radiobutton path="sex" value="female" label="女"/>
				</td>
				<td><form:errors path="sex" cssStyle="color:red"/></td>
			</tr>
			<tr>
				<td>年&nbsp;&nbsp;龄：</td>
				<td><form:input path="age" /></td>
				<td><form:errors path="age" cssStyle="color:red"/></td>
			</tr>
			<tr>
				<td>专&nbsp;&nbsp;业：</td>
				<td>
				  <form:select path="major" >
				  <form:option value="1">计科</form:option>
				  <form:option value="2">软工</form:option>
				  </form:select>
				</td>
				<td><form:errors path="major" cssStyle="color:red"/></td>
			</tr>
			<tr>
				<td>邮&nbsp;&nbsp;箱：</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssStyle="color:red"/></td>
			</tr>
			<tr>
				<td>电&nbsp;&nbsp;话：</td>
				<td><form:input path="phone" /></td>
				<td><form:errors path="phone" cssStyle="color:red"/></td>
			</tr>
			<tr align="center">
				<td colspan="3">
				  <input type="submit" value="注册" />
				  <input type="reset" value="重填" />
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>