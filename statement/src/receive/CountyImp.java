package receive;

public class CountyImp implements Country {
	
	String[] coun=new String[TOTAL_VALUE];
	int position;
	
	public boolean name(String name) {
		this.coun[position]=name;
		System.out.println("Country name " + name + "position " +this.position);
		position++;
		return true;
	}
	public boolean isExist(String name) {
		for(int i=0;i<=this.position;i++) {
			String temp=coun[i];
			if(temp!=null && temp.equals(name)) {
				System.out.println("it cant not store");
				return true;
			}//false,save agbardu
			
			
		}
		return false;//save agbeku
	}

}
