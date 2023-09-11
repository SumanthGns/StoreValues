package com;

public class Dress {
	protected String name="cotton";
	protected int cost=300;
	
	protected Dress() {
		
		System.out.println("invoking main in the dress");
		 
	}
    protected void materail() {
		
		System.out.println("invoking main in the materail");
	}

}
