package com.xworkz.storing;

public interface Pincode {
	int TOTAL_VALUE=10;
	public boolean code(int num);
	default boolean isExits(int num) {
		return false;
		
	}

}
