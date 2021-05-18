package com.cg.aps.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.UserEntity;

@Service

public interface UserServiceInt {
	
	
	public void add(UserEntity bean);
	public void update(UserEntity bean);
	
	public void delete(UserEntity bean);
	
	
	public UserEntity findByLogin(String login);
	public List<UserEntity> search( );
	
	//public String authenticate(UserEntity bean);
	
    
  
	
}
