package nonprimitive;

public class Test {

	public static void main(String[] args) {
		
		//upcasting
		Father f=new Son();
		System.out.println(f.age);
		System.out.println(f.name);
		System.out.println("In upcasting i am able to call only superclass");
 //downcasting
		
		Son s=  (Son) f;
		System.out.println(s.height);
		System.out.println(s.location);
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println("by creating downcasting we can call both superclass and subclass");
	}

}
