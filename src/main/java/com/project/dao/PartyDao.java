package com.project.dao;

import java.util.ArrayList;

import com.project.database.DatabaseAccess;
import com.project.model.Party;

public interface PartyDao {
	
	Party getPartyById(int id);
	
	Party createParty(Party party);

	ArrayList<Party> getAllParties();
}
