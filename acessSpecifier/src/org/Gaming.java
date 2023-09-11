package org;

public class Gaming {
	
	private  String type="appleGaming";
	
	private Gaming() {
		
		System.out.println("gaming is now safe");
	}
	
	private void GT() {
		
		System.out.println("GT is a private");
	}
	public static void main(String[] args) {
		
		 Gaming G= new Gaming();
		 System.out.println(G.type);
		 G.GT();

}
	 
	}


