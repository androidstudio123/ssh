<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="CCCFFF">
<s:form action="register" method="post">
<table border="1"align="center">
<tr>
<td><s:textfield name="userName" label="用户名字" size="16"/>
</td>
</tr>
<tr>
<td><s:password name="password1" label="用户密码" size="18"/></td>
</tr>
<tr>
<td><s:password name="password2" label="再次输入密码" size="18"/></td>
</tr>
<tr>
<td colspan="2"align="center">
<input type="submit" value="提交"/>&nbsp;&nbsp;
<input type="reset" value="清空"/>
</td>
</tr>
<tr>
<td colspan="2" align="center">
<s:a href="login.jsp">返回</s:a>
</td>
</tr>
</table>
</s:form>
</body>
</html>