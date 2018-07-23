<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#CCCFFF">
<a href="../leibie/leibie.jsp" target="_parent">返回上页</a>
<div>
<center><font size="6">添加类别</font></center>
</div>
<s:form action="add" method="post">
<table align="center" border="2">
<tr>
<td>
<s:textfield name="id" label="编号"/>
</td>
<td>
<s:textfield name="sex" label="类别"/>
</td>
<td colspan="2">
<s:submit value="提交"/>
<s:reset value="清除"/>
</td>
</tr>
</table>
</s:form>
</body>
</html>