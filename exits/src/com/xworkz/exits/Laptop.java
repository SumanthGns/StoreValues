package com.xworkz.exits;

public interface Laptop {
	
	int TOTAL_VALUE=10;
	
	public  boolean brand(String name);
	
	default boolean isExist(String name) {
		return false;
	}
	

}
