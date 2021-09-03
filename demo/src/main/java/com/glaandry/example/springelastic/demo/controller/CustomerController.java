package com.glaandry.example.springelastic.demo.controller;

import com.glaandry.example.springelastic.demo.model.Customer;
import com.glaandry.example.springelastic.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/saveCustomer")
    public int saveCustomer(@RequestBody List<Customer> customers) {
        customerRepository.saveAll(customers);
        return customers.size();
    }

    @GetMapping("/findAll")
    public Iterable<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/findByFName/{firstName}")
    public List<Customer> findByFirstName(@PathVariable String firstName) {
        return customerRepository.findByNome(firstName);
    }
}
