package absrtuct;

public class Myntra {
	
	void  purchase(String productName){
		System.out.println(productName);
		
		
	}
	void  purchase(int productId) {
		System.out.println(productId);
	}
	 void purchse(int productId,int cost) {
		 System.out.println(productId+" "+cost);
		
	}
	 public static void main(String[] args) {
		Myntra m=new Myntra();
		m.purchase(200);
		m.purchase("shioe");
		m.purchse(200, 200);
		
	}

}
