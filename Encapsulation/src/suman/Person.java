package suman;

public class Person {
	
	private int age;
	
	public void setAge(int age){
		if (age>0) {
			
			System.out.println("the person is comfortable");
		}
		else {
			System.out.println("the person is not comfortable");
		}
		
		this.age=age;
		
		
	}
	
	public int getAge(){
		return this.age;
		
		
	}

}
