package com.tka.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {
	
	private IPLDao iplrepo;
	private List<Player> allplayers;

	//----------All Players------------
	public List<Player> getAllPlayers() {
		iplrepo=new IPLDao();
		allplayers=iplrepo.getAllPlayers();
		
		return allplayers;
	}

	//----------specific team players------------
	public List<Player> getAllPlayers(String team) {
		List<Player> allplayers_team=new ArrayList<>();

		allplayers=this.getAllPlayers();
		for(Player p : allplayers) {
			if(p.getTeam().equals(team)) {
				allplayers_team.add(p);
			}
		}
		return allplayers_team;
	}
	
	//----------Batsman------------
	public List<Player> get_Batsman(String Batsman) {
		List<Player> allplayers_batmans=new ArrayList<>();
		allplayers=this.getAllPlayers();
		for(Player p : allplayers) {
			if(p.getRole().equals(Batsman)) {
				allplayers_batmans.add(p);
			}
		}
		return allplayers_batmans;
	}
	
	//----------Bowlers------------
	public List<Player> get_Bowlers(String Bowlers) {
		List<Player> allplayers_Bowlers=new ArrayList<>();
		allplayers=this.getAllPlayers();
		for(Player p : allplayers) {
			if(p.getRole().equals(Bowlers)) {
				allplayers_Bowlers.add(p);
			}
		}
		return allplayers_Bowlers;
	}
	
	//----------All Rounder------------
	public List<Player> get_All_rounder(String All_rounder) {
		List<Player> allplayers_All_rounder=new ArrayList<>();
		allplayers=this.getAllPlayers();
		for(Player p : allplayers) {
			if(p.getRole().equals(All_rounder)) {
				allplayers_All_rounder.add(p);
			}
		}
		return allplayers_All_rounder;
	}
	
	//----------WicketKeeper------------
	public List<Player> get_Wicketkeeper(String Wicketkeeper) {
		List<Player> allplayers_Wicketkeeper=new ArrayList<>();
		allplayers=this.getAllPlayers();
		for(Player p : allplayers) {
			if(p.getRole().equals(Wicketkeeper)) {
				allplayers_Wicketkeeper.add(p);
			}
		}
		return allplayers_Wicketkeeper;
	}
	
	//----------insert------------
	public boolean addPlayer(Player p) {
		iplrepo=new IPLDao();
		return iplrepo.addPlayer(p);
	}
	
	//----------update------------
	public boolean updatePlayer(Player p) {
		iplrepo=new IPLDao();
		return iplrepo.updatePlayer(p);
	}
	
	//----------delete------------
	public boolean deletePlayer(int id) {
		iplrepo=new IPLDao();
		return iplrepo.deletePlayer(id);
	}
}
