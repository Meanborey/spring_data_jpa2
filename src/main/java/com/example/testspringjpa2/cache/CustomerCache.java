package com.example.testspringjpa2.cache;


import com.example.testspringjpa2.costomer.Customer;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerCache {

    private final Cache cache;

    public CustomerCache(CacheManager cacheManager) {
        this.cache = cacheManager.getCache("customerCache");
    }

    @PostConstruct
    public void initCache() {
        cache.put("Alice", List.of(new Customer(1L, "Alice", "Johnson", 25)));
        cache.put("Bob", List.of(new Customer(2L, "Bob", "Smith", 30)));
    }



    public List<Customer> getCustomersByName(String name) {
        return cache.get(name, List.class);
    }

    public void putCustomersByName(String name, List<Customer> customers) {
        cache.put(name, customers);
    }
}
