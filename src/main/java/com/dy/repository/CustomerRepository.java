package com.dy.repository;

import com.dy.model.Customer;

import java.util.List;

/**
 * Created by Admin on 07-02-2017.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
