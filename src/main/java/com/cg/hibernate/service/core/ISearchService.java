package com.cg.hibernate.service.core;

import java.util.List;

public interface ISearchService<E> {
    List<E> findByName(String name);
}
