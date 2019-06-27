package com.SDA.playersManager.dao;

import java.util.List;

import com.SDA.playersManager.domain.Player;

public interface IPlayerDao {
	
	public List<Player> getAllPlayers();
	
	public Player getPlayer(int id);
	
	public List<Player> getPlayersByName(String likeName);
	
	public void deletePlayer(int id);

}
