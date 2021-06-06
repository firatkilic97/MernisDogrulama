 
package Concrete;

import Abstracts.BaseCustomerManager;
import Abstracts.ICustomerCheckService;
import Abstracts.ICustomerService;
import Entities.Customer;

 
public class  StarbucksCustomerManager extends BaseCustomerManager{
   private  ICustomerCheckService  customerCheckService;    

    @Override
    public void Save(Customer customer) {
        if(customerCheckService.CheckIfRealPerson(customer)){
           super.Save(customer);
        }
        else{
           System.out.println("not a valid person");        }
    
}

}