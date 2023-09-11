package com.xworkz.exits.app.runner;

import com.xworkz.exits.Laptop;
import com.xworkz.exits.LaptopImp;
import com.xworkz.exits.app.LaptopServiceImp;

public class LaptopRunner {
	public static void main(String[] args) {
		Laptop l=new LaptopImp();
		LaptopServiceImp l1=new LaptopServiceImp(l);
		l1.validation("lenova");
		l1.validation("acesslap");
		l1.validation("acesslap");
		
		
	}

}
