package com.pcsoft.fum.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pcsoft.fum.jpamodel.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

	public Customer findById(Long id);
	public Customer findByFirstName(String firstName);
}
