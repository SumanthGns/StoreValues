package shop;

public class ShopRunner {

	public static void main(String[] args) {
		String brand=new String("ramraj");
		Pant p =new Pant(brand);
		System.out.println(brand);
		Zip z=new Zip();
		p.setZip(z);
		p.cloth();
		



	}

}
