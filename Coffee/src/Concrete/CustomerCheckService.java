 
package Concrete;

import Abstracts.ICustomerCheckService;
import Abstracts.ICustomerService;
import Entities.Customer;

 
 
 public class CustomerCheckService implements ICustomerCheckService{

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return false;
     
        
          
    }
 
   
    
}
