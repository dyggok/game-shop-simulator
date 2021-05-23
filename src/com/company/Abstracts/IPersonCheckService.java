package com.company.Abstracts;

import com.company.Entities.Customer;

public interface IPersonCheckService {
    boolean checkIfRealPerson(Customer customer);
}
