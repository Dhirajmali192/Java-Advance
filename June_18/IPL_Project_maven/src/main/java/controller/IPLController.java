package controller;

import java.util.List;
import java.util.Scanner;

import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLController {

	public static void main(String[] args) {
		
		IPLService iplService = new IPLService();
		
		IPLController ipl=new IPLController();
		
		//-----------get all players-------------
//		List<Player> allplayers = iplService.getAllPlayers();
//		allplayers.forEach(p->System.out.println(p.getName()+"------->"+p.getRole()));
		
		//-----------get all specific team players-------------
//		List<Player> allplayers_team = iplService.getAllPlayers("RR");
//		allplayers_team.forEach(p->System.out.println(p.getName()));
		
		//-----------get all Batsman-------------
//		List<Player> allplayers_Batsman = iplService.get_Batsman("Batsman");
//		allplayers_Batsman.forEach(p->System.out.println(p.getName()));
		
		//-----------get all Bowlers-------------
//		List<Player> allplayers_Bowlers = iplService.get_Bowlers("Bowler");
//		allplayers_Bowlers.forEach(p->System.out.println(p.getName()));
		
		//-----------get All rounder-------------
//		List<Player> allplayers_All_rounder = iplService.get_All_rounder("All-Rounder");
//		allplayers_All_rounder.forEach(p->System.out.println(p.getName()));
		
		//-----------get all Wicketkeepers-------------
//		List<Player> allplayers_Wicketkeeper = iplService.get_Wicketkeeper("Wicket-Keeper");
//		allplayers_Wicketkeeper.forEach(p->System.out.println(p.getName()));
		
//		ipl.addPlayer();
//		ipl.updatePlayer();
//		ipl.deletePlayer();
		
	}
	
	public boolean check(int id) {
		List<Player> allPlayer=iplService.getAllPlayers();
		for(Player p : allPlayer) {
			if(p.getPlayerId()==id) {
				return false;
			}
		}
		return true;
	}
	
	IPLService iplService=new IPLService();
	public void addPlayer() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Player Id:");
	    int id = sc.nextInt();
	    if(!check(id)) {
	    	System.out.println("Player already exist");
	    	return;
	    }
	    System.out.println("Enter Jersey No:");
	    int jersey = sc.nextInt();
	    System.out.println("Enter Name:");
	    String name = sc.next();
	    System.out.println("Enter Team:");
	    String team = sc.next();
	    System.out.println("Enter Runs:");
	    int runs = sc.nextInt();
	    System.out.println("Enter Wickets:");
	    int wickets = sc.nextInt();
	    System.out.println("Enter Role:");
	    String role = sc.next();
	    
	    Player p = new Player(id, jersey, name, team, runs, wickets, role);
	    int status = iplService.addPlayer(p);

	    if(status>0)
	        System.out.println("Player Added Successfully");
	    else
	        System.out.println("Player Not Added");
	}
	
	public void updatePlayer() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Player Id to Update:");
	    int id = sc.nextInt();
	    if(check(id)) {
	    	System.out.println("player not found");
	    	return;
	    }
	    System.out.println("Enter New Jersey No:");
	    int jersey = sc.nextInt();
	    System.out.println("Enter New Name:");
	    String name = sc.next();
	    System.out.println("Enter New Team:");
	    String team = sc.next();
	    System.out.println("Enter New Runs:");
	    int runs = sc.nextInt();
	    System.out.println("Enter New Wickets:");
	    int wickets = sc.nextInt();
	    System.out.println("Enter New Role:");
	    String role = sc.next();
	    
	    Player p = new Player();
	    p.setPlayerId(id);
	    p.setJersey_no(jersey);
	    p.setName(name);
	    p.setTeam(team);
	    p.setRuns(runs);
	    p.setWickets(wickets);
	    p.setRole(role);

	    int status = iplService.updatePlayer(p);

	    if(status>0) {
	        System.out.println("Player Updated Successfully");
	    } else {
	        System.out.println("Player Not Found / Update Failed");
	    }
	}

	public void deletePlayer() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Player Id to delete:");
	    int id = sc.nextInt();
	    if(check(id)) {
	    	System.out.println("player not Found");
	    	return;
	    }

	    int status = iplService.deletePlayer(id);
	    if(status>0) {
	        System.out.println("Player deleted Successfully");
	    } else {
	        System.out.println("Player Not Found / delete Failed");
	    }
	}
}
