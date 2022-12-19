package com.cg.hibernate.service.impl;

import com.cg.hibernate.model.Customer;
import com.cg.hibernate.repository.CustomerRepository;
import com.cg.hibernate.repository.jpa.ICustomerRepository;
import com.cg.hibernate.service.interface_service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService extends ICustomerService {
//    @Autowired
//    private CustomerRepository customerRepository;

    //tiêm phụ thuộc Repository và Service
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) iCustomerRepository.findAll();
    }

    @Override
    public Customer findOne(Long id) {
        return null;
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }

    @Override
    public List<Customer> m1(String name, String address) {
        return iCustomerRepository.demoQueryNative("%" + name + "%", "%" + address + "%");
    }

    @Override
    public void m2(String address) {
        iCustomerRepository.demoQueryNative1(address);
    }

    @Override
    public void m3() {
        iCustomerRepository.demoQueryNative2();
    }
}
