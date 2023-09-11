package com;

import agriculture.Farming;
import agriculture.Land;

public class MainRunner {

	public static void main(String[] args) {
		String name=new String("harshit");
		Farming f=new Farming(name);
		Land land=new Land();
		f.setLand(land);
		f.farming();
		
		
		
		
	
		

	}

}
