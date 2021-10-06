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

import com.ebit.data.demo.model.Client;
import com.ebit.data.demo.service.ClientServie;

@RestController
public class ClientController {

	@Autowired
	private ClientServie clientService;
	
	@GetMapping("/client")
	public List<Client> getAll()
	{
		return clientService.getall();		
	}
	
	@GetMapping("/client/{id}")
	public Client getById(@PathVariable int id)
	{
		return clientService.getById(id);		
	}
	
	@PostMapping("/client")
	public String save(@Valid @RequestBody Client Client)
	{
		clientService.save(Client);
		return "data saved";
	}
	
	@PutMapping("/client/id}")
	public String update(@PathVariable int id, @RequestBody Client Client)
	{
		clientService.update(Client);
		return "data saved";
	}
	
	@DeleteMapping("/client/{id}")
	public String delete(@PathVariable int id)
	{
		clientService.deleteOne(id);
		return "delete selected data";
	}
	
	@DeleteMapping("/client")
	public String deleteAll()
	{
		clientService.delete();
		return "Delete All Data";
	}
}
