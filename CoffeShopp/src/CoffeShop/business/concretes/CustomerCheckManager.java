package CoffeShop.business.concretes;

import CoffeShop.business.abstracts.CustomerCheckService;
import CoffeShop.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
