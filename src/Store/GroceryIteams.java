package Store;

public class GroceryIteams {

	public static void main(String[] args) {
		String gro1="milk";
		String gro2="salt";
		String gro3="rice";
		String gro4="DryFruit";
		String gro5="sugar";
		String [] iteam= {gro1,gro2,gro3,gro4,gro5};
		
		for(int i=0;i<=5;i++) {
			
			String ref1=iteam[i];
			System.out.println(ref1);
		}

	}

}
