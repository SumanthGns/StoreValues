package associationMethod;

public class Corporater {
	public String name;
	Building b=new Building("taj");
	Building b1=new Building("foram");
	Building[] b3= {b,b1};
	
	public Corporater(String name) {
		
	System.out.println("invoking main in Corporater");
	this.name=name;
	
	}
	public void printinfo() {
		
		System.out.println("name is:" +this.name);
		for(int index1=0;index1<b3.length;index1++) {
			Building ref3=b3[index1++];
			ref3.printinfo();
			
			
		}
	}

}
