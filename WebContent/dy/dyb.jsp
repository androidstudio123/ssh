<%@ page language="java" contentType="text/html; charset=UTF-8"
import="java.util.ArrayList,PO.DyPO"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#CCCFFF">
<a href="../dy/dy.jsp" target="_parent">返回上页</a>
<h3>修改新闻</h3>
<s:form action="dyb" method="post">
<table>
<tr>
<td>请选择要修改新闻的编号</td>
<td>
<select name="id">
<%ArrayList list=(ArrayList)session.getAttribute("allInfo"); 
for(int i=0;i<list.size();i++){
	DyPO info=(DyPO)list.get(i);
	%>
	<option value="<%=info.getId()%>">
	<%=info.getId()%></option>
	<% 
}
%>
</select>
</td>
<td>
<s:submit value="确定"/>
</td>
<s:reset value="取消"/>
</tr>
</table>
</s:form>
</body>
</html>