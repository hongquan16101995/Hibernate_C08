package com.cg.hibernate.repository;

import com.cg.hibernate.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

//@Component
public class CustomerRepository {
//    @Autowired
//    private EntityManager entityManager;

//    public List<Customer> findAll() {
//        //SQL: select * from users
//        String queryStr = "SELECT c FROM Customer AS c";
//        TypedQuery<Customer> query = entityManager.createQuery(queryStr, Customer.class);
//        return query.getResultList();
//    }
}
