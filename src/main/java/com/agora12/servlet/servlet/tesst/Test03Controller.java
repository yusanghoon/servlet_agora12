package com.agora12.servlet.servlet.tesst;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test03")
public class Test03Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		Date now = new Date();
		
		SimpleDateFormat Formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String daString =  Formatter.format(now);
		
		out.println("<html> <head> <title>뉴스</title> </head> ");
		out.println("<body><h1>[단독] 고양이가 야옹해 </h1>  ");
		out.println("기사 입력시간" + daString );
		out.println("<hr>");
		out.println("끝 </body> </html>");
		
		

	}
	
	
	
	

}
