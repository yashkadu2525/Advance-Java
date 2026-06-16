package com.tka.service;

import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {
	
	private List<Player> ipl_db = null;
	private IPLDao ipldao = null;
	
	public List<Player> getAllPlayers(){
		
		ipldao = new IPLDao();
		
		List<Player> ipl_db = ipldao.getAllPlayers();
		
		return ipl_db;
	}

}
