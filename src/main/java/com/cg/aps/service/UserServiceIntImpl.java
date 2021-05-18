package com.cg.aps.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entities.UserEntity;

import com.cg.aps.repository.UserRepository;

@Service
@Transactional
public class UserServiceIntImpl implements UserServiceInt {
	@Autowired
	
	UserRepository dao;
	
	
	@Override
	public void add(UserEntity bean) {	
		 dao.save(bean);
		 System.out.println("User added....");
			}

	@Override
	public void delete(UserEntity bean) {
		dao.delete(bean);
	}
	@Override
	public void update(UserEntity bean) {
		 dao.save(bean);	
	}

	@Override
	public UserEntity findByLogin(String login) {
		return dao.findByLoginId(login) ;
	}
	@Override
	public List<UserEntity> search( ) {
		return dao.findAll();	
	}

	






}
