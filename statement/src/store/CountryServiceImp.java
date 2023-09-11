package store;

import receive.Country;

public class CountryServiceImp implements CountryService {
	
	private Country con;
	
	public CountryServiceImp(Country con) {
		this.con=con;
	}
	public boolean validation(String name) {
		if(name!=null && !name.isEmpty()&& name.length()>5 && name.length()<=10) {
			boolean exit=con.isExist(name);//false
			if (!exit) {// not equal to true
				con.name(name);
				System.out.println("valid to work");
				return true;
			}
			else {
				System.out.println("it is same");
			}
			
		}
		
		return true;
	}
	
	

}
