package com.tjetc.app.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;

import com.tjetc.app.dao.CityDao;
import com.tjetc.app.dao.CountrylaDao;
import com.tjetc.app.dao.impl.CityDaoImpl;
import com.tjetc.app.dao.impl.CountrylaDaoImpl;
import com.tjetc.app.entity.City;
import com.tjetc.app.entity.Country;

public class Test {
	@org.junit.Test
	public void test() {
		CityDao cityDao = new CityDaoImpl();
		City city = cityDao.findAllById(1);
		System.out.println(city.getName());
	}


	@org.junit.Test
	public void test1(){
		CountrylaDao countrylaDao = new CountrylaDaoImpl();
		String cString = "Name like '%?'";
		List<Country> list = countrylaDao.find(cString, "ang");
		for (Country country : list) {
			System.out.println(country);
			System.out.println();
		}
	}
	
}
