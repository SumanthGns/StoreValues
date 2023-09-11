package instanceOf;

public class Cafe {
	
	Shop Machine(int choice){
		if(choice==1) {
			Coffee c=new Coffee();
			return c;
			
		}
		else if(choice==2) {
			Tea t=new Tea();
			return t;
			
		}
         else {
			
			return null;
		}
		
		
	}

}
