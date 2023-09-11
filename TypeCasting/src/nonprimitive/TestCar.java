package nonprimitive;

public class TestCar {

	public static void main(String[] args) {
		// upcasting
		
		Vehicle v=new Car();
		System.out.println(v.cost);
		v.start();
		System.out.println("only superclass in upcasting");
		
		// downcasting 
		
		Car b= (Car) v;
		System.out.println(b.type);
		b.stop();
		System.out.println(b.cost);
		b.start();
		b.brand();
		System.out.println(b.cost);
		System.out.println("in downcasting both superclass and sub-class is allowed");

	}

}
