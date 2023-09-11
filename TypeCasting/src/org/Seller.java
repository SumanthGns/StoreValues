package org;

public class Seller {
	
	Amazon electronics(int choice){
		
		if(choice==1) {
			Laptop l=new Laptop();
			return l;
		}
		else if(choice==2) {
			Mobile m=new Mobile();
			return m;
		}
		else {
			return null;
		}
		
	}

}
