package app;

public class Groceryimp implements Grocery{
	
	String[] s= new String[TOTAL_VALUE];
	int position;
	
	public void brand(String name) {
		if(position<TOTAL_VALUE) {
			System.out.println("invoking the value");
		this.s[position]=name;
		System.out.println("iteam name "+  name + " position no " +  position);
		position++;
		}
		else {
			System.out.println("out of the storage");
		}
		
	}
	public static void main(String[] args) {
		Grocery g=new Groceryimp();
		g.brand("rice");
		g.brand("sugar");
		g.brand("sgidgviuegvi;egvri;uegri");
		g.brand("lifeboy");
		g.brand("lifeboy");
		g.brand("lifeboy1");
		g.brand("lifeboy2");
		g.brand("lifeboy3");
		g.brand("lifeboy4");
		g.brand("lifeboy5");
		g.brand("lol");
		
	}

}
