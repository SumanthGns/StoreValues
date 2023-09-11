package Chain;

public class MushroomRunner {

	public static void main(String[] args) {
		SmallMushroom P1=new SmallMushroom();
		System.out.println(P1.name);
		System.out.println(P1.price);
		System.out.println(P1.type);
		System.out.println(P1.poison);
		
		SmallMushroom P2=new SmallMushroom("krish",600,"long",true);
		System.out.println(P2.name);
		System.out.println(P2.price);
		System.out.println(P2.type);
		System.out.println(P2.poison);
		
		
		

	}

}
