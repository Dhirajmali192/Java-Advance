package com.tka.service;

import com.tka.dao.IPLDao_2;
import com.tka.entity.Player;

public class IPLService_2 {
	
	Player  []allPlayer;
	IPLDao_2 ipldao=null;
	
	public Player[] getAllPlayer() {
		ipldao=new IPLDao_2();
		Player[] allPlayer=ipldao.getAllPlayer();
		
		return allPlayer;
	}
}
