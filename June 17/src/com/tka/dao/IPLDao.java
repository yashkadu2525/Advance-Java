package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {
	
	public List<Player>getAllPlayers(){
		
	List<Player> ipl_db = null;
	String Path = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/advjava_433_db";
	String username = "root";
	String password = "root";
	String query = "SELECT * FROM player";
		
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	 ipl_db = new ArrayList<>();
	
	        try {
				Class.forName(Path);
				
				conn = DriverManager.getConnection(url, username, password);
				
				ps = conn.prepareStatement(query);
				
				rs = ps.executeQuery();
				
				ipl_db = new ArrayList<Player>();
				
				while (rs.next()) {
					int id = rs.getInt(1);
				    String pname = rs.getString(2);
				    int jno = rs.getInt(3);
				    int runs = rs.getInt(4);
				    int wickets = rs.getInt(5);
				    String tname = rs.getString(6);
				    String role = rs.getString(7);
				    
				    Player obj = new Player(id,pname,jno,runs,wickets,tname,role);
				    ipl_db.add(obj);
				}
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	        
		return ipl_db;
	}

}
