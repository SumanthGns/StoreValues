package Demo;

public class CarRunner {

	public static void main(String[] args) {
		Car c=new Car();
		c.setbrand("audi");
		c.setcost(600000);
		System.out.println("cost of car:"+c.getcost());
		System.out.println("brand of the car:"+c.getbrand());

	}

}
