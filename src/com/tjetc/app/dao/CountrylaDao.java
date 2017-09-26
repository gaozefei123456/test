package com.tjetc.app.dao;

import java.util.List;

import com.tjetc.app.entity.Country;

public interface CountrylaDao {
	public List<Country> find(String cString , Object...params);
}
