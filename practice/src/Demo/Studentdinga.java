package Demo;

public class Studentdinga {
	
	private int age;
	
	public void setAge(int age) {
		
		if(age>0) {
			
			System.out.println("age is intialized");
			this.age=age;
		}
		else {
			System.out.println("age is not valid ");
		}
		
		}
	public int getAge() {
		
		return age;
	}
	
		
		}



