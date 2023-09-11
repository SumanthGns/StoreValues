package com;

public class MainClass {

	public static void main(String[] args) {
		String brand=new String("jocky");
		Shirt s=new Shirt(brand);
		System.out.println(brand);
		Button b=new Button();
		b.color();
		s.setButton(b);
		
		
		

	}

}
