package com.agora12.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet/ex02")
public class Ex02Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest requset,HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 1���� 10������ ��
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum +=i ;
		}
		
		out.println("<html> <head> <title> �հ� </title> <head>");
		out.println("<body> <h1>�հ�" + sum + "</h1> <body> </html>");
		
		
		
		
		
		
	}
	

}
