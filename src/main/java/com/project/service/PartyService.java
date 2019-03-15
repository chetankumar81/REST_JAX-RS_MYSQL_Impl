package com.project.service;

import java.util.ArrayList;

import com.project.model.Party;

public interface PartyService {
	public ArrayList<Party> getAllParties();
	
	public Party getPartyById(int id);

	public Party createParty(Party party);
}
