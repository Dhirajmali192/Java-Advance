package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;
import com.tka.utility.IPLUtility;

public class IPLDao {
	private Connection conn = null;
	private PreparedStatement pst=null;
	private ResultSet rs=null;
	
	private String query="SELECT * FROM PLAYER";
	
	List<Player> allplayers=null;

	public List<Player> getAllPlayers() {
		
		try {
			conn=IPLUtility.getConnection();
			
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

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		    IPLUtility.closeConnection(rs, pst, conn);
		}
		return allplayers;
	}
	
	//-----------insert operation ------------
	private String insert_query="INSERT INTO PLAYER VALUES(?,?,?,?,?,?,?)";
	
	public int addPlayer(Player p) {
		int ack=0;
		
		try {	
			conn=IPLUtility.getConnection();
			
			pst=conn.prepareStatement(insert_query);
			
			pst.setInt(1, p.getPlayerId());
			pst.setInt(2, p.getJersey_no());
			pst.setString(3, p.getName());
			pst.setString(4, p.getTeam());
			pst.setInt(5, p.getRuns());
			pst.setInt(6, p.getWickets());
			pst.setString(7, p.getRole());
			
			ack=pst.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
		    IPLUtility.closeConnection(rs, pst, conn);
		}
		
		return ack;
	}
	
	//-----------update operation ------------
	private String update_query ="UPDATE PLAYER SET jersey_no=?, name=?, team=?, runs=?, wickets=?, role=? WHERE playerId=?";

	public int updatePlayer(Player p) {
		int ack=0;
		try {	
			conn=IPLUtility.getConnection();

			pst=conn.prepareStatement(update_query);
			
			pst.setInt(1, p.getJersey_no());
			pst.setString(2, p.getName());
			pst.setString(3, p.getTeam());
			pst.setInt(4, p.getRuns());
			pst.setInt(5, p.getWickets());
			pst.setString(6, p.getRole());
			pst.setInt(7, p.getPlayerId());
			
			ack=pst.executeUpdate();
	
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
		    IPLUtility.closeConnection(rs, pst, conn);
		}
		
		return ack;
	}
	
	//-----------delete operation ------------
	private String delete_query ="DELETE FROM PLAYER WHERE playerId=?";

	public int deletePlayer(int id) {
		int ack=0;
		try {	
			conn=IPLUtility.getConnection();

			pst=conn.prepareStatement(delete_query);
			pst.setInt(1,id);
			
			ack=pst.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
		    IPLUtility.closeConnection(rs, pst, conn);
		}
		
		return ack;
	}
}
