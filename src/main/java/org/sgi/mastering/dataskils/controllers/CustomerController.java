package org.sgi.mastering.dataskils.controllers;

import java.util.List;

import javax.validation.Valid;

import org.sgi.mastering.dataskils.model.Customer;
import org.sgi.mastering.dataskils.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	
	// Get All Custommer
	@GetMapping("/customer")
	public List <Customer> getAllCustomer() {
		List <Customer>  liste = customerRepository.findAll();
		return liste;
	}
	
	// Create a new Customer
	@PostMapping("/newConstomer")
	public Customer createCustomer(/*@Valid @RequestBody Customer customer*/){
		Customer  customer = new Customer();
		customer.setFisrtname("fisrtname");
		customer.setLastname("lastname");
		customer.setBirthday(null);
		customer.setJob("job");
		return customerRepository.save(customer);
	}

}
