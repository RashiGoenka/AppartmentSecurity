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

import com.cg.aps.entities.FlatEntity;
import com.cg.aps.service.FlatServiceImpl;



	@RestController
	@RequestMapping("/Flat")
	public class FlatController {

		@Autowired
		FlatServiceImpl service;
		
		@PostMapping("/addFlat")
		public FlatEntity addFlat(@RequestBody FlatEntity Flat)
		{
			return service.add(Flat);
		}
		

		@PutMapping("/updateFlat")
		public FlatEntity updateFlat(@RequestBody FlatEntity Flat)
		{
			return service.update(Flat);
		}
	
		@DeleteMapping("/deleteFlat/{flatno}")
		public void deleteFlat(@PathVariable ("flatno") String id)
		{
			service.delete(id);
		}
		
		@GetMapping("/getName/{name}")
		List<FlatEntity> getByName(@PathVariable ("name") String name)
		{
			
			return service.findByOwnerName(name);
		}	
		
		@GetMapping("/getAll")
		List<FlatEntity> search()
		{
			return service.search();
		}
	}
