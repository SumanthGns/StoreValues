package shop;

public class Pant {
	private String brand;
	Zip zip;
	
	public Pant(String brand) {
		System.out.println("invoking main in the pant");
		this.brand=brand;
		
	}
	public void setZip(Zip zip) {
		System.out.println("Running main in the zip");
		this.zip=zip;
	}
	public void cloth() {
		System.out.println("cloth is silk");
	}

}
