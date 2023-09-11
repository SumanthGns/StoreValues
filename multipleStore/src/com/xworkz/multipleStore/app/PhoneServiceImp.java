package com.xworkz.multipleStore.app;

import com.xworkz.multipleStore.Phone;

public class PhoneServiceImp implements PhoneService {

	private Phone phon;
	
	public PhoneServiceImp(Phone phon){
		this.phon=phon;
		
		
	}
	public boolean validation(long num) {
		if(num!=0) {
			System.out.println("it as cleared that");
			boolean temp=phon.isExist(num);
			if(temp==false) {
				phon.store(num);
				System.out.println("the value is stored inside the database");
				return true;
				
			}
			else {
				System.out.println("it cant not store numbers");
			}
		}
		else {
			System.out.println("it is not clear");
		}
		return false;
	}
	
}
