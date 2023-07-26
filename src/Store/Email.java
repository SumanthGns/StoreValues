package Store;

public class Email {

	public static void main(String[] args) {
		System.out.println("invoking main in Emails");
		
		String[] mails= {"gnsumanth11@gmail.com","sumanthgn.xworkz@gmail.com","priya333@gmail.com","megharaj420@gmail.com","ramkrishna22@gmail.com"};
		for (int j = 0; j < mails.length; j++) {
			
			System.out.println(mails [j]);
				
		}
		IplIteams teams = new IplIteams();
		System.out.println(teams);

	}

}
