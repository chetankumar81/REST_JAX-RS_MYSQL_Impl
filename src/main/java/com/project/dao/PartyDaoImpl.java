package com.project.dao;

import com.project.database.DatabaseAccess;
import com.project.model.Party;

public class PartyDaoImpl implements PartyDao {

	@Override
	public Party getPartyById(int id) {
		// TODO Auto-generated method stub
		Party party = new DatabaseAccess().getPartyById(id);
		//Party party = new Party(1,"man_holi","chetan","man_21-03-2019","man_home");
		System.out.println(party);
		return party;
	}

	@Override
	public Party createParty(Party party) {
		party = new DatabaseAccess().createParty(party);
		return party;
	}

}
