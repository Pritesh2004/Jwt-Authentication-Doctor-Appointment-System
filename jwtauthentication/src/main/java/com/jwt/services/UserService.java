package com.jwt.services;



import com.jwt.model.User;
import com.jwt.model.UserQuery;


public interface UserService {

	
//	Creating Patient
	public User createUser(User user) throws Exception;
	
//	Getting Patient using username
	public User getUser(String username);
	
//	Deleting user using id
	public void deleteUser(Long id);
	
//	Post Queries
	public UserQuery postQuery(UserQuery userQuery) throws Exception;
	
}
