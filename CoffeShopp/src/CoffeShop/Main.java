package CoffeShop;

import CoffeShop.adapters.MernisServiceAdapter;
import CoffeShop.business.abstracts.BaseCustomerManager;
import CoffeShop.business.concretes.NeroCustomerManager;
import CoffeShop.business.concretes.StarbucksCustomerManager;
import CoffeShop.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.Save(new Customer(1,"SEMA","KAYA",1992,"2948963578"));
		
		BaseCustomerManager baseCustomerManagerNero=new NeroCustomerManager();
		baseCustomerManagerNero.Save(new Customer(2,"Batu","Kaya",1991,"45654896541"));
		
	}

}
