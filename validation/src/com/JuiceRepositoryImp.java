package com;

public class JuiceRepositoryImp implements JuiceRepository{
	
	String[] c=new String[TOTAL_ITEM];
	int position;
	
	
	public void store(String name) {
		this.c[position]=name;
		System.out.println(" item name " +  name  + " position  " + this.position);
		position++;
		
		
		
		
	}

}
