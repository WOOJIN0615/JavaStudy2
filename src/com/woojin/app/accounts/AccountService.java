package com.woojin.app.accounts;

import java.util.Calendar;

public class AccountService {
	//데이터를 넣기전 전처리
	//데이터를 넣은후 후처리
	
	public AccountService() {
		accountDAO = new AccountDAO;
	}
	
	private static long count=1;
	
	public int add() throws Exception{
		AccountDTO accountDTO;
		
		Calendar calendar = Calendar.getInstance();
	}
}
