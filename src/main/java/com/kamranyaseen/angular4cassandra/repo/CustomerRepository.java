package com.kamranyaseen.angular4cassandra.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.kamranyaseen.angular4cassandra.model.Customer;

public interface CustomerRepository extends CassandraRepository<Customer> {

}
