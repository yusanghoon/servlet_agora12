package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class Test10Controller extends HttpServlet {
	
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "hagulu");
	        put("password", "asdf");
	        put("name", "김인규");
	    }
	};
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 아이디 패스워드 전달 받고 맵에 있는 정보와 확인후 처리 
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		out.print("<html><head><title>로그인</title></head><body>");
		
		if(!id.equals(userMap.get("id"))) {
			out.println("<h2>id가 일치하지 않습니다!</h2>");
		} else if(!password.equals(userMap.get("password"))) {
			out.println("<h2>password가 일치하지 않습니다</h2>");
		} else {
			out.println("<h1>" + userMap.get("name") + "님 환영합니다");
		}
		
		out.print("</body></html>");
		
	}

}
