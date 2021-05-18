package com.cg.aps.test;






import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.aps.entities.VehicleEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.VehicleDAOInt;
import com.cg.aps.service.VehicleServiceImpl;

/*
 * @author: Rashi Goenka
 * 
 */


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class VehicleServiceTest {
	
	@Autowired
	private VehicleServiceImpl service;
	
	@MockBean
	private VehicleDAOInt dao;
	
	@Test
	public void testAdd()
	{
		VehicleEntity obj = new VehicleEntity("BR201","Pulsar","4","10:30","11:30",Date.valueOf(LocalDate.now()),"2-wheel");
		Mockito.when(dao.save(obj)).thenReturn(obj);
		assertEquals(obj, service.add(obj));

    }//addVehicle Test
	
	@Test
	public void testUpdate()
	{
		VehicleEntity obj = new VehicleEntity("BR201","Pulsar","4","10:30","11:30",Date.valueOf(LocalDate.now()),"2-wheel");
		Mockito.when(dao.save(obj)).thenReturn(obj);
		assertEquals(obj,service.add(obj));
		
		obj.setName("Activa");
		obj.setParkingNo("2");
		
		assertEquals(obj, service.update(obj));
		
	}//updateVehicle Test
	
	@Test
	public void testDelete()
	{
		VehicleEntity obj = new VehicleEntity("BR201","Pulsar","4","10:30","11:30",Date.valueOf(LocalDate.now()),"2-wheel");
		service.delete(obj);
		verify(dao, times(1)).deleteById(obj.getVehicleNo());
	}//deletVehicle Test
	
	@Test
	public void testFindByName() throws RecordNotFoundException
	{
		String name="Activa";
		VehicleEntity obj1 = new VehicleEntity("BR201","Pulsar","4","10:30","11:30",Date.valueOf(LocalDate.now()),"2-wheel");
		VehicleEntity obj2 = new VehicleEntity("BR202","Activa","2","10:30","11:30",Date.valueOf(LocalDate.now()),"2-wheel");
		List<VehicleEntity> list = new ArrayList();
		list.add(obj1);
		list.add(obj2);

		Mockito.when(dao.findByName(name)).thenReturn(list);
		assertEquals(2, service.findByName(name).size());
	}//findByName Test
	
	@Test
	public void testFindAll() throws RecordNotFoundException
	{
		VehicleEntity obj1 = new VehicleEntity("BR201","Pulsar","4","10:30","11:30",Date.valueOf(LocalDate.now()),"2-wheel");
		VehicleEntity obj2 = new VehicleEntity("BR202","Activa","2","10:30","11:30",Date.valueOf(LocalDate.now()),"2-wheel");
		List<VehicleEntity> list = new ArrayList();
		list.add(obj1);
		list.add(obj2);

		Mockito.when(dao.findAll()).thenReturn(list);
		assertEquals(2, service.search().size());
	}//search test
	
	@Test
	public void testFindByPk()
	{
		Optional<VehicleEntity> obj1 = Optional.of(new VehicleEntity("BR201","Pulsar","4","10:30","11:30",Date.valueOf(LocalDate.now()),"2-wheel"));
		Mockito.when(dao.findById(obj1.get().getVehicleNo())).thenReturn(obj1);
		Optional<VehicleEntity> obj2 = service.findByPk(obj1.get().getVehicleNo());
		assertEquals(obj1.get().getVehicleNo(), obj2.get().getVehicleNo());

	}

}
