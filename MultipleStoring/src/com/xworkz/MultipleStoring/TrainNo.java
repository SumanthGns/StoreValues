package com.xworkz.MultipleStoring;

public interface TrainNo {
	
	int TOTAL_VALUE=10;
	
	public void trainNo(int num);
	default boolean isExist(int num) {
		return true;
	}

}
