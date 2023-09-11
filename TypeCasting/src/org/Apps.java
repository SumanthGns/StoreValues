package org;

public class Apps {
	
	Internet Message(int choice){
		if (choice==1) {
			Whatsapp w=new Whatsapp();
			return w;
			
		}
		else if (choice==2) {
			Instagram i=new Instagram();
			return i;
		}
		else {
			return null;
		}
		
	}

}
