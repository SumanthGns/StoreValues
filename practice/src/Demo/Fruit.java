package Demo;

public class Fruit {
	private int cost;
	
	public void setCost(int cost) {
		if(cost>0) {
			System.out.println("you can buy the fruit");
			
		}
		else {
			System.out.println("can't buy it");
		}
	}
	public int getCost() {
		return cost;
	}

}
