package com.dy.repository;

import com.dy.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 07-02-2017.
 */

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUser}")
    private String dbUser;

    public List<Customer> findAll() {
        System.out.println("*****"+dbUser+"****");
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Deepesh");
        customer.setLastName("Yadav");
        customers.add(customer);
        return customers;
    }
}
