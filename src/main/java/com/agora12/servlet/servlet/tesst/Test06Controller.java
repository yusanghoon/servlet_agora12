package com.agora12.servlet.servlet.tesst;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test06")
public class Test06Controller extends HttpServlet{

	@Override 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();


		String adrress = request.getParameter("adrress");
		String card = request.getParameter("card");
		String price = request.getParameter("price");

		out.println("<html><head><title>����</title></head><body>");				
		if(!adrress.contains("�����")) {
			out.println("<h1>��� �Ұ� ���� �Դϴ�.</h1>");
			
		}else if(!card.contains(card)) {
			out.println("<h1>���� �Ұ�ī�� �Դϴ�.</h1>");

		}else{
			out.println("<h2>" + adrress + "�� ����� </h2>");
			out.println("<hr> �����ݾ� : " + price + "�� ");
		}
		
		out.println("<body></html>");




}

}

