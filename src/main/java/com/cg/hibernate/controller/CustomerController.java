package com.cg.hibernate.controller;

import com.cg.hibernate.model.Customer;
import com.cg.hibernate.service.interface_service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping(produces = "application/json", consumes = "application/json")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("customers", iCustomerService.findAll());
        return modelAndView;
    }

    @GetMapping("/test")
    public ResponseEntity<List<Customer>> test() {
        List<Customer> demo = iCustomerService.findAll();
        return new ResponseEntity<>(iCustomerService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/demo")
    public ModelAndView demo(@RequestBody Customer customer) {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("customers",
                iCustomerService.m1(null, "l"));
        return modelAndView;
    }

    @GetMapping("/demo1")
    public ModelAndView demo1() {
        ModelAndView modelAndView = new ModelAndView("list");
        iCustomerService.m2("HN");
        modelAndView.addObject("customers",
                iCustomerService.findAll());
        return modelAndView;
    }

    @GetMapping("/demo2")
    public ModelAndView demo2() {
        iCustomerService.m3();
        return new ModelAndView("list");
    }

    @GetMapping("/demo3")
    public ModelAndView demo3(@RequestParam("id") Customer customer) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer);
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
