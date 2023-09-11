package com.xworkz.multipleStore;

public interface Phone {
	
	int TOTAL_VALUE=10;
	public void store(long num);
	default boolean isExist(long num) {
		return false;
	}

}
