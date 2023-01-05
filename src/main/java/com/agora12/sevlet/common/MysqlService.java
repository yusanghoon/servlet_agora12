package com.agora12.sevlet.common;

import java.sql.SQLException;

public class MysqlService {

	// 접속주소, 아이디, 비밀번호
	private final Srting url = "jdbc:mysql:블라블라"
	private final Srting userId = "root";
	private final Srting password = "password = "root";
	
	private final Connection connection;	
	private Statement statement;		
	// 접속기능
	public void connect() {
		//접속
		
		try {
			connection = DriverManager.getConnercion(url, userId, password);
			statement = connection.createStatement();			
		} catch (SQLException e) {
			// TODA Auto-generated catch block
			e.printStackTrace();
		}
	}
			
	// 쿼리 수행기능 select
	public ResultSt select(String query) {
		
		
		
	}
	
	
	
	
	
	
	
}
