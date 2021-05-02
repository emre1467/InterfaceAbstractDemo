package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService checkService;
	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService=checkService;
	}
	
	public  void save(Customer customer) {
		if(checkService.checkIfRealPerson(customer)==true) {
			System.out.println("müþteri eklendi: "+customer.getFirstName()+" "+customer.getLastName());
		}
		else
			System.out.println("böyle bir kiþi edevlet de yok");
	}
}
