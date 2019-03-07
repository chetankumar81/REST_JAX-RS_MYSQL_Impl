package com.project.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.model.Party;

public class DatabaseAccess {
	private Connection currentCon = null;

	public Party getPartyById(int id) {
		Party party = null;
		
		try {
			currentCon = new ClientSpecificDataConnectionManager().getConnection();
			String query = "select * from party where id = ?";
			PreparedStatement pst = currentCon.prepareStatement(query);
			pst.setInt(1, id);

			ResultSet rs = pst.executeQuery();
			while (rs.next())
			{
				party = new Party(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return party;
	}

	
	public Party createParty(Party party) {
		int maxId = getMaxId(party);
		party.setId(maxId+1);
		try {
			currentCon = new ClientSpecificDataConnectionManager().getConnection();
			String query = "insert into party values (?,?,?,?,?)";
			PreparedStatement pst = currentCon.prepareStatement(query);
			pst.setInt(1, party.getId());
			pst.setString(2, party.getName());
			pst.setString(3,party.getOrganizer());
			pst.setString(4, party.getDate());
			pst.setString(5, party.getPlace());
			
			int row = pst.executeUpdate();
			if(row != 0) {
				System.out.println("Party Successfully created into the database");
			}else {
				System.out.println("There is some error in the createParty function");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return party;
	}


	private int getMaxId(Party party) {
		int maxId = 0;
		try {
			currentCon = new ClientSpecificDataConnectionManager().getConnection();
			String query = "select max(Id) from party";
			PreparedStatement pst = currentCon.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				maxId = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maxId;
	}
}
