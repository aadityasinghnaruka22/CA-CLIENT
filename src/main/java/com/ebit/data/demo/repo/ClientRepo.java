package com.ebit.data.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebit.data.demo.model.Client;

@Repository
public interface ClientRepo extends JpaRepository<Client, Integer> {

	Client findById(int id);
}
