package com;

 class WaterCan {
	 int cost=20;
	 String name="plastic";
	 
	 WaterCan(){
		 
		 System.out.println("can details");
		 
	 }
	 void type() {
		 
		 System.out.println("can will be stronger");
		 
	 }
	 public static void main(String[] args) {
		WaterCan n=new WaterCan();
		System.out.println(n.cost);
		System.out.println(n.name);
		n.type();
	}
	

}
