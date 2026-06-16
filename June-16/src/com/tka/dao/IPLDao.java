package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {
	
	public List<Player>getAllPlayers(){
		
	List<Player> ipl_db = null;
		
	 ipl_db = new ArrayList<>();

//	 GT Team
	 ipl_db.add(new Player(1,"Shubman Gill",7,10000,0,"GT","Batsman (Captain)"));
	 ipl_db.add(new Player(2,"Sai Sudarshan",23,3000,50,"GT","Batsman"));
	 ipl_db.add(new Player(3,"Jos Buttler",63,12000,10,"GT","Batsman (Wicket-keeper"));
	 ipl_db.add(new Player(4,"Rashid Khan",19,2500,650,"GT","Bowler"));
	 ipl_db.add(new Player(5,"Rahul Tewatia",46,2000,100,"GT","All-Rounder"));
	 ipl_db.add(new Player(6,"Washington Sundar",73,1567,180,"GT","All-Rounder"));
	 ipl_db.add(new Player(7,"Mohammed Siraj",25,267,390,"GT","Fast-Bowler"));
	 ipl_db.add(new Player(8,"Kagiso Rabada",43,1238,679,"GT","Fast-Bowler"));
	 ipl_db.add(new Player(9,"Prasidh Krishna",5,475,145,"GT","Fast-Bowler"));
	 ipl_db.add(new Player(10,"Ishant Sharma",29,500,245,"GT","Spinner"));
	 ipl_db.add(new Player(11,"Shahrukh Khan",35,2345,34,"GT","Batsman"));
	 
//	 RCB Team
	 ipl_db.add(new Player(12,"Virat Kohli",18,27000,8,"RCB","Batsman"));
	 ipl_db.add(new Player(13,"Rajat Patidar",97,5646,3,"RCB","Batsman (Captain)"));
	 ipl_db.add(new Player(14,"Phil Salt",61,6788,46,"RCB","Batsman (wicket-Keeper"));
	 ipl_db.add(new Player(15,"Jitesh Sharma",99,3465,76,"RCB","Batsman (Wicket-Keeper"));
	 ipl_db.add(new Player(16,"Devdatt Padikkal",19,4221,35,"RCB","All-Rounder"));
	 ipl_db.add(new Player(17,"Krunal Pandya",24,4000,64,"RCB","Bowler"));
	 ipl_db.add(new Player(18,"Tim David",85,5000,245,"RCB","Spinner"));
	 ipl_db.add(new Player(19,"Romario Shepherd",54,2134,38,"RCB","Batsman"));
	 ipl_db.add(new Player(20,"Josh Hazlewood",38,2345,199,"RCB","All-Rounder"));
	 ipl_db.add(new Player(21,"Bhuvneshwar Kumar",15,1569,100,"RCB","Fast-Bowler"));
	 ipl_db.add(new Player(22,"Yash Dayal",133,56,45,"RCB","Spinner"));
	 
//	 SRH Team
	 ipl_db.add(new Player(23,"Pat Cummins",30,56,45,"RCB","(Captain) Fast-Bowling All-Rounder"));
	 ipl_db.add(new Player(24,"Travis Head",62,56,45,"RCB","Opening-Batsman"));
	 ipl_db.add(new Player(25,"Abhishek Sharma",4,56,45,"RCB","All-Rounder"));
	 ipl_db.add(new Player(26,"Heinrich Klaasen",45,56,45,"RCB","Wicket-Keeper"));
	 ipl_db.add(new Player(27,"Ishan Kishan",32,56,45,"RCB","Wicket-Keeper"));
	 ipl_db.add(new Player(28,"Nitish Kumar",8,56,45,"RCB","All-Rounder"));
	 ipl_db.add(new Player(29,"Kamindu Mendis",13,56,45,"RCB","Batsman"));
	 ipl_db.add(new Player(30,"Harshal Patel",36,56,45,"RCB","Fast-Bowler"));
	 ipl_db.add(new Player(31,"Mohammed Shami",11,56,45,"RCB","Fast-Bowler"));
	 ipl_db.add(new Player(32,"Rahul Chahar",28,56,45,"RCB","Leg-Spinner"));
	 ipl_db.add(new Player(33,"Adam Zampa",63,56,45,"RCB","Leg-Spinner"));
	 
//	 RR Team
	 ipl_db.add(new Player(34,"Sanju Samson",11,8343,45,"RR","(Captain) Wicket-keeper"));
	 ipl_db.add(new Player(35,"Yashasvi Jaiswal",64,5000,23,"RR","Opening-Batsman"));
	 ipl_db.add(new Player(36,"Riyan Parag",3,4432,64,"RR","All-Rounder"));
	 ipl_db.add(new Player(37,"Shimron Hetmyer",2,8000,54,"RR","(Middle-order) Batsman"));
	 ipl_db.add(new Player(38,"Dhruv Jurel",21,2335,76,"RR","(Wicket-Keeper) Batsman"));
	 ipl_db.add(new Player(39,"Nitish Rana",27,6123,30,"RR","Batsman"));
	 ipl_db.add(new Player(40,"Wanindu Hasaranga",49,3578,456,"RR","Spinner"));
	 ipl_db.add(new Player(41,"Jofra Archer",22,1254,450,"RR","Fast-Bowler"));
	 ipl_db.add(new Player(42,"Sandeep Sharma",66,545,259,"RR","Fast-Bolwer"));
	 ipl_db.add(new Player(43,"Mahesh Theekshana",61,178,413,"RR","Spinner"));
	 ipl_db.add(new Player(44,"Tushar Deshpande",6,57,100,"RR","Fast-Bowler"));
		
		return ipl_db;
	}

}
