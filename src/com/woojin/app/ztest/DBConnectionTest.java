package com.woojin.app.ztest;

import java.sql.Connection;

import com.winter.app.utils.DBConnection;

public class DBConnectionTest {
	
	
	
	public void getConnectionTest() throws Exception {
		 Connection con = DBConnection.getConnection();
		 
		 if(con != null) {
			 System.out.println("테스트 통과");
		 }else {
			 System.out.println("테스트 실패");
		 }
		
	}

}