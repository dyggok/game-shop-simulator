package com.company.Adapters;

import com.company.Abstracts.IPersonCheckService;
import com.company.Entities.Customer;
import com.company.MernisReference.PCWKPSPublicSoap;

public class MernisServiceAdapter implements IPersonCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        PCWKPSPublicSoap client = new PCWKPSPublicSoap();
        try {
            if(client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),customer.getFirstName().toUpperCase(),
                     customer.getLastName().toUpperCase(), customer.getDayOfBirth().getYear())){
                return true;
            }
        } catch (Exception e) {

        }
        return false;
    }
}
