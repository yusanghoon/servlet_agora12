<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.List" %>  
<%@ page import ="java.util.ArrayList"%> 
<%@ page import ="java.util.Arrays"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	int[] scores = {80, 90, 100, 95, 80};
	int sum = 0 ;
	for(int i = 0; i < scores.length; i++){
		sum += scores[i];
	}	
	double avg= sum / scores.length;
	%>
	<h3>평균 점수는 : <%= avg %></h3>

	<%
	List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	int sum1 = 0;
	for(int i = 0; i < scoreList.size(); i++){
		if(scoreList.get(i).equals("O")){
			sum1 += i;
		}
	}
	int score = sum1 * 10;
	%>
	
	<%
	List<String> scoresList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	
	int score1= 0 ;
	for(String check:scoresList){
		if(check.equals("O")){
			score+= 100 / scoresList.size();
		}
		
	}
	
	%>
	
	<h2>채점 결과는 <%= score1 %>점</h2>

	<h3><%= sum1 %></h3>
	
	<%!
	// 1부터 N까지의 합을 구하는 메소드
	
	public int sumAll(int n) {
		int result = 0 ;
		for(int i = 1; i <= n; i++){
			result += i;
		}	
		return result;
	}		
	%>
	
	<h2>1에서 50까지의 합은 <%= sumAll(50) %></h2>
	

	<%
		// 주어진 생년월일을 가진 사람의 나이를 구하세요.
		String birthDay = "20010820";
		String yearSting =birthDay.substring(0, 4);
		int year = Integer.parseInt(yearSting);
		int age = 2022 - year + 1 ;
	%>
	<h2>나이는 <%= age %></h2>




</body>
</html>