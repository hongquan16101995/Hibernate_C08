package com.cg.hibernate.service.interface_service;

import com.cg.hibernate.model.Customer;
import com.cg.hibernate.service.core.ICRUDService;
import com.cg.hibernate.service.core.ISearchService;

public abstract class ICustomerService implements ICRUDService<Customer>,
        ISearchService<Customer> {
}
