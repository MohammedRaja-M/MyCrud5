package io.presentations.SpringBootStarter.Client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	public List<Customer> getAllCustomer(){
		return custo;
	}

	private static ArrayList<Customer> custo = new ArrayList<>(Arrays.asList(
			
			new Customer("Abdul","cust123",6354778765l),
			new Customer("kalam","cust456",8767456754l),
			new Customer("Karthik","cust789",9878904367l)
        ));
	
	public void addCustomer(Customer cust) {
		custo.add(cust);
	}

	public void updateCustomer(String id, Customer cust) {
		for(int i=0; i<custo.size(); i++) {
			Customer c = custo.get(i);
			if(c.getId().equals(id)) {
				custo.set(i, cust);
				return;
			}
		}
		
	}

	public void deleteCustomer(String id) {
		custo.removeIf(c->c.getId().equals(id));
		
	}

	public static Customer getCustomer(String id) {
		return custo.stream().filter(c->c.getId().equals(id)).findFirst().get();
	}
	
	
}
