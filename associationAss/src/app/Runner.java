package app;

public class Runner {

	public static void main(String[] args) {
		String name=new String("krish");
		Trainer t=new Trainer(name);
		System.out.println(name);
		Laptop l=new Laptop();
		t.setLaptop(l);
		t.work();
		

	}

}
