package com.xworkz.exits;

public class LaptopImp implements Laptop{
	
	String[] lap=new String[TOTAL_VALUE];
	int position;
	
	public boolean brand(String name) {
		this.lap[position]=name;
		System.out.println(" laptop name " + name + "position " +this.position);
		position++;
		return true;
		
		
	}
	
	public boolean isExist(String name) {
		for(int i=0;i<=this.position;i++) {
			String temp=lap[i];
			if(temp!=null && temp.equals(name)) {
				System.out.println("it cant store brand");
				return true;
			}
		}
		return false;
			
	}
	

}
