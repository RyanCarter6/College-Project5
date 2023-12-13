package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A simple class to hold information about a game
 * 
 * @author coce@snhu.edu & Ryan Carter
 */
public class Game extends Entity {

	/*
	 * Creates a list of teams
	 */
	private List<Team> teams = new ArrayList<Team>();
	
	/*
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name);
	}
	
	/*
	 * Adds a team to list of teams
	 */
	public Team addTeam(String name) {
		// A local team instance
		Team team = null;
						
		// Creates new iterator
		Iterator<Team> newIterator = teams.iterator();
										
		// Iterates through list
		while(newIterator.hasNext()) {
			// Sets team to current team in list
			Team currTeam = newIterator.next();
											
			// Returns team if it already is in the list
			if(currTeam.getName().equalsIgnoreCase(name)) {
				return team;
			}
		}

		// If not found, make a new team instance and add to list of teams
		if (team == null) {
			team = new Team(super.getId(), name);
			teams.add(team);
		}

		// Return the new/existing team instance to the caller
		return team;
	}

	@Override
	public String toString() {
		return "Game [id=" + super.getId() + ", name=" + super.getName() + "]";
	}

}
