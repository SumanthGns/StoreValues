package associationMethod;

public class HomeTown {
	public String name;
	public int pincode;
	Area d=new Area("HSR");
	Area d1=new Area("kkr");
	Area d2=new Area("hhh");
	Area d3=new Area("ooo");
	Area d4=new Area("lll");
	Area[] are= {d,d1,d2,d3,d4,};
	
	public HomeTown(String name) {
		System.out.println("name of the town");
		this.name=name;
		
	}
	public void printinfo() {
		
		System.out.println("name of the town"+this.name);
		for(int index2=0;index2<are.length;index2++) {
			Area ref4=are[index2];
			ref4.printinfo();
		}
		
	}

}
