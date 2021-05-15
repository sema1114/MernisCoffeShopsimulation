package CoffeShop.business.abstracts;

import CoffeShop.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
