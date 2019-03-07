package com.project.service;

import com.project.model.Party;

public interface PartyService {
	public String getAllParties();
	
	public Party getPartyById(int id);

	public Party createParty(Party party);
}
