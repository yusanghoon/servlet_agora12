package com.agora12.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex01Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest requset, HttpServletResponse response) throws IOException {
		
		//���� ���ڵ� ����
		response.setCharacterEncoding("utf-8");
		//������ Ÿ�� MIME
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		
		
		
		// ��¥ ��ü
		Date now = new Date();
		out.println(now);
		
		// ��¥ ������
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String dateString = formatter.format(now);
		out.print(dateString);
		
	}

}
