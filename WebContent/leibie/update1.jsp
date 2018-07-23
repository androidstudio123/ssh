<%@page import="PO.LeibiePO" %>
<%@page import="java.util.ArrayList" %>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#CCCFFF">
<s:form action="update1" method="post">
<table align="center" border="2">
<%
	ArrayList list=(ArrayList)session.getAttribute("one");
	System.out.print("获取数据");
     LeibiePO info=(LeibiePO)list.get(0);
     System.out.print("获取数据1");
%>
<tr>
<td>
编号<input name="id"  value="<%=info.getId() %>"
readonly="readonly"/>
</td>
</tr>
<tr>
<td>
类别<input name="sex"  value="<%=info.getSex()%>"/>
</td>
</tr>
<tr>
<td colspan="2">
<s:submit value="提交"/>
<s:reset value="清除"/>
</td>
</tr>
<tr>
<s:a href="../leibie/update.jsp">返回</s:a>
</tr>
</table>
</s:form>
</body>
</html>