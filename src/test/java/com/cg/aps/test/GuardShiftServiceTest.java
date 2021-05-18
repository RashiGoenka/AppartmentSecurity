package com.cg.aps.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.sql.Date;
import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import  org.junit.runner.RunWith;

import com.cg.aps.entities.GardShiftEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.GardShiftDAOInt;
import com.cg.aps.service.GardShiftServiceInt;

@RunWith(SpringRunner.class)
@SpringBootTest

public class GuardShiftServiceTest {
	@Autowired
	GardShiftServiceInt service;
		@MockBean
		GardShiftDAOInt dao;
		
		@Test
		public void testAddGuardTraining()
		{
			
			GardShiftEntity obj = new GardShiftEntity(10, "RAJU", "11:30" , Date.valueOf(LocalDate.now())); 
			
			
			Mockito.when(dao.save(obj)).thenReturn(obj);
			assertEquals(obj,service.add(obj));
				}
		
		@Test 
		public void testUpdateGuardTraining()
		{
			
			GardShiftEntity obj = new GardShiftEntity(10, "RAJU", "11:30" , Date.valueOf(LocalDate.now()));
		
		   
		  Mockito.when(dao.save(obj)).thenReturn(obj);

		    assertEquals(obj,service.add(obj));
		    
		    obj.setName("harsh");
		    obj.setTime("10:30");
		     
		      assertEquals(obj,service.update(obj));
		}
		@Test 
		
		public void testDeleteGuardTraining()
		{
		GardShiftEntity obj = new GardShiftEntity(100, "RAJU", "11:30" , Date.valueOf(LocalDate.now()));
		 service.delete(obj.getUserid());
		    verify(dao,times(1)).deleteById(obj.getUserid());
		}

		
		@Test
		public void testSearch() throws RecordNotFoundException
		{
			GardShiftEntity obj = new GardShiftEntity(1001, "RAJU", "11:30" , Date.valueOf(LocalDate.now()));
			GardShiftEntity obj1 = new GardShiftEntity(1315, "PANKAJ", "10:00", Date.valueOf(LocalDate.now()));
			List<GardShiftEntity> list1  = new ArrayList();
			list1.add(obj);
			list1.add(obj1);
			
			
			Mockito.when(dao.findAll()).thenReturn(list1);
			assertEquals(2,service.search().size());
		}
	}

