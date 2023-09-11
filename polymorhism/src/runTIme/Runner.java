package runTIme;

public class Runner {

	public static void main(String[] args) {
		
		Vehicle v1=new Car();
		v1.start();
		Vehicle v2=new Bike();
		v2.start();
		System.out.println("..............................");
		Vehicle veh;
		veh=new Car();
		veh.start();
		veh=new Bike();
		veh.start();
		
		
		

	}

}
