package Association;

public class ToothPaste {
	public String name;
	public String brand;
	Company com=new Company("bishma","kish","usa");
	Ingredent in=new Ingredent("milk",12,300);
	Ingredent in1=new Ingredent("sugar",13,400);
	Ingredent in2=new Ingredent("rice",40,800);
	Ingredent in3=new Ingredent("coffe",31,500);
	Ingredent in4=new Ingredent("powder",3,500);
	Ingredent[] ref1= {in,in1,in2,in3,in4};
	
	public ToothPaste(String name, String brand) {
		System.out.println("invoking main in the toothpaste");
		this.name=name;
		this.brand=brand;
		
	}
	public void printinfo() {
		System.out.println("name:" +this.name );
		System.out.println("brand:" +this.brand);
		for (int index=0;index<ref1.length;index++) {
			Ingredent ref=ref1[index];
			ref.printinfo();
			com.printinfo();
			
		}
	}
	
	

}
