<%@ page language="java" contentType="text/html; charset=UTF-8"
import="java.util.ArrayList,PO.LeibiePO"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电影类别管理界面</title>
</head>
<body bgcolor="#CCCFFF">
<a href="../login/success.jsp" >返回主界面</a><h2 align="center">新闻信息管理页面</h2>
<hr>
<table width="100%" align="center" border="2">
<tr>
<td><a href="add" target="_top">添加电影类别</a></td>
<td><a href="../leibie/update.jsp" target="_top">修改电影类别</a></td>
<td><a href="../leibie/delete.jsp" target="_top">删除电影类别</a></td>
</tr>
</table>
<s:form action="leibie" method="post">
<table align="center"border="2"width="90%">
<h3 align="center">你要查询的数据有<%=request.getSession().getAttribute("count") %>条</h3>
<tr>
<th>编号</th>
<th>类别</th>
</tr>
<%
ArrayList list=(ArrayList)session.getAttribute("allInfo");
System.out.print(list);
	for(int i=0;i<list.size();i++){
		LeibiePO info=(LeibiePO)list.get(i);
		%>
		<tr>
		<td align="center"><%=info.getId()%></td>
		<a href="<%=info.getSex()%>"><td align="center"><%=info.getSex() %></td></a>
		</tr>
		<% 
	}

%>
</s:form>
</table>
</body>
</html>