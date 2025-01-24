package com.woojin.app.users;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.woojin.app.util.DBConnection;

public class UserDAO {
	
	//1. 가입(추가) join
	public int join(UserDTO userDTO)throws Exception{
		Connection con = DBConnection.getConnection();
		
		String sql = "INSERT INTO USERS (USERNAME, PASSWORD, NAME, PHONE, EMAIL)"
				+ " VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, userDTO.getUserName());
		st.setString(2, userDTO.getPassword());
		st.setString(3, userDTO.getName());
		st.setString(4, userDTO.getPhone());
		st.setString(5, userDTO.getEmail());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnection(st, con);
		
		return result;
		
	}
	
	//2. 회원들의 목록을 조회, 단, password는 빼고 getList
	public List<UserDTO> getList()throws Exception{
		Connection con = DBConnection.getConnection();
		String sql ="SELECT USERNAME,NAME, EMAIL, PHONE FROM USERS";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		List<UserDTO> ar = new ArrayList<>();
		
		while(rs.next()) {
			UserDTO userDTO = new UserDTO();
			userDTO.setUserName(rs.getString("USERNAME"));
			userDTO.setName(rs.getString("NAME"));
			userDTO.setEmail(rs.getString("EMAIL"));
			userDTO.setPhone(rs.getString("PHONE"));
			ar.add(userDTO);
		}
		
		DBConnection.disConnection(rs, st, con);
		
		return ar;
		
	}
	
	
	

}