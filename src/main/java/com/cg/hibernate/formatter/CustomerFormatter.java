package com.cg.hibernate.formatter;

import com.cg.hibernate.model.Customer;
import com.cg.hibernate.service.interface_service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

public class CustomerFormatter implements Formatter<Customer> {
    private ICustomerService customerService;

    public CustomerFormatter(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public Customer parse(String id, Locale locale) throws ParseException {
        return customerService.findOne(Long.parseLong(id));
    }

    @Override
    public String print(Customer object, Locale locale) {
        return null;
    }
}
