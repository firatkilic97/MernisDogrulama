 
package Abstracts;

import Entities.Customer;

 
public class BaseCustomerManager implements ICustomerService{

    @Override
    public void Save(Customer customer) {
        System.out.println("saved to db"+customer.getFirstName());
     }
    
}
