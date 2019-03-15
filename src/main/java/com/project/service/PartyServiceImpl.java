package com.project.service;

import java.util.ArrayList;

import com.project.dao.PartyDao;
import com.project.dao.PartyDaoImpl;
import com.project.model.Party;

public class PartyServiceImpl implements PartyService {

	PartyDao partyDao = new PartyDaoImpl();
	
	@Override
	public ArrayList<Party> getAllParties() {
		// TODO Auto-generated method stub
		return partyDao.getAllParties();
	}
	
	public Party getPartyById(int id) {
		
		Party party = partyDao.getPartyById(id);
		return party;
	}

	@Override
	public Party createParty(Party party) {
		return partyDao.createParty(party);
	}
}
