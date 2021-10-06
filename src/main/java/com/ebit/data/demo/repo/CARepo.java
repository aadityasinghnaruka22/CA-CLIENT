package com.ebit.data.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebit.data.demo.model.CA;

@Repository
public interface CARepo extends JpaRepository<CA, Integer> {

	CA findById(int id);
}
