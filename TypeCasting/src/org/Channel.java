package org;

public class Channel {
	
	Tv show(int choice){
		
		if(choice==1) {
			
			Gemini g=new Gemini();
			return g;
		}
		else if(choice==2) {
			Maa m=new Maa();
			return m;
			
		}
		else {
			
			return null;
		}
	}

}
