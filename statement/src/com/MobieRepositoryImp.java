package com;

public class MobieRepositoryImp implements MobileRepository {
	
	String[] p=new String[TOTAL_VALUE];
	int position;
	
	
	
	public void name(String name) {
		this.p[position]=name;
		System.out.println("mobile name " + name + " position " +this.position );
		position++;
		
		
	}

}
