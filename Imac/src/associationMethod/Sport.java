package associationMethod;

public class Sport {
	public String name;
	Player play=new Player("giri",20);
	Player play1=new Player("siri",15);
	Player play2=new Player("jiri",40);
	Player play3=new Player("app",20);
	Player play4=new Player("donald",15);
	Player [] player= {play,play1,play2,play3,play4,};
	
	public Sport(String name) {
		System.out.println("invoking the main in Sport");
		this.name=name;
		
		
	}
	public void printinfo() {
		System.out.println("name of the :"+this.name);
		for(int index4=0;index4<player.length;index4++) {
			Player ref5= player[index4];
			ref5.printinfo();
	
	}
	}
}
