package com.browser;

public class Printinfo {
	
	public  void SP(Browser browser) {
		
		System.out.println("invoking main in Printinfo");
		Browser pp=new OpenBrowser();
		System.out.println("name of the bro=" +pp.name);
		pp.Search();
		OpenBrowser open=(OpenBrowser)pp;
		System.out.println("server=" +open.ser);
		open.open();
		
		
		
	}
	
	

}
