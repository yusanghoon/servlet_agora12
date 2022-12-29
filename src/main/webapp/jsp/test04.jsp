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
		String number1 = request.getParameter("number1");
		String number2 = request.getParameter("number2");
		String calculation = request.getParameter("calculation");
		
		int nums = Integer.parseInt(number1);
		int num = Integer.parseInt(number2);
			
		double value = 0;
		if(calculation.equals("+")){
			value += nums + num;
		}else if(calculation.equals("-")){
			value += nums - num;
		}else if(calculation.equals("x")){
			value += nums * num;
		}else if(calculation.equals("/")){
			value += nums / num;
		}
	
		
	%>


	<h2>계산 결과</h2>
	<div class="display-4"><%= num%> <%= calculation%> <%= nums%> = <span class="text-primary"><%= value%></span></div>




</body>
</html>