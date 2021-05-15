 package CoffeShop.business.concretes;

import CoffeShop.business.abstracts.BaseCustomerManager;
import CoffeShop.entities.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void Save(Customer customer) {
	    System.out.println("Nero Customer Save to database: "+customer.getFirstName()+ customer.getLastName());		
		
	}

}
