package com.restful.cedi.jpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    // Iterable<Customer> getAllCustomersIterable() {
    //     return customerRepository.findAll();
    // }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public List<Customer> getCustomer(String lastname) {
        return customerRepository.findByLastName(lastname);
    }

    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }



}