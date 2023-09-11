package app;

public class Mobileimp implements Mobile {
	
	int[] m=new int[TOTAL_VALUE];
	int position;
	
	public void type(int cost) {
		if (position<TOTAL_VALUE) {
		this.m[position]=cost;
		System.out.println(" mobile cost  " +  cost  +"  position  " +position);
		position++;
		
	}
		else {
			System.out.println("Storage is out of expected range");
		}
	}
	
	
	public static void main(String[] args) {
		 Mobile m=new Mobileimp();
		 m.type(12000);
		 m.type(13000);
		 m.type(56000);
		 m.type(12000);
		 m.type(56000);
		 m.type(89999);
		 m.type(8555);
		 m.type(654);
		 m.type(12000);
		 m.type(2222);
		 m.type(120);
		 
		 
		 
		 
	}
	

	
}
