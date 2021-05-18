package com.cg.aps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	public UserEntity findByEmailId(String emailId);
	public UserEntity findByLoginId(String loginId);
	//public UserEntity authenticate(UserEntity bean);
}
