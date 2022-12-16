package com.cg.hibernate.repository.jpa;

import com.cg.hibernate.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component
@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findAllByNameContaining(String name);

    List<Customer> findAllByAddressContaining(String address);
}
