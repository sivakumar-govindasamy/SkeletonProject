package com.test.testapp.dao.impl;

import com.test.testapp.dao.GreetingsDao;

public class GreetingsDaoImpl implements GreetingsDao {

	@Override
	public String getGreetingsMessage(final String name) {
		
		return "Hello " + name;
	}

}
