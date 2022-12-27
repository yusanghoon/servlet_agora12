package com.agora12.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex05")
public class Ex05Controller extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		

		response.setContentType("text/html");
				
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		
		//������Ϸ� ���̰��
		//20011023
		String yearString = birthday.substring(0, 4);
		int year = Integer.parseInt(yearString);
		
		int age = 2022 - year + 1 ;
		
		out.println("<html><head><title>����</title></head>");		
		out.println("<body><h2> �̸� : " + name + "</h2>");		
		out.println("<h3> ���� : " + age + "</h3> </body> </html>");	
		
		
	}
		
	
}
