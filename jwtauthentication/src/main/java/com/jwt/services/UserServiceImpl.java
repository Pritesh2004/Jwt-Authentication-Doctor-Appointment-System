package com.jwt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.model.User;
import com.jwt.model.UserQuery;
import com.jwt.repo.UserQueryRepo;
import com.jwt.repo.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private UserQueryRepo userQueryRepo;
	
	//Creating User
	@Override
	public User createUser(User user) throws Exception {

		User local=this.userRepository.findByUsername(user.getUsername());
		
		if(local!=null) {
			System.out.println("User already present");
			throw new Exception("User already present");
		}else {
			
			user=this.userRepository.save(user);
			System.out.println(local);
		}
		
		return user;
	}

//	Getting patient
	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findByUsername(username);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		 this.userRepository.deleteById(id);
		
	}

	@Override
	public UserQuery postQuery(UserQuery userQuery) throws Exception {
		userQuery=this.userQueryRepo.save(userQuery);
		return userQuery;
	}

	
	
}
