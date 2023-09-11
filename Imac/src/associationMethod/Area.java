package associationMethod;

public class Area {
	public String name;
	public Corporater corporater=new Corporater("megha");
	
	public Area(String name) {
		System.out.println("invoking main in the area");
		this.name=name;
		
	}
	public void printinfo() {
		
		System.out.println("name of the area:"+this.name);
		
		corporater.printinfo();
	}

}
