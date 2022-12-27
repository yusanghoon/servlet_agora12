package com.agora12.servlet.servlet.tesst;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test08")
public class Test08Controller extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response ) throws IOException {
		
		response.setContentType("text/html");	
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String introduce = request.getParameter("introduce");
		
		out.println("<html><head><title>입사 지원</title></head><body>");
		
		out.println("<h3>" +name + "님 지원이 완료 되었습니다.</h3>");
		out.println("<hr>");
		out.println(introduce + "</body></html>");
	
	}
	
	
	
}
