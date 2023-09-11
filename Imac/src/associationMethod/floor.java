package associationMethod;

public class floor {
	public String name;
	public int no;
	
	public floor(String name, int no) {
		
		System.out.println("Invoking the floor");
		this.name=name;
		this.no=no;
		
	}
	public void printinfo() {
		
		System.out.println("floor name:" +this.name);
		System.out.println("number of floor:"+this.no);
	}

}
