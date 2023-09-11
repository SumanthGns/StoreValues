package instanceOf;

public class Customer {

	public static void main(String[] args) {
		
		Hotel h=new Hotel();
		Food obj=h.orderFood(2);
		if(obj instanceof Idly) {
			System.out.println("order Idly");
			
		}
		else if (obj instanceof Dosa) {
			System.out.println("order Dosa");
		}
		else {
			System.out.println("order vada");
		}

   

	}

}
