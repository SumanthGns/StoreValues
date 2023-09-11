package associationMethod;

public class Player {
	Building building=new Building("gns");
	public String name;
	public int exp;
	HomeTown town=new HomeTown("krish");
	
	public Player(String name, int exp) {
		
		System.out.println("invoking main in player");
		this.name=name;
		this.exp=exp;
		
	}
	public void printinfo() {
		System.out.println("name of:" +this.name);
		System.out.println("exp:" +this.exp);
		building.printinfo();
		town.printinfo();
	}

}
