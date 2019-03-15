package com.project.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/details")
public class Details {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getDetails() {
		return "Returning";
	}
}
