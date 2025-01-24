package com.woojin.app.accounts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.woojin.app.util.DBConnection;


  

public class AccountDAO {
	
	public int join(AccountDTO dto) throws Exception{
		Connection conn = DBConnection.getConnection();
		String sql = "INSERT INTO ACCOUNTS VALUES ?, ?, ?, ?, SYSDATE";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, dto.getAccountnum());
		ps.setString(2, dto.getUsername());
		ps.setInt(3, dto.getProductnum());
		ps.setInt(4, dto.getAccountbalance());
		
		int result = ps.executeUpdate();
		
		DBConnection.disConnection(ps, conn);
		return result;
		
	}
	
	public List<AccountDTO> getList(AccountDTO dto2) throws Exception{
		List<AccountDTO> ar = new ArrayList<>();
		AccountDTO dto = null;
		Connection conn = DBConnection.getConnection();
		String sql = "SELECT * FROM ACCOUNTS WHERE USERNAME=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			dto = new AccountDTO();
			dto.setAccountnum(rs.getString("ACCOUNTNUM"));
			dto.setUsername(rs.getString("USERNAME"));
			dto.setProductnum(rs.getInt("PRODUCTNUM"));
			dto.setAccountbalance(rs.getInt("ACCOUNTBALANCE"));
			dto.setAccountdate(rs.getDate("ACCOUNTDATE"));
			
			ar.add(dto);
			
			return ar;
		}
		
		DBConnection.disConnection(rs, ps, conn);
		
		return ar;
	}

}
