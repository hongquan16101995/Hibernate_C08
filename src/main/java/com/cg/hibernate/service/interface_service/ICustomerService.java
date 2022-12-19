package com.cg.hibernate.service.interface_service;

import com.cg.hibernate.model.Customer;
import com.cg.hibernate.service.core.ICRUDService;
import com.cg.hibernate.service.core.ISearchService;

import java.util.List;

public abstract class ICustomerService
        implements ICRUDService<Customer>, ISearchService<Customer> {
    public abstract List<Customer> m1(String name, String address);

    public abstract void m2(String address);
    public abstract void m3();
}
