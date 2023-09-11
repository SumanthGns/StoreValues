package com.xworkz.exits.app;

import com.xworkz.exits.Laptop;

public class LaptopServiceImp implements LaptopService{
	
	private Laptop lapo;
	
	public  LaptopServiceImp(Laptop lapo) {
		this.lapo=lapo;
		
	}
	
	public boolean validation(String brand) {
		if(brand!=null && !brand.isEmpty()&& brand.length()>3 && brand.length()<=10) {
			boolean exit=lapo.isExist(brand);
			if(!exit) {
				lapo.brand(brand);
				System.out.println("valid to work");
				return true;
			}
			else {
				System.out.println("it is same");
			}
			
		}
		else {
			System.out.println("not an valid name");
		}
		return true;
	}
	
	
	
	

}
