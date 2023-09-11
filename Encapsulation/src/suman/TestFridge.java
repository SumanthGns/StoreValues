package suman;

public class TestFridge {

	public static void main(String[] args) {
		Fridge r=new Fridge();
		r.setCost(20000);
		System.out.println(r.getCost());
		r.setBrand("samsung");
		System.out.println(r.getBrand());
		r.setProduction("bestbefore");
		System.out.println(r.getProduction());
		r.setSize(200);
		System.out.println(r.getSize());
		r.setWeight(5600);
		System.out.println(r.getWeight());

	}

}
