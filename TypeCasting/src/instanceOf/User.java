package instanceOf;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Cafe c=new Cafe();
		Scanner s=new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("1:Coffee\n 2:Tea");
		int choice=s.nextInt();
		Shop obj=c.Machine(choice);
		if(obj instanceof Coffee) {
			
			System.out.println("drinking coffee");
		}
		else if(obj instanceof Tea) {
			System.out.println("drinking Tea");
		}
		else {
			System.out.println("invalid");
		}

	}

}
