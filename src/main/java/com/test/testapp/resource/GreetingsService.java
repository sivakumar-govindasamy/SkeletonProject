package com.test.testapp.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.testapp.business.GreetingsManager;

@Path("greetings")
public class GreetingsService {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(GreetingsService.class);

	@Autowired
	private GreetingsManager greetingsManager;

	@GET
	public final Response getGreetings(@QueryParam("name") final String name) {

		Response response = Response.status(Status.OK.getStatusCode())
				.entity(greetingsManager.getGreetingsMessage(name)).build();
		return response;
	}
}