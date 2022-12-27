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
		
		//���� �ð��� 14�� 52�� 43��
		SimpleDateFormat formatter = new SimpleDateFormat("HH��mm��ss��");
		String rimeString = formatter.format(now);
		
		out.println("����ð���" +rimeString);
		
		
	}
	
}
