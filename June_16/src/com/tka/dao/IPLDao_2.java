package com.tka.dao;

import com.tka.entity.Player;

public class IPLDao_2 {
	
	Player []ipl_db=new Player[44];
	
	public Player[] getAllPlayer() {
		
		ipl_db[0]  = new Player(18, "Virat Kohli",        "RCB", 675, 0,  "Batsman");
		ipl_db[1]  = new Player(37, "Devdutt Padikkal",   "RCB", 380, 0,  "Batsman");
		ipl_db[2]  = new Player(20, "Rajat Patidar",      "RCB", 510, 0,  "Batsman");     
		ipl_db[3]  = new Player(51, "Venkatesh Iyer",     "RCB", 370, 4,  "All-Rounder");
		ipl_db[4]  = new Player(11, "Krunal Pandya",      "RCB", 210, 7,  "All-Rounder");
		ipl_db[5]  = new Player(8,  "Tim David",          "RCB", 290, 0,  "Batsman");
		ipl_db[6]  = new Player(21, "Jitesh Sharma",      "RCB", 195, 0,  "WK-Batsman");   
		ipl_db[7]  = new Player(29, "Bhuvneshwar Kumar",  "RCB", 34,  28, "Bowler");
		ipl_db[8]  = new Player(45, "Josh Hazlewood",     "RCB", 12,  18, "Bowler");
		ipl_db[9]  = new Player(66, "Jacob Duffy",        "RCB", 5,   10, "Bowler");
		ipl_db[10] = new Player(14, "Rasikh Salam",       "RCB", 8,   19, "Bowler");

		ipl_db[11] = new Player(7,  "Shubman Gill",        "GT", 732, 0,  "Batsman");     
		ipl_db[12] = new Player(23, "Sai Sudharsan",       "GT", 722, 0,  "Batsman");
		ipl_db[13] = new Player(36, "Nishant Sindhu",      "GT", 185, 8,  "All-Rounder");
		ipl_db[14] = new Player(63, "Jos Buttler",         "GT", 526, 0,  "WK-Batsman");   
		ipl_db[15] = new Player(50, "Washington Sundar",   "GT", 220, 12, "All-Rounder");
		ipl_db[16] = new Player(55, "Jason Holder",        "GT", 160, 17, "All-Rounder");
		ipl_db[17] = new Player(19, "Rashid Khan",         "GT", 80,  21, "All-Rounder");
		ipl_db[18] = new Player(32, "Kulwant Khejroliya",  "GT", 10,  14, "Bowler");
		ipl_db[19] = new Player(25, "Kagiso Rabada",       "GT", 30,  29, "Bowler");
		ipl_db[20] = new Player(17, "Mohammed Siraj",      "GT", 12,  19, "Bowler");
		ipl_db[21] = new Player(28, "Prasidh Krishna",     "GT", 8,   16, "Bowler");

		ipl_db[22] = new Player(4,  "Abhishek Sharma",     "SRH", 508, 6,  "All-Rounder");
		ipl_db[23] = new Player(62, "Travis Head",         "SRH", 393, 0,  "Batsman");
		ipl_db[24] = new Player(23, "Ishan Kishan",        "SRH", 602, 0,  "WK-Batsman");  
		ipl_db[25] = new Player(42, "Heinrich Klaasen",    "SRH", 606, 0,  "WK-Batsman");  
		ipl_db[26] = new Player(26, "Smaran Ravichandran", "SRH", 210, 0,  "Batsman");
		ipl_db[27] = new Player(9,  "Nitish Kumar Reddy",  "SRH", 340, 8,  "All-Rounder");
		ipl_db[28] = new Player(30, "Pat Cummins",         "SRH", 120, 15, "All-Rounder"); 
		ipl_db[29] = new Player(44, "Shivang Kumar",       "SRH", 15,  12, "Bowler");
		ipl_db[30] = new Player(61, "Eshan Malinga",       "SRH", 10,  21, "Bowler");
		ipl_db[31] = new Player(48, "Sakib Hussain",       "SRH", 12,  14, "Bowler");
		ipl_db[32] = new Player(38, "Praful Hinge",        "SRH", 8,   11, "Bowler");

		ipl_db[33] = new Player(58, "Yashasvi Jaiswal",    "RR",  560, 0,  "Batsman");
		ipl_db[34] = new Player(99, "Vaibhav Sooryavanshi","RR",  776, 0,  "Batsman");
		ipl_db[35] = new Player(21, "Dhruv Jurel",         "RR",  420, 0,  "WK-Batsman");  
		ipl_db[36] = new Player(11, "Riyan Parag",         "RR",  380, 5,  "All-Rounder");
		ipl_db[37] = new Player(35, "Donovan Ferreira",    "RR",  220, 0,  "Batsman");
		ipl_db[38] = new Player(22, "Dasun Shanaka",       "RR",  180, 6,  "All-Rounder");
		ipl_db[39] = new Player(8,  "Ravindra Jadeja",     "RR",  175, 9,  "All-Rounder");
		ipl_db[40] = new Player(30, "Jofra Archer",        "RR",  35,  25, "Bowler");
		ipl_db[41] = new Player(16, "Nandre Burger",       "RR",  10,  13, "Bowler");
		ipl_db[42] = new Player(71, "Brijesh Sharma",      "RR",  8,   10, "Bowler");
		ipl_db[43] = new Player(34, "Yash Raj Punja",      "RR",  12,  14, "Bowler");
		
		return ipl_db;
	}
	
	
}
