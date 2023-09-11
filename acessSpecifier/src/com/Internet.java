package com;

public class Internet {
	
	protected int cost=45;
	protected String name="Google";
	
	protected Internet() {
		
		System.out.println("running main the internet");
		
	}
	public void Browse() {
		System.out.println("your browser is on correct site");
		
	}
	public static void main(String[] args) {
		Internet o=new Internet();
		
		System.out.println(o.cost);
		System.out.println(o.name);
		o.Browse();
	}

}
