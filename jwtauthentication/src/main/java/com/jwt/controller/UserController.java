package com.jwt.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.User;
import com.jwt.model.UserQuery;
import com.jwt.services.EmailSenderService;
import com.jwt.services.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private EmailSenderService emailService;
	
	 @Autowired
	    public UserController(UserService userService) {
	        this.userService = userService;
	    }
	
	@PostMapping("/")
	public ResponseEntity<User>  createPatient(@Valid @RequestBody User user) throws Exception {
		
		user.setRol("User");
		User newUser=this.userService.createUser(user);
		return new ResponseEntity<>(newUser,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<User> getUser(@PathVariable("username") String username) {
		
		return ResponseEntity.ok(this.userService.getUser(username));
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") long id) {
		this.userService.deleteUser(id);
	}
	
	@PostMapping("/query")
	public ResponseEntity<UserQuery> postQueries(@RequestBody UserQuery userQuery) throws Exception{
		
		String emailBody ="Your Query Has Been Successfully Saved! "+"\n\n" +
	            "We appreciate your interest in our services and will be in touch with you shortly. " + "\n\n"+
	            "Thank you for choosing our advanced Health Care System..\n\n" +
	            "Best regards,\n" +
	            "Health Care System";

		emailService.sendEmail(userQuery.getEmail(), "Health Care System", emailBody);
		
		UserQuery newQuery=this.userService.postQuery(userQuery);
		return new ResponseEntity<>(newQuery, HttpStatus.CREATED);
	}
	
}
