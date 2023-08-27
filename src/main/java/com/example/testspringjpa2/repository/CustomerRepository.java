package com.example.testspringjpa2.repository;

import com.example.testspringjpa2.costomer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByFirstName(String firstName);

    // Other custom query methods...
}
