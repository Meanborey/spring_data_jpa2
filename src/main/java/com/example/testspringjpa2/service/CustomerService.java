package com.example.testspringjpa2.service;

import com.example.testspringjpa2.costomer.Customer;
import com.example.testspringjpa2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    // Other service methods...
}
