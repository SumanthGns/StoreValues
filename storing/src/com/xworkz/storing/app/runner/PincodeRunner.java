package com.xworkz.storing.app.runner;

import com.xworkz.storing.*;
import com.xworkz.storing.app.PincodeServiceImp;

public class PincodeRunner {
	public static void main(String[] args) {
		Pincode p=new PincodeImp ();
		PincodeServiceImp p1=new PincodeServiceImp(p);
		p1.validation(252525);
		p1.validation(25245);
		p1.validation(252525);
		
	}

}
