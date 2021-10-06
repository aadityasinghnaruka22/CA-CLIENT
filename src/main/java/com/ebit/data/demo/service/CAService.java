package com.ebit.data.demo.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.data.demo.model.CA;
import com.ebit.data.demo.repo.CARepo;

@Service
public class CAService {
	
	@Autowired
	private CARepo caRepo;

	public List<CA> getall() {
		// TODO Auto-generated method stub
		return caRepo.findAll();
	}

	public CA getById(int id) {
		// TODO Auto-generated method stub
		return caRepo.findById(id);
	}

	public void save(@Valid CA ca) {
		// TODO Auto-generated method stub
		caRepo.save(ca);
	}

	public void update(CA ca) {
		// TODO Auto-generated method stub
		caRepo.save(ca);
	}

	public void deleteOne(int id) {
		// TODO Auto-generated method stub
		caRepo.deleteById(id);
	}

	public void delete() {
		// TODO Auto-generated method stub
		caRepo.deleteAll();
	}
	
	

}
