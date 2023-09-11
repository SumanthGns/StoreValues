package runTIme;

public class ShopRunner {
	
	void foodie(Shop obj) {
		
		obj.taste();
	}
	public static void main(String[] args) {
		
		ShopRunner s=new ShopRunner();
		s.foodie(new DairyMilk());
		s.foodie(new Icecream());
		System.out.println("/////////////////////////////");
		
		Icecream c=new Icecream();
		s.foodie(c);
		DairyMilk o=new DairyMilk();
		s.foodie(o);
	}

}
