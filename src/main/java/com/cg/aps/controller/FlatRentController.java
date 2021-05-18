package com.cg.aps.controller;
/**


* @author NAME:IndranilJana

 
*

 
*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aps.entities.FlatRentEntity;
import com.cg.aps.exceptions.RecordNotFoundException;
import com.cg.aps.service.FlatRentServiceImpl;


	@RestController
	@RequestMapping("/FlatRent")
	public class FlatRentController {

		@Autowired
		FlatRentServiceImpl service;
		
		
	
		@PostMapping("/addFlatRent")
		public FlatRentEntity addFlatRent(@RequestBody FlatRentEntity guard)
		{
			return service.add(guard);
		}
		
	
		@PutMapping("/updateFlatRent")
		public FlatRentEntity updateFlatRent(@RequestBody FlatRentEntity guard)
		{
			return service.update(guard);
		}
		
		
		@DeleteMapping("/deleteFlatRent/{flatno}")
		public String deleteFlatRent(@PathVariable ("flatno") String id)
		{
			return service.delete(id);
		}
		
		
		@GetMapping("/getName/{name}")
		List<FlatRentEntity> getByName(@PathVariable("name") String name) throws RecordNotFoundException
		{
			
			
			return service.findByname(name);
		}
		
		
		@GetMapping("/getAll")
		public List<FlatRentEntity> search() throws RecordNotFoundException
		{
			return service.search();
		}
	}
