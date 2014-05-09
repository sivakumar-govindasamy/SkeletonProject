package com.test.testapp.business.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.testapp.business.GreetingsManager;
import com.test.testapp.dao.GreetingsDao;

public class GreetingsManagerImpl implements GreetingsManager {

	@Autowired
	GreetingsDao greetingsDao;
	
	@Override
	public String getGreetingsMessage(final String name) {
		
		return greetingsDao.getGreetingsMessage(name);
	}

}
