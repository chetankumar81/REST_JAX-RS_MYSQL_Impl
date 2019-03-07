package com.project.dao;

import com.project.database.DatabaseAccess;
import com.project.model.Party;

public interface PartyDao {
	
	Party getPartyById(int id);
	
	Party createParty(Party party);
}
