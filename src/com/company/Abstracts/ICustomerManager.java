package com.company.Abstracts;

import com.company.Entities.Customer;

import java.time.LocalDate;

public interface ICustomerManager {
    void register(Customer customer);
    void update(Customer customer, String firstname, String lastname, int year,String nationalityId);
    void delete(Customer customer);

}
