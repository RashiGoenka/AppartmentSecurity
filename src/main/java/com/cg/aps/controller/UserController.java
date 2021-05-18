package com.cg.aps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aps.entities.UserEntity;
import com.cg.aps.service.UserServiceInt;
import com.cg.aps.service.UserServiceIntImpl;

@RestController
@RequestMapping("/user")

public class UserController {
	@Autowired
	 UserServiceIntImpl userobj;
	
		// add user
		@PostMapping("/adduser")
		public  void add(@RequestBody UserEntity bean) {
			System.out.println("yes..User added...");
			userobj.add(bean);
		}
		
				//update user details
				@PutMapping("/updateuser")
				public void update(@RequestBody UserEntity bean) {
					 userobj.update(bean);
					}
				
				//Delete user detail
				@DeleteMapping("/Deleteuser")
				public void delete(@RequestBody UserEntity bean) {
					 userobj.delete(bean);
				}

				//Find user by loginid
				 @GetMapping("/finduser/{loginId}")
  				public UserEntity findByLogin(@PathVariable("loginId") String loginId) {
    
    			return userobj.findByLogin(loginId);
  				}
  			
  			//search user	
		@GetMapping("/searchuser")
		 public List<UserEntity> search() {
			 return userobj.search(); 
		}

}
