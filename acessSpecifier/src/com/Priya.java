package com;

public class Priya {
	
	public int age=24;
	public String name ="anothernameSuman";
	public String village="Bijapur";
	public String Brother="manoj";
	
	public Priya() {
		System.out.println("Details of the following");
		
	}
	public void HardWork() {
		System.out.println("she is hardworker");
	}
	public static void main(String[] args) {
		
		Priya suman=new Priya();
		System.out.println(suman.age);
		System.out.println(suman.name);
		System.out.println(suman.village);
		System.out.println(suman.Brother);
		suman.HardWork();
	}
}
