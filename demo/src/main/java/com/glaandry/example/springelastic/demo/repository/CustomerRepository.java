package com.glaandry.example.springelastic.demo.repository;

import com.glaandry.example.springelastic.demo.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

    //risolvere no property found for type
    List<Customer> findByFirstname(String firstName);
}
