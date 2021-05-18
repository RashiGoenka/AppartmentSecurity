package com.cg.aps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.aps.entities.FlatEntity;
import com.cg.aps.entities.FlatRentEntity;
import com.cg.aps.exceptions.RecordNotFoundException;
import com.cg.aps.repository.FlatDAOInt;
import com.cg.aps.service.FlatServiceImpl;
import com.cg.aps.service.FlatServiceInt;

@SpringBootTest

public class FlatServiceTest {
	@MockBean
	FlatDAOInt dao;
	@Autowired
	FlatServiceImpl service;

	@Test
	public void testAddFlat() {

		FlatEntity obj = new FlatEntity("Sahitya", "1041", "owner", "1041b");

		Mockito.when(dao.save(obj)).thenReturn(obj);
		assertEquals(obj, service.add(obj));
	}

	@Test
	public void testUpdateFlat() {

		FlatEntity obj = new FlatEntity("Sahitya", "1041", "owner", "1041b");

		Mockito.when(dao.save(obj)).thenReturn(obj);

		assertEquals(obj, service.add(obj));

		obj.setFloorNo("10");
		obj.setFlatNo("1041b");

		assertEquals(obj, service.update(obj));

	}

	@Test
	public void testDeleteFlat() {
		FlatEntity obj = new FlatEntity("Sahitya", "1041", "owner", "1041b");
		service.delete(obj.getFlatNo());
		verify(dao, times(1)).deleteById(obj.getFlatNo());
	}

	@Test
	public void testFindByName() throws RecordNotFoundException {
		String name = "Sahitya";
		FlatEntity obj = new FlatEntity("Sahitya", "1041", "owner", "1041b");
		FlatEntity obj1 = new FlatEntity("mridul", "1045", "owner2", "1045");
		List<FlatRentEntity> list = new ArrayList();

		List<FlatEntity> list1 = new ArrayList();
		list1.add(obj);
		list1.add(obj1);

		Mockito.when(dao.findByOwnerName(name)).thenReturn(list1);
		assertEquals(2, service.findByOwnerName(name).size());

	}



	@Test
	public void testSearch() throws RecordNotFoundException {
		FlatEntity obj = new FlatEntity("Sahitya", "1041", "owner", "1041b");
		FlatEntity obj1 = new FlatEntity("mridul", "1045", "owner2", "1045");
		List<FlatEntity> list1 = new ArrayList();
		list1.add(obj);
		list1.add(obj1);

		Mockito.when(dao.findAll()).thenReturn(list1);
		assertEquals(2, service.search().size());
	}
}
