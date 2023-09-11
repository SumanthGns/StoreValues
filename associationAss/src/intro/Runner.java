package intro;

public class Runner {
	public static void main(String[] args) {
		int number=4545;
		Bus b=new Bus(number);
		System.out.println(number);
		Passenger p=new Passenger();
		b.setBus(b);
		b.wheels();
		p.ticket();
	}

}
