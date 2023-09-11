package nonprimitive;

public class TestGadgets {

	public static void main(String[] args) {
		//upcasting
		Laptop l=new Mobile();
		System.out.println(l.brand);
		System.out.println(l.cost);
		l.working();
		// downcasting
		
		Mobile m= (Mobile)l;
		System.out.println(m.brand);
		System.out.println(m.cost);
		m.work();
		

	}

}
