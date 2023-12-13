package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A simple class to hold information about a team
 *
 * @author coce@snhu.edu & Ryan Carter
 */
public class Team extends Entity {

	/*
	 * Creates a list of players
	 */
	private List<Player> players = new ArrayList<Player>();
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);
	}

	/*
	 * Adds a player to list of players
	 */
	public Player addPlayer(String name) {
		// A local player instance
		Player player = null;
				
		// Creates new iterator
		Iterator<Player> newIterator = players.iterator();
								
		// Iterates through list
		while(newIterator.hasNext()) {
			// Sets player to current player in list
			Player currPlayer = newIterator.next();
									
			// Returns player if it already is in the list
			if(currPlayer.getName().equalsIgnoreCase(name)) {
				return player;
			}
		}

		// If not found, make a new player instance and add to list of players
		if (player == null) {
			player = new Player(super.getId(), name);
			players.add(player);
		}

		// Return the new/existing player instance to the caller
		return player;
	}
	
	@Override
	public String toString() {
		return "Team [id=" + super.getId() + ", name=" + super.getName() + "]";
	}
}
