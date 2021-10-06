package com.ebit.data.demo.service;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ebit.data.demo.model.Client;
import com.ebit.data.demo.repo.ClientRepo;

@Service
public class ClientServie {

	@Autowired
	private ClientRepo clientRepo;

	
	public List<Client> getall() {
		// TODO Auto-generated method stub
		return clientRepo.findAll();
	}

	public Client getById(int id) {
		// TODO Auto-generated method stub
		return clientRepo.findById(id);
	}

	public void save(@Valid Client client) {
		// TODO Auto-generated method stub
		clientRepo.save(client);
	}

	public void update(Client client) {
		// TODO Auto-generated method stub
		clientRepo.save(client);
	}

	public void deleteOne(int id) {
		// TODO Auto-generated method stub
		clientRepo.deleteById(id);
	}

	public void delete() {
		// TODO Auto-generated method stub
		clientRepo.deleteAll();
	}
	
	

}
