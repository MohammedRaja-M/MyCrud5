package io.presentations.SpringBootStarter.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;
	
	@RequestMapping("/path")
	public List<Customer> getAllCustomer(){
		return customerservice.getAllCustomer();
	}
	
	@RequestMapping("/path/{id}")
	public Customer getCustomer(@PathVariable String id) {
		return CustomerService.getCustomer(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/path")
	public void addCustomer(@RequestBody Customer cust) {
		customerservice.addCustomer(cust);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/path/{id}")
	public void updateCustomer(@RequestBody Customer cust,@PathVariable String id) {
		customerservice.updateCustomer(id,cust);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/path/{id}")
	public void deleteCustomer(@PathVariable String id) {
		customerservice.deleteCustomer(id);
	}
	
}