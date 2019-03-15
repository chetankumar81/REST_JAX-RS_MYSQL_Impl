package com.project.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.project.model.Party;
import com.project.model.Post;

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


	public ArrayList<Party> getAllParties() {
		ArrayList<Party> parties = new ArrayList<>();
		try {
			currentCon = new ClientSpecificDataConnectionManager().getConnection();
			String query = "select * from party";
			PreparedStatement pst = currentCon.prepareStatement(query);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Party party = getPartyById(rs.getInt(1));
				parties.add(party);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parties;
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


	public int loadAllPosts(ArrayList<Post> posts) {
		
		int count = 0;
		try {
			currentCon = new ClientSpecificDataConnectionManager().getConnection();
			String query = "Insert into post values (?,?,?,?)";
			PreparedStatement pst = currentCon.prepareStatement(query);
			for(Post p : posts) {
				pst.setLong(1,p.getId());
				pst.setLong(2, p.getUserId());
				pst.setString(3, p.getTitle());
				pst.setString(4, p.getBody());
				
				count += pst.executeUpdate();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}
