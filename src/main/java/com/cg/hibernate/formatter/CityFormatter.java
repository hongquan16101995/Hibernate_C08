package com.cg.hibernate.formatter;

import com.cg.hibernate.model.City;
import com.cg.hibernate.service.interface_service.ICityService;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CityFormatter implements Formatter<City> {
    private ICityService iCityService;

    public CityFormatter(ICityService iCityService) {
        this.iCityService = iCityService;
    }

    @Override
    public City parse(String id, Locale locale) throws ParseException {
        return iCityService.findOne(Long.parseLong(id));
    }

    @Override
    public String print(City object, Locale locale) {
        return null;
    }
}
