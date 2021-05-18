package com.cg.aps.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.aps.entities.FlatRentEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.FlatRentDAOInt;

import com.cg.aps.service.FlatRentServiceImpl;
import com.cg.aps.service.FlatRentServiceInt;


/**
 * @author Indranil Jana
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FlatRentServiceTest {
	@MockBean
	FlatRentDAOInt dao;
	@Autowired
	FlatRentServiceImpl service;

	@Test
	public void testAddFlatRent() {

		FlatRentEntity obj = new FlatRentEntity("Sahitya", "shrivastava", "Owner", "1041b");

		Mockito.when(dao.save(obj)).thenReturn(obj);
		assertEquals(obj, service.add(obj));
	}
	
	@Test 
	public void testUpdateFlatRent()
	{
		
		FlatRentEntity obj = new FlatRentEntity("Sahitya", "shrivastava", "2000", "1041b");
	
	   
	    Mockito.when(dao.save(obj)).thenReturn(obj);

	    assertEquals(obj,service.add(obj));
	    
	    obj.setAmount("5002");
	    obj.setFlatNo("1041b");
	     
	      assertEquals(obj,service.update(obj));
}
	
	@Test
	public void testDeleteFlatRent()
	{
		FlatRentEntity obj = new FlatRentEntity("Sahitya", "shrivastava", "Owner", "1041b");
	    service.delete(obj.getFlatNo());
	    verify(dao,times(1)).deleteById(obj.getFlatNo());
	}
	


	
	@Test
	public void testSearch() throws RecordNotFoundException
	{
		FlatRentEntity obj = new FlatRentEntity("Sahitya", "shrivastava", "Owner", "1041b");
		FlatRentEntity obj1 = new FlatRentEntity("Anshul", "paaji", "Owner", "1042");	
		List<FlatRentEntity> list1  = new ArrayList();
		list1.add(obj);
		list1.add(obj1);
		
		
		Mockito.when(dao.findAll()).thenReturn(list1);
		assertEquals(2,service.search().size());
	}
	@Test
	public void testFindByName() throws RecordNotFoundException
	{
		String name="Sahitya";
		FlatRentEntity obj = new FlatRentEntity("Sahitya", "shrivastava", "Owner", "1041b");
		FlatRentEntity obj1 = new FlatRentEntity("Anshul", "paaji", "Owner", "1042");		
	 List<FlatRentEntity> list  = new ArrayList();
	list.add(obj);
	list.add(obj1);
	
		Mockito.when(dao.findByRenterName(name)).thenReturn(list);
		assertEquals(2,service.findByname(name).size());
		
	}
}
