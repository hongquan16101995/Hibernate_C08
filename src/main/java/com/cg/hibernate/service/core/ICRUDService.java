package com.cg.hibernate.service.core;

import java.util.List;

public interface ICRUDService<E> {
    List<E> findAll();

    E findOne(Long id);

    void save(E e);

    void deleteById(Long id);
}
