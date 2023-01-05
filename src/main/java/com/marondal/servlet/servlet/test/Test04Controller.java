package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test04")
public class Test04Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>리스트</title></head>");
		out.println("<body><ul>");
		for(int i = 1; i <= 30; i++) {
			out.println("<li>" + i + "번째 리스트</li>");
		}
		out.println("</ul></body></html>");
		
//		<html>
//			<body>
//				<ul>
//					<li>1번 리스트</li>
//					<li>2번 리스트</li>
//					<li>3번 리스트</li>
//					<li>4번 리스트</li>
//					<li>5번 리스트</li>
//				</ul>
//			</body>
//		</html>
		
		
	}

}
