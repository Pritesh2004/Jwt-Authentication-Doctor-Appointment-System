package com.jwt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_queries")
public class UserQuery {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String email;
	
	private String queries;

	public UserQuery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserQuery(Long id, String email, String queries) {
		super();
		this.id = id;
		this.email = email;
		this.queries = queries;
	}

	@Override
	public String toString() {
		return "UserQuery [id=" + id + ", email=" + email + ", queries=" + queries + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQueries() {
		return queries;
	}

	public void setQueries(String queries) {
		this.queries = queries;
	}





}
