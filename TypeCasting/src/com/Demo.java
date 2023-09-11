package com;

public class Demo {

	public static void main(String[] args) {
		
		Vehicle v=new Bike();
		if(v instanceof Car) {
			System.out.println("downcasting");
			Car c=(Car)v;
			System.out.println(c.cost+ " " +c.type);
			
			
		}
		else if(v instanceof Bike) {
			
			System.out.println("Downcasting");
			Bike b=(Bike)v;
			System.out.println(b.brand+ " " +b.type);
			
		}

	}

}
