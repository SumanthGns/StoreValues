package suman;

public class Bike {
	
	private int cost;
	
	public Bike(int cost) {
		
		if(cost>0) {
			
			System.out.println("you are eligible for purchase");
			this.cost=cost;
		}
		else {
			System.out.println("you are not eligible for purchase");
		}
	}
		public int getCost(){
			return cost;
		}
	public 	void setCost(int cost){
		if(cost>0) {
			this.cost=cost;
		
		}	
	}
}

