package com.company.Concrete;

import com.company.Abstracts.ICustomerManager;
import com.company.Abstracts.IPersonCheckService;
import com.company.Entities.Customer;

import java.time.LocalDate;

public class CustomerManager implements ICustomerManager {
    IPersonCheckService iPersonCheckService;

    public CustomerManager(IPersonCheckService iPersonCheckService) {
        this.iPersonCheckService = iPersonCheckService;
    }

    @Override
    public void register(Customer customer) {
        if(iPersonCheckService.checkIfRealPerson(customer)){
            System.out.println(customer.getFirstName()+" adlı müşteri kaydedildi");
        }else{
            throw new RuntimeException("Böyle bir kişi tanımlanamadı");
        }
    }

    @Override
    public void update(Customer customer, String firstname, String lastname,
                       int year, String nationalityId) {
        customer.setFirstName(firstname);
        customer.setLastName(lastname);
        customer.setDayOfBirth(LocalDate.of(year,customer.getDayOfBirth().getMonth(),customer.getDayOfBirth().getDayOfMonth()));
        System.out.println(customer.getFirstName()+" adlı müşterinin bilgileri güncellendi.");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getFirstName()+" adlı müşterinin kaydı silindi.");
    }
}
