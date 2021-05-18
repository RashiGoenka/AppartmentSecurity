package com.cg.aps.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import  org.junit.runner.RunWith;

import com.cg.aps.entities.GardSalaryEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.GardSalaryDAOInt;
import com.cg.aps.service.GardSalaryServiceInt;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuardSalaryServiceTest {
	
	@Autowired
	GardSalaryServiceInt service;
		@MockBean
		GardSalaryDAOInt dao;
		
		@Test
		public void testAddGuardSalary()
		{
			
			GardSalaryEntity obj = new  GardSalaryEntity( "SHYAM", 12, 5000 , "WORKING",Date.valueOf(LocalDate.now()));
			
			Mockito.when(dao.save(obj)).thenReturn(obj);
			assertEquals(obj,service.add(obj));
				
			
		}
		@Test 
		public void testUpdateGuardTraining()
		{
			
			GardSalaryEntity obj = new  GardSalaryEntity( "SHYAM", 12, 5000 , "WORKING",Date.valueOf(LocalDate.now()));
		
		   Mockito.when(dao.save(obj)).thenReturn(obj);

		    assertEquals(obj,service.add(obj));
		    
		    obj.setName("harsh");
		    obj.setStatus("working");
		     
		      assertEquals(obj,service.update(obj));
		}
		
		@Test
		public void testDeleteGuardSalary()
		{
			GardSalaryEntity obj = new  GardSalaryEntity( "SHYAM", 12, 5000 , "WORKING",Date.valueOf(LocalDate.now()));
		    service.delete(obj);
		    verify(dao,times(1)).deleteById(obj.getName());
		}
		
		@Test
		public void testFindByName() throws RecordNotFoundException
		{
			String name="SHYAM";
			GardSalaryEntity obj = new GardSalaryEntity( "SHYAM", 12, 5000 , "WORKING",Date.valueOf(LocalDate.now()));
			GardSalaryEntity obj1 = new GardSalaryEntity( "RAJU", 13, 7000 , "NO STATUS",Date.valueOf(LocalDate.now()));
			
		List<GardSalaryEntity> list  = new ArrayList();
		list.add(obj);
		list.add(obj1);
		
		Mockito.when(dao.findByName(name)).thenReturn(list);
		assertEquals(2,service.findByName(name).size());
		
	}
	
		@Test
		public void testSearch() throws RecordNotFoundException
		{
			GardSalaryEntity obj =new  GardSalaryEntity( "SHYAM", 12, 5000 , "WORKING",Date.valueOf(LocalDate.now()));
			GardSalaryEntity obj1 =  new  GardSalaryEntity( "RAJU", 13, 7000 , "NO STATUS",Date.valueOf(LocalDate.now()));
			
			List<GardSalaryEntity> list1  = new ArrayList();
			list1.add(obj);
			list1.add(obj1);
			
			
			Mockito.when(dao.findAll()).thenReturn(list1);
			assertEquals(2,service.search().size());
		}
	}


