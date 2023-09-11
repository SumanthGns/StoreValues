package primitiveCasting;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the elements to be inserted");
		int size=scan.nextInt();
		int[]a=new int[size];
		System.out.println("enter" +size+ "elements");
		
		for(int i=0;i<a.length;i++) {
			
			a[i]=scan.nextInt();
			System.out.println(a[i]);
			
			
			
			
			
		}
		System.out.println("enter the element to find the no. of occarencess");
		int element=scan.nextInt();
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(element==a[i]) {
				
				count++;
			}
			System.out.println("no of occarences"   +element+ "is" +count);
			
			
		}
		
		



	}

}
