 
package coffee;

import Abstracts.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;
import java.time.LocalDate;
import java.time.LocalDateTime;

 
public class Coffee {

     
    public static void main(String[] args) {
  
        BaseCustomerManager customerManager=new NeroCustomerManager();
        customerManager.Save(new Customer(1, "f�rat", "k�l��", LocalDate.of(1997, 4, 15), "428231742322"));
    }
    
}
