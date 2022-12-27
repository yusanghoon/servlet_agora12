package com.agora12.servlet.servlet.tesst;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test01Controller extends HttpServlet {

	@Override 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");		
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		
		// 날짜 객체
		Date now = new Date();
		out.println(now);
		
		//날짜 포메팅
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 M월 D일");
		String dateString = formatter.format(now);
		
		out.println("오늘의 날짜는 " + dateString);
	}
	
	
	
	
}
