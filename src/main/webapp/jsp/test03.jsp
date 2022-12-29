<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String intSize = request.getParameter("heigth");
		String intWeight = request.getParameter("weight");
		
		int heigth = Integer.parseInt(intSize);
		int wei = Integer.parseInt(intWeight);
		
		double bmi = wei / ((heigth/100.0) * (heigth/100.0));
	
		String status = null;
		if(bmi <= 20){
			status = "저체중";
		}else if(bmi <= 25 && bmi >= 21){
			status = "정상";
		}else if(bmi <= 30 && bmi >= 26){
			status = "과체중";	
		}else{
			status = "비만";	
		}
	
	%>

	<%!
	
		public double bmi(int heigth, int weight){
		double bmi = 0;		
		bmi = weight / ((heigth/100) * (heigth/100));
		return bmi;	
	}	
	%>

	<table border="1">
		<tr>
			<th>수치<th>
			<th>결과</th>
		</tr>
		<tr>
			<td>20이하<td>
			<td>저체중</td>
		</tr>
		<tr>
			<td>21이상~25이하<td>
			<td>정상</td>
		</tr>
		<tr>
			<td>26이상~30이하<td>
			<td>과체중</td>
		</tr>
		<tr>
			<td>31이상<td>
			<td>비만</td>
		</tr>
	</table>

	<div class="container">
		<h1>BIM 측정 결과</h1>
		<div class=display-4>당신은 <span class="display-4 text-info"><%=status %><sapn></div>
		<div>BIM 수치 : <%=bmi %></div>
	</div>

</body>
</html>