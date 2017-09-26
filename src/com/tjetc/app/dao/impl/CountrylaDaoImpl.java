package com.tjetc.app.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tjetc.app.dao.CountrylaDao;
import com.tjetc.app.entity.Country;

public class CountrylaDaoImpl implements CountrylaDao {

	@Override
	public List<Country> find(String cString, Object... params) {
		Session session = null;
		Query query = session.createQuery("from Countrylanguage where "+cString+params);
		for (int i = 0; i < params.length; i++) {
			query.setParameter(i, params[i]);
		}
		List<Country> list = (List<Country>) query.list();
		return list;
	}

	
	
}
