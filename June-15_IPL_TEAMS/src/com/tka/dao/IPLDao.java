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
	
	private String path="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/batch1326_db";
	private String username="root";
	private String password="Dhiraj192695";
	
	private Connection conn=null;
	private PreparedStatement pst=null;
	private ResultSet rs=null;
	
	private String query="SELECT * FROM PLAYERS";
	
	List<Player> allplayers=null;

	public List<Player> getAllPlayers() {
		
		try {
			Class.forName(path);
			
			conn=DriverManager.getConnection(url,username,password);
			
			pst=conn.prepareStatement(query);
			
			rs=pst.executeQuery();
			
			allplayers=new ArrayList<>();
			
			while(rs.next()) {
				Player p = new Player();
				p.setPlayerId(rs.getInt(1));
				p.setJersey_no(rs.getInt(2));
				p.setName(rs.getString(3));
				p.setTeam(rs.getString(4));
				p.setRuns(rs.getInt(5));
				p.setWickets(rs.getInt(6));
				p.setRole(rs.getString(7));
				
				allplayers.add(p);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allplayers;
	}
	
	//-----------insert operation ------------
	
	private String insert_query="INSERT INTO PLAYERS VALUES(?,?,?,?,?,?,?)";

	public boolean addPlayer(Player p) {
		
		try {	
			conn=DriverManager.getConnection(url,username,password);

			pst=conn.prepareStatement(insert_query);
			pst.setInt(1, p.getPlayerId());
			pst.setInt(2, p.getJersey_no());
			pst.setString(3, p.getName());
			pst.setString(4, p.getTeam());
			pst.setInt(5, p.getRuns());
			pst.setInt(6, p.getWickets());
			pst.setString(7, p.getRole());
			
			int row=pst.executeUpdate();
			if(row>0) {
				return true;
			}
			
			pst.close();
			conn.close();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	//-----------update operation ------------
	
	private String update_query ="UPDATE PLAYERS SET jersey_no=?, name=?, team=?, runs=?, wickets=?, role=? WHERE playerId=?";

	public boolean updatePlayer(Player p) {
		
		try {	
			conn=DriverManager.getConnection(url,username,password);

			pst=conn.prepareStatement(update_query);
			pst.setInt(1, p.getJersey_no());
			pst.setString(2, p.getName());
			pst.setString(3, p.getTeam());
			pst.setInt(4, p.getRuns());
			pst.setInt(5, p.getWickets());
			pst.setString(6, p.getRole());
			pst.setInt(7, p.getPlayerId());
			
			int row=pst.executeUpdate();
			if(row>0) {
				return true;
			}
			
			pst.close();
			conn.close();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
//-----------delete operation ------------
	
	private String delete_query ="DELETE FROM PLAYERS WHERE playerId=?";

	public boolean deletePlayer(int id) {
		
		try {	
			conn=DriverManager.getConnection(url,username,password);

			pst=conn.prepareStatement(delete_query);
			pst.setInt(1,id);
			
			int row=pst.executeUpdate();
			if(row>0) {
				return true;
			}
			
			pst.close();
			conn.close();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
