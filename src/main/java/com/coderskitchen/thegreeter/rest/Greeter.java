package com.coderskitchen.thegreeter.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/greet")
public class Greeter {
	@GET
	@Path("{name}")
	public String greetSomeone(@PathParam("name") String name) {
		return "Hi! "+ name;
	}
}
