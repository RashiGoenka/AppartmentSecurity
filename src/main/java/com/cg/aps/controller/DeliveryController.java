package com.cg.aps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aps.entities.DeliveryEntity;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.service.DeliveryService;

/*
 * @author Mehar Asad
 * 
 */
@RestController
@RequestMapping ("/delivery")
public class DeliveryController {
	@Autowired
	DeliveryService service;

	
	@PostMapping("/addDelivery")
	public void addDelivery(@RequestBody DeliveryEntity Delivery) {
		service.add(Delivery);
	}


	@PutMapping("/updateDelivery")
	public void updateDelivery(@RequestBody DeliveryEntity Delivery) {
		service.update(Delivery);
	}


	@DeleteMapping("/deleteDelivery")
	public void deleteDelivery(@RequestBody DeliveryEntity Delivery) {
	service.delete(Delivery);
	}

	
	@GetMapping("/getAll")
	public List<DeliveryEntity> searchDeliveries() throws RecordNotFoundException {
		return service.search();
	}
	
	
}
