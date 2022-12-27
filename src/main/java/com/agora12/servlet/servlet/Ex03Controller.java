package com.agora12.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet/ex03")
public class Ex03Controller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/html");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		// �̸��� ��������� ���� �ް�, �̸��� ���̸� html ����
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		
		//������Ϸ� ���̰��
		//20011023
		String yearString = birthday.substring(0, 4);
		int year = Integer.parseInt(yearString);
		
		int age = 2022 - year + 1 ;
		
//		out.println("<html><head><title>����</title></head>");		
//		out.println("<body><h2> �̸� : " + name + "</h2>");		
//		out.println("<h3> ���� : " + age + "</h3> </body> </html>");	
		
		
		//xml
		//<name>���α�</name> <age>25</age>
		//json
		//{"name" : ���α� "age" : 24} �̰Ŵ� ���ڿ�
		//["���α�","���缮","������"] �̰Ŵ� ���ڿ�?
		out.println("{\"name\":\"" + name + "\",\"age\":" + age + "}");
		
		
		
	}
		
}
