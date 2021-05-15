package CoffeShop.business.abstracts;

import CoffeShop.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public abstract void Save(Customer customer) ;
	
}
