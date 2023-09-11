package router;

public class WifiRunner {

	public static void main(String[] args) {
		WifiRouter sp=new WifiRouter();
		System.out.println(sp.name);
		System.out.println(sp.range);
		System.out.println(sp.type);
		System.out.println(sp.price);
		System.out.println(sp.speed);
		WifiRouter sp1=new WifiRouter("krish",2000,"airtel");
		System.out.println(sp1.name);
		System.out.println(sp1.range);
		System.out.println(sp1.type);
		System.out.println(sp1.price);
		System.out.println(sp1.speed);
		
		

	}

}
