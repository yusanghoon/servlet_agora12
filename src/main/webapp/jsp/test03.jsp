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
		String intSize = request.getParameter("size");
		String intWeight = request.getParameter("weight");
		double siz = Integer.parseInt(intSize);
		double wei = Integer.parseInt(intWeight);
	
	%>

	<%!
	
		public double bmi(double size, double weight){
		double bmi = 0;		
		bmi = weight / ((size/100) * (size/100));
		return bmi;	
	}	
	%>
	
	
	<h2><%= bmi(siz, wei)%></h2>
	


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
			<td>박기석</td>
		</tr>
	</table>

	<h2>BIM 측정 결과</h2>
	
	

</body>
</html>