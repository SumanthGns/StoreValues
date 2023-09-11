package com.xworkz.storing.app;

import com.xworkz.storing.Pincode;

public class PincodeServiceImp implements PincodeService {
	
	private Pincode pin;
	
	public  PincodeServiceImp(Pincode pin) {
		this.pin=pin;
		
	}
	
	public boolean validation(int num) {
		if(num!=0) {
			System.out.println("valid num");
			boolean temp=pin.isExits(num);
			if(temp==false) {
				pin.code(num);
				System.out.println("the value is stored inside the data base");
				return true;
			}
			else {
				System.out.println("cant be stored");
				
			}
			
			
		}
		else {
			System.out.println(" not cleared");
		}
		return false;
}
	

}
