package primitiveCasting;

public class Demo {

	public static void main(String[] args) {
		System.out.println("example on widening");
		
		int a=100;
		float b= a;
		
		System.out.println(a+" "+b);
		
		char c='b';
		int d=c;
		System.out.println(c+" "+d);
		
		byte f= 10;
		double k=f;
		System.out.println(f+" "+k);
		//byte--short--int---long---float--double
		
		System.out.println("example on narrowing");//double--float---long--int---short--byte
		
		double s=120.45;
		int p=  (int)s;
		System.out.println(s+" "+p);
		
		int q=65;
		char r=(char)'a';
		System.out.println(q+" "+r);
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		System.out.println("A"+"B");//String concatenation;
		System.out.println("A"+20);
		System.out.println('a'+'b');
		System.out.println('a'+20);
		System.out.println("A"+'a');//String concatenation;
		
		
		
		
		
		
	
		

	}

}
