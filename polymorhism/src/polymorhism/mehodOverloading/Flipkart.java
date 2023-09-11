package polymorhism.mehodOverloading;

public class Flipkart {
	
	void online(String productName) {
		
		System.out.println(productName);
		
	}
	void online(String productName,int cost) {
		
		System.out.println(productName+" " +cost);
	}
	void online(double size) {
		
		System.out.println(size);
	}

}
