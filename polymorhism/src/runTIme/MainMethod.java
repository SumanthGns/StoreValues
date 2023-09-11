package runTIme;

public class MainMethod {
	
	 static void invoke(Employee sum) {
		sum.work();
		
		
	}
	public static void main(String[] args) {
		
		
		invoke(new Tester());
		invoke(new Developer());
		System.out.println("000000000000000000000000000000");
		
		Tester k=new Tester();
		invoke(k);
		Developer d=new Developer();
		invoke(d);
		
		
		
	}
	



}
