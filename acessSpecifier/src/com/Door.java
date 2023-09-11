package com;

public class Door {
	
	private String name="wood";
	private int size=100;
	
	private Door() {
		
		System.out.println("details of the Door");
		
	}
	public  void Wood() {
		System.out.println("wood work");
		
		
		
	}
	public static void main(String[] args) {
		
		Door d=new Door();
		System.out.println(d.name);
		System.out.println(d.size);
		d.Wood();
	}

}
