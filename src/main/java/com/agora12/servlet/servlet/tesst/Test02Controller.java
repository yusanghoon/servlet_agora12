package com.agora12.servlet.servlet.tesst;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test02Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest requset,HttpServletResponse response ) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		
		Date now = new Date();
		
		//현재 시간은 14시 52분 43초
		SimpleDateFormat formatter = new SimpleDateFormat("HH시mm분ss초");
		String rimeString = formatter.format(now);
		
		out.println("현재시간은" +rimeString);
		
		
	}
	
}
