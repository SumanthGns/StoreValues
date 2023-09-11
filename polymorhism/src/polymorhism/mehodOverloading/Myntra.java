package polymorhism.mehodOverloading;

public class Myntra {
	
	void purchase(int id){
		System.out.println(id);
		
	}
	void purchase(String productName){
		System.out.println(productName);
		
	}
	void purchase(int cost,String location){
		System.out.println(cost+" "+location);
		
	}
	void purchase(String location,int cost){
		System.out.println(location+" "+cost);
		
		
	}

}
