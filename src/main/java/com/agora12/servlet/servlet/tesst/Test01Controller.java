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
		
		// ��¥ ��ü
		Date now = new Date();
		out.println(now);
		
		//��¥ ������
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy�� M�� D��");
		String dateString = formatter.format(now);
		
		out.println("������ ��¥�� " + dateString);
	}
	
	
	
	
}
