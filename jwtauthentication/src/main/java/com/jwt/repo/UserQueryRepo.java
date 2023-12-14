package com.jwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.model.UserQuery;

public interface UserQueryRepo extends JpaRepository<UserQuery, Long>{

}
