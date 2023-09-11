package com.xworkz.multipleStore.app.runner;

import com.xworkz.multipleStore.*;
import com.xworkz.multipleStore.app.PhoneServiceImp;

public class PhoneRunner {
	public static void main(String[] args) {
		
		Phone p=new PhoneImp();
		PhoneServiceImp p1=new PhoneServiceImp(p);
		p1.validation(9113971169l);
		p1.validation(565656565l);
		p1.validation(565656565l);
		
	}

}
