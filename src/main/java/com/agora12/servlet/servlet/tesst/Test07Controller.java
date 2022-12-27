package com.agora12.servlet.servlet.tesst;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet/test07")
public class Test07Controller extends HttpServlet {

	@Override 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();


		//�˻�� ���� �ް� ��ġ�ϴ� ���ڿ� ���
		String keyword = request.getParameter("keyword");
		
		List<String> list = new ArrayList<>(Arrays.asList(
		        "������ �ְ� ���� �Ұ� �մϴ�.", 
		        "���� ��� ���� ���� �־��׿�.", 
		        "���� ���� ����Ʈ�� ���� ���׿�.", 
		        "���� ���� �濡 ���� ���� ���� ���� �簩�ϴ�.",
		        "���� �� ���� ���� �̿���."));
		
		out.println("<html><head><title>�˻�</title></head><body>");
		
		for(String text:list) {
			
			if(text.contains(keyword)) {
				// ������ �ְ��� <b>����</b>
				//���� => <b>����</b>
				text = text.replace(keyword, "<b>" + keyword + "</b>");
				out.println(text + "<hr>");
								
			}
						
		}
		
		out.println("</body></html>");
		
		
		
		
		
		
		
	}	
}
