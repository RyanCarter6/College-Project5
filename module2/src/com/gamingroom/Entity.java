package com.gamingroom;

/**
 * A simple class to hold information about an entity
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a player is
 * created.
 * </p>
 * 
 * @author Ryan Carter
 */
public class Entity {

	/*
	 * Declares variables
	 */
	private long id;
	private String name;
	
	/*
	 * Creates an empty private constructor to prevent creating empty instances
	 */
	private Entity() {}
	
	/*
	 * Constructor that sets id and name
	 */
	public Entity(long id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	
	/*
	 * Returns id
	 */
	public long getId() {
		return id;
	}
	
	/*
	 * Returns name
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * Returns id and name as a string
	 */
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
	
}
