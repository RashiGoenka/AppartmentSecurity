package com.cg.aps.test;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;



import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import  org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.aps.entities.UserEntity;
import com.cg.aps.repository.UserRepository;
import com.cg.aps.service.UserServiceInt;


@RunWith(SpringRunner.class)
@SpringBootTest

public class UserServiceTest {
	    
	    @Autowired
	    UserServiceInt service;
	        @MockBean
	        UserRepository dao;
	        
	        @Test
	        public void testAddUser()
	        {
	            
	            UserEntity obj = new  UserEntity( 101,"Riti","Roy","riti","riti","7074357922","royriti@gmail.com");
	            
	            Mockito.when(dao.save(obj)).thenReturn(obj);
	          
	                
	            
	        }
	        @Test 
	        public void testUpdateUser()
	        {
	            
	        	UserEntity obj = new  UserEntity( 101,"Riti","Roy","riti","riti","7074357922","royriti@gmail.com");
	        
	           Mockito.when(dao.save(obj)).thenReturn(obj);

	 

	        
	            
	            obj.setMobileNo("7074357924");
	            obj.setFirstName("riti"); 
	          
	        }
	        
	        @Test
	        public void testDeleteUser()
	        {
	        	UserEntity obj = new  UserEntity(101,"Riti","Roy","riti","riti","7074357922","royriti@gmail.com");
	            service.delete(obj);
	            verify(dao,times(1)).delete(obj);
	        }
	        
	        @Test
	        public void testFindByLoginId()
	        {
	            String loginId="riti";
	            UserEntity obj = new UserEntity(101,"Riti","Roy","riti","riti","7074357922","royriti@gmail.com");
	          
	            Mockito.when(dao.findByLoginId(loginId)).thenReturn(obj);  
	        assertEquals(service.findByLogin(loginId),obj) ;
	    }
	    
	        @Test
	        public void testSearch()
	        {
	        	UserEntity obj =new  UserEntity(101,"Riti","Roy","riti","riti","7074357922","royriti@gmail.com");
	        	UserEntity obj1 =  new  UserEntity(102,"Shrijoyee","Roy","shrijoyee","shrijoyee","7074357921","royshrijoyee@gmail.com");
	            
	            List<UserEntity> list1  = new ArrayList();
	            list1.add(obj);
	            list1.add(obj1);
	            
	            
	            Mockito.when(dao.findAll()).thenReturn(list1);
	            assertEquals(2,service.search().size());
	        }
	    }


