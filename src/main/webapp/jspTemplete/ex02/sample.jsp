<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>샘플페이지</title>
<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	<meta charset="UTF-8">
	
	<link rel="stylesheet" href="/jspTemplete/ex02/style.css" type="text/css">

</head>
<body>
	<div class="container">
		<jsp:include page="header.jsp" />
		<jsp:include page="menu.jsp" />
		<section class="contents">
			<img alt="그냥 예쁜사진" width="500" src="https://media.istockphoto.com/id/1440247789/ko/%EC%82%AC%EC%A7%84/%EC%98%A4%EB%A6%AC%EC%95%8C%EC%9D%84-%EB%82%98%EB%AC%B4%EB%A7%9D%EC%B9%98%EB%A1%9C-%EA%B9%A8%EB%8B%A4.jpg?b=1&s=170667a&w=0&k=20&c=dhfIMa5v-iJwdR-BImRP2XAeJm8kGnIqTXOIx1n2X18=">
			<div>새해 복 많이 받으세요</div>
		</section>
		<jsp:include page="footer.jsp" />
	</div>



</body>
</html>