package com.tka.controller;

import com.tka.entity.Player;
import com.tka.service.IPLService_2;

public class IPLContoller_2 {

	public static void main(String[] args) {
		IPLService_2 iplservice=new IPLService_2();
	
		Player[] allPlayer=iplservice.getAllPlayer();

		for(int i=0;i<allPlayer.length;i++) {
			System.out.println(allPlayer[i].getName());
		}
	}

}
