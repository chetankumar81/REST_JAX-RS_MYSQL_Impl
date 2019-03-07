package com.project.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.project.model.Party;
import com.project.service.PartyService;
import com.project.service.PartyServiceImpl;

@Path("/parties")
public class PartyResource {
	PartyService partyService = new PartyServiceImpl();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getParties() {
		return partyService.getAllParties();
	}
	
	@GET
	@Path("/{partyId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Party getPartyById(@PathParam("partyId") int id) {
		return partyService.getPartyById(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Party CreateParty(Party party) {
		return partyService.createParty(party);
	}
	
	
}
