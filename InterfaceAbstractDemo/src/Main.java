import java.util.GregorianCalendar;

import Concrete.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer();
		
		customer.firstName="emre";
		customer.lastName="yiðit";
		customer.id=1;
		customer.nationalIdentity="12345689";
		
		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new CustomerCheckManager()); 
		baseCustomerManager.save(customer);

	}

}
