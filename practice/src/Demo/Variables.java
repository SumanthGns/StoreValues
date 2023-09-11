package Demo;

public class Variables {
	
	String name="tom";
	int id=5000;
	public static String player="jerry";
	
	public static  void a() {
		
		
		System.out.println("invoking main");
	}
	
	public static void main(String[] args) {
		Variables v=new Variables();
		v.a();
		System.out.println(v.name);
		System.out.println(v.id);
		System.out.println(player);
		Variables.a();
		
	}

}
