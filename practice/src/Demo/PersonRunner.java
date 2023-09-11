package Demo;

public class PersonRunner {

	public static void main(String[] args) {
		//encapsulation:binding or wrapping or grouping variables and methods called encapsulation
		Person p=new Person();
		//class should be public non abstract
		//datamembers should have public getter and setter methods....
		
		System.out.println("persons age");
		p.Setage(20);
		p.getAge();
		System.out.println("age:"+p.getAge());
		
		
		



	}

}
