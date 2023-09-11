package gadgets;

public class MobileRunner {

	public static void main(String[] args) {
		String brand=new String("iphone");
		System.out.println(brand);
		Mobile m=new Mobile();
		m.setMobile(m);
		m.apps();
		m.screen();
		Charger c=new Charger();
		c.connect();
		c.electric();
		c.plug();
		c.wire();

	}

}
