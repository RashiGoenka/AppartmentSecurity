package com.cg.aps;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.aps.entities.DeliveryEntity;
import com.cg.aps.exceptions.RecordNotFoundException;
import com.cg.aps.repository.DeliveryDao;
import com.cg.aps.service.DeliveryService;

@SpringBootTest
public class DeliveryEntityTest {
	
@MockBean	
DeliveryDao dao;
@Autowired
DeliveryService service;

@Test //  Testing Add method  to add delivery entity.
public void testAddDeliveryEntity() {
	DeliveryEntity obj = new DeliveryEntity("Mehar","11:30", Date.valueOf(LocalDate.now()),"pending");
	Mockito.when(dao.save(obj)).thenReturn(obj);
	assertEquals(obj, service.add(obj));
}

@Test // Testing update method to update delivery entity
public void testUpdateDeliveryEntity() {
	DeliveryEntity obj = new DeliveryEntity("Mehar","11:30", Date.valueOf(LocalDate.now()),"Delivered");

	Mockito.when(dao.save(obj)).thenReturn(obj);
	assertEquals(obj, service.add(obj));
	obj.setOwnerName("harsh");
	assertEquals(obj, service.update(obj));
}
@Test //Testing delete method to delete delivery entity
public void testDeleteDeliveryEntity() {
	DeliveryEntity obj = new DeliveryEntity("Mehar","11:30", Date.valueOf(LocalDate.now()),"Deleted");
    
	Mockito.when(dao.save(obj)).thenReturn(obj);
	service.delete(obj);
	verify(dao, times(1)).deleteById(obj.getOwnerName());
}
@Test // Testing Search method to find all
public void testSearch() throws RecordNotFoundException {
	DeliveryEntity obj = new DeliveryEntity("Mehar","11:30", Date.valueOf(LocalDate.now()),"pending");
	DeliveryEntity obj1 = new DeliveryEntity("Jerry","12:30", Date.valueOf(LocalDate.now()),"pending");
	List<DeliveryEntity> list1 = new ArrayList();
	list1.add(obj);
	list1.add(obj1);

	Mockito.when(dao.findAll()).thenReturn(list1);
	assertEquals(2, service.search().size());
}
}
