package Adaptors;

import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
	//	KPSPublicSoapProxy proxy=new KPSPublicSoapProxy();
       boolean result = false;
		
		try 
		{
		//	result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), customer.dateOfBirth());		
		} 
		catch (Exception e) 
		{
			System.out.println("Not a valid person");
		}
		
		return result;
	}

}