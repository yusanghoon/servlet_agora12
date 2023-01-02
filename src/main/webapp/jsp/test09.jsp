<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%> 
<%@ page import="java.text.SimpleDateFormat" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Calendar today = Calendar.getInstance();
			
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		String formatString = formatter.format(today.getTime());
	%>

	<div>오늘부터 1일</div>
	<% for(int i = 1 ; i <= 10; i++){ %>
		<%=today.add(Calendar.DATE, 100)%>
		
	<div>오늘부터 <%= i*100 %>일<%= formatter %></div>
	
	<% } %>
	
</body>
</html>