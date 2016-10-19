package com.pcsoft.fum.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcsoft.fum.dao.CustomerRepository;
import com.pcsoft.fum.jpamodel.Customer;

@Service
@Transactional
public class CustomerService implements ICustomerService {

	@Autowired
	CustomerRepository repository;
	
	@Override
	public Customer saveAndGet() {
		Customer cust = new Customer("pavan","kumar");
		cust = repository.save(cust);
		return repository.findByFirstName(cust.getFirstName());
	}
}
