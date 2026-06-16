package com.tka.service;

import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {
	
	List<Player>allPlayer=null;
	IPLDao ipl_dao=null;
	
	public List<Player> getAllPlayer(){
		ipl_dao=new IPLDao();
		allPlayer=ipl_dao.getAllPlayers();
		return allPlayer;
	}
}
