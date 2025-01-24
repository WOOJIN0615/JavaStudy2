package com.woojin.app.ztest;

public class TestMain {

	public static void main(String[] args) {
		try {
			
//			DBConnectionTest test = new DBConnectionTest();
//			test.getConnectionTest();
			
			UserDAOTest userDAOTest = new UserDAOTest();
			
			//userDAOTest.joinTest();
			userDAOTest.getListTest();
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}