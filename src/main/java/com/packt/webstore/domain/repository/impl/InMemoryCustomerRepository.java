package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
	private List<Customer> listAllCustomers = new ArrayList<Customer>();
	
	
	public InMemoryCustomerRepository() {
		Customer customer1 = new Customer("cust1", "孙悟空","花果山","yes");
		Customer customer2 = new Customer("cust2", "猪八戒","云栈洞","yes");
		Customer customer3 = new Customer("cust3", "唐僧","长安","no");
		

		listAllCustomers.add(customer1);
		listAllCustomers.add(customer2);
		listAllCustomers.add(customer3);
	}
	public List<Customer> getAllCustomers()
	{
		return listAllCustomers;
	}
}
