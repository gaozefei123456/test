package com.tjetc.app.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tjetc.app.dao.CityDao;
import com.tjetc.app.entity.City;
import com.tjetc.app.util.HibernateUtil;

public class CityDaoImpl implements CityDao{

	@Override
	public City findAllById(Integer id) {
		Session session = HibernateUtil.openSession();
		City city = (City) session.get(City.class,id);
		return city;
	}
	
}
