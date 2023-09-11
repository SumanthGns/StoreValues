package Demo;

public class Mobile {
	int cost=5000;
	static String name="iphone";
	
	public static void feature() {
		System.out.println("out of order");
		
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		System.out.println(m.cost);
		System.out.println(Mobile.name);
		Mobile.feature();
		m.feature();

		
	}

}
