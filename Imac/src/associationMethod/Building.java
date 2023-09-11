package associationMethod;

public class Building {
	public String name;
	floor f=new floor("ppp",1);
	floor f1=new floor("sss",2);
	floor f2=new floor("vvv",3);
	floor f3=new floor("kkk",4);
	floor f4=new floor("yyy",5);
	floor f5=new floor("aaa",6);
	floor f6=new floor("zzz",7);
	floor[] flo= {f,f1,f2,f3,f4,f5,f6};
	lift l=new lift(2);
	lift l1=new lift(3);
	lift [] lif= {l,l1};
	
	public Building(String name) {
		
		System.out.println("Invoking main in Building");
		this.name=name;
		
	}
	public void printinfo() {
		System.out.println("name of the building:" +this.name);
		for(int index=0;index<flo.length;index++) {
			floor ref=flo[index];
			ref.printinfo();
			
			
		}
		for(int index=0;index<lif.length;index++) {
			lift ref2=lif[index];
			ref2.printinfo();
		
	}
	}
		
		
	
	
	

}
