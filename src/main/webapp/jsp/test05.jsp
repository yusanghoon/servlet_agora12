<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
	<%
	String[] changer = request.getParameterValues("changer");
	int centimeter = Integer.parseInt(request.getParameter("centimeter"));

	String changerString="";
	for(int i = 0; i < changer.length; i++){
		
		if(changer[i].equals("in")){
			changerString += changer[i] + centimeter * 2.54;
		}else if(changer[i].equals("yard")){
			changerString += changer[i] + centimeter * 2.54;
		}else if(changer[i].equals("feet")){
			changerString += changer[i] + centimeter * 2.54;
		}else if(changer[i].equals("Meter")){
			changerString += changer[i] + centimeter * 2.54;
		}
		
	}	
	
	
	%>
	<h2>변환 결과</h2>
	
	



</body>
</html>