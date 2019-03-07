package com.project.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClientSpecificDataConnectionManager {
	Connection con;
	static String url;
	//static Logger log = Logger.getLogger("ClientSpecificDataConnectionManager");
	
	public  Connection getConnection() throws SQLException
	   {
	      try
	      {
	    	  Class.forName("com.mysql.jdbc.Driver");
			 try
	         {      System.out.println("Trying to connect");   
				 	con = DriverManager.getConnection("jdbc:mysql://localhost:" + "3306" + "/" + "party" + "?autoReconnect=false", "root", "chetan");
				 	//con = DriverManager.getConnection("jdbc:mysql://aabwwql6xfosxg.crq9novqnquk.ap-southeast-1.rds.amazonaws.com:3306/pinnacledb"+"?user=citrya1234&password=citrya1234");
				 	System.out.println("Connection successful");
	         }	
	         
	         catch (SQLException ex)
	         {
	            //log.debug("SQLException",ex.getCause());
	        	System.out.println("SQLException"+ex.getCause());
	            throw ex;
	         }
	      }

	      catch(ClassNotFoundException e)
	      {
	    	    //log.debug("ClassNotFoundException",e.getCause());
	    	  System.out.println("ClassNotFoundException"+e.getCause());
	      }

	   return con;
	}
}
