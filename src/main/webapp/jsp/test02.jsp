<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.text.SimpleDateFormat"%>
<%@ page import ="java.util.Date" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜, 시간링크</title>
</head>
<body>

	

	<%
	//날짜가 보고싶으면 what = date
	//시간이 보고싶으면 what = time
	String what = request.getParameter("what");
	
	
	Date now = new Date();
	SimpleDateFormat timeFormatter = new SimpleDateFormat("현재시간은 HH시 mm분 ss초");
	SimpleDateFormat dateFormatter = new SimpleDateFormat("오늘 날짜 YYYY년 M월 d일 ");
	
	
	String formatString = null;
	if(what.equals("date")){//날짜
		formatString = dateFormatter.format(now);
		
	} else {
		formatString = timeFormatter.format(now);
	}

	
	%>
	<div class="container">
	
		<div class="display-1"><%= formatString %></div>
	
	</div>	
		


</body>
</html>