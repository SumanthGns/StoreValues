package suman;

public class Car {
	
	private int cost;
	private String name;
	
	public void setCost(int cost){
		System.out.println("the cost of the car:");
		
		this.cost=cost;
		
	}
	public void setName(String name){
		System.out.println("the name of the car:");
		this.name=name;
		
		
	}
	
	public int getCost(){
		return cost;
		
	}
	public String getName(){
		return name;
		
	}

}
