package com.example.testspringjpa2.specification;

import com.example.testspringjpa2.costomer.Customer;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;


public class CustomerSpecification implements Specification<Customer> {

    private String name;
    private Integer age;

    public CustomerSpecification(String name, Integer age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public Specification<Customer> and(Specification<Customer> other) {


        return Specification.super.and(other);
    }

    @Override
    public Specification<Customer> or(Specification<Customer> other) {
        return Specification.super.or(other);
    }

    @Override
    public jakarta.persistence.criteria.Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        return null;
    }





}