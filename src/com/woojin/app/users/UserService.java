package com.woojin.app.users;

import java.util.List;

public class UserService {
	
	private UserDAO userDAO;
	
	public UserService() {
		this.userDAO = new UserDAO();
		
	}
	
	public List<UserDTO> getList() throws Exception{
		List<UserDTO> ar = userDAO.getList();
		return ar;
	}
	
	public UserDTO login(UserDTO userDTO) throws Exception{
		UserDTO result = UserDAO.getDetail(userDTO);
		
		if(result==null) {
			return result;
		}
		
		if (result.getPassword().equals(userDTO.getPassword())) {
			return result;
		}else {
			return null;
		}
	}

}
