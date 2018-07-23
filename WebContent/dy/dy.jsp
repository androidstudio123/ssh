<%@ page language="java" contentType="text/html; charset=UTF-8"
import="java.util.ArrayList,PO.DyPO"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电影类别管理</title>
</head>
<body bgcolor="#CCCFFF">
<a href="../login/success.jsp" >返回主界面</a><h2 align="center">新闻信息管理页面</h2>
<hr>
<table width="100%" align="center" border="2">
<tr>
<td><a href="dya" target="_top">添加新闻</a></td>
<td><a href="../dy/dyb.jsp" target="_top">修改新闻</a></td>
<td><a href="../dy/dyc.jsp" target="_top">删除新闻</a></td>
</tr>
</table>
<s:form action="dy" method="post">
<table align="center"border="2">
<h3 align="center">你要查询的数据有<%=request.getSession().getAttribute("count") %>条</h3>
<tr>
<th>记录条数</th>
<th>编号</th>
<th>名字</th>
<th>类别</th>
<th>详情</th>
</tr>
<%
ArrayList list=(ArrayList)session.getAttribute("allInfo");
System.out.print(list);
	for(int i=0;i<list.size();i++){
		DyPO info=(DyPO)list.get(i);
		%>
		<tr>
		<td align="center"><%=i+1%></td>
		<td><%=info.getId()%></td>
		<td><%=info.getUserName() %></td>
		<td><%=info.getSex() %></td>
		<a href="<%=info.getJj() %>"><td><%=info.getJj() %></td></a>
		</tr>
		<% 
	}

%>
</s:form>
</table>
</body>
</html>