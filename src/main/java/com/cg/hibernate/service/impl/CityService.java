package com.cg.hibernate.service.impl;

import com.cg.hibernate.model.City;
import com.cg.hibernate.repository.jpa.ICityRepository;
import com.cg.hibernate.service.interface_service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityService extends ICityService {

    @Autowired
    private ICityRepository iCityRepository;

    @Override
    public List<City> findAll() {
        return (List<City>) iCityRepository.findAll();
    }

    @Override
    public City findOne(Long id) {
        return iCityRepository.findById(id).get();
    }

    @Override
    public void save(City city) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
