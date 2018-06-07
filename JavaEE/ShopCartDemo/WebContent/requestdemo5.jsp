<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>得分</title>
</head>
<%
	String name = request.getParameter("name");
	String Class = request.getParameter("class");
	String t1 = request.getParameter("t1");
	String t2 = request.getParameter("t2");
	int score=0;
	if("b".equals(t1))
		score++;
	if("a".equals(t2))
		score++;		
%>
<body>
	<pre>
		<%=Class %>的<%=name %>
		你的得分为:<%=score %>分
	</pre>

</body>
</html>