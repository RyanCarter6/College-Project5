package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu & Ryan Carter
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	/*
	 *  Creates a variable that holds the current instance
	 */
	private static GameService instance = null;
	
	/*
	 * Creates an empty private constructor
	 */
	private GameService() {}
	
	/*
	 * This singleton pattern ensures only one GameService object will be active, saving memory
	 * It's a public function, allowing this object to be created from anywhere
	 */
	public static GameService getInstance() {
		if(instance == null) {
			// Creates and displays new instance if none exist
			instance = new GameService();
			System.out.println("New instance created.");
		}
		else {
			// Displays that instance already exists
			System.out.println("Instance already exists.");
		}
		
		// Returns current instance
		return instance;
	}
	

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// A local game instance
		Game game = null;

		/*
		 * The iterator pattern creates an easy method to iterate through a list/array/ArrayList
		 * It does this wile hiding data structures, making it well secured
		 */
		
		// Creates new iterator
		Iterator<Game> newIterator = games.iterator();
						
		// Iterates through list
		while(newIterator.hasNext()) {
			// Sets game to current game in list
			Game currGame = newIterator.next();
							
			// Returns game if it already is in the list
			if(currGame.getName().equalsIgnoreCase(name)) {
				return game;
			}
		}

		// If not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// Return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// A local game instance
		Game game = null;
		
		/*
		 * The iterator pattern creates an easy method to iterate through a list/array/ArrayList
		 * It does this wile hiding data structures, making it well secured
		 */

		// Creates new iterator
		Iterator<Game> newIterator = games.iterator();
						
		// Iterates through list
		while(newIterator.hasNext()) {
			// Sets game to current game in list
			Game currGame = newIterator.next();
							
			// Sets game if id matches
			if(currGame.getId() == id) {
				game = currGame;
			}
		}
		
		// Returns the game
		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// A local game instance
		Game game = null;
		
		/*
		 * The iterator pattern creates an easy method to iterate through a list/array/ArrayList
		 * It does this wile hiding data structures, making it well secured
		 */

		// Creates new iterator
		Iterator<Game> newIterator = games.iterator();
				
		// Iterates through list
		while(newIterator.hasNext()) {
			// Sets game to current game in list
			Game currGame = newIterator.next();
					
			// Sets game if name matches
			if(currGame.getName().equalsIgnoreCase(name)) {
				game = currGame;
			}
		}

		// Returns the game
		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}