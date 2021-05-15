package CoffeShop.business.concretes;

import CoffeShop.business.abstracts.BaseCustomerManager;
import CoffeShop.business.abstracts.CustomerCheckService;
import CoffeShop.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

    private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Starbucks Customer Saved to database: " +customer.getFirstName());
		}else {
			System.out.println("Not a vali d person");
		}
      
	}

}
