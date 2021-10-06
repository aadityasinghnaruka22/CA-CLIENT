package com.ebit.data.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.data.demo.model.CA;
import com.ebit.data.demo.service.CAService;

@RestController
public class CAController {

	@Autowired
	private CAService caService;
	
	@GetMapping("/ca")
	public List<CA> getAll()
	{
		return caService.getall();		
	}
	
	@GetMapping("/ca/{id}")
	public CA getById(@PathVariable int id)
	{
		return caService.getById(id);		
	}
	
	@PostMapping("/ca")
	public String save(@Valid @RequestBody CA ca)
	{
		caService.save(ca);
		return "data saved";
	}
	
	@PutMapping("/ca/id}")
	public String update(@PathVariable int id, @RequestBody CA ca)
	{
		caService.update(ca);
		return "data saved";
	}
	
	@DeleteMapping("/ca/{id}")
	public String delete(@PathVariable int id)
	{
		caService.deleteOne(id);
		return "delete selected data";
	}
	
	@DeleteMapping("/ca")
	public String deleteAll()
	{
		caService.delete();
		return "Delete All Data";
	}
}
