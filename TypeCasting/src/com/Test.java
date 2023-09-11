package com;

public class Test {

	public static void main(String[] args) {
		
		
		Father f=new Daughter();
		
		if(f instanceof Son) {
			
			System.out.println("downcasting");
			Son s=(Son)f;
			System.out.println(s.name+" " +s.age);
		}
		else if(f instanceof Daughter) {
			
			System.out.println("downcasting");
			Daughter d=(Daughter)f;
			System.out.println(d.name+" " +d.age);
		}
		
		
		}

}
