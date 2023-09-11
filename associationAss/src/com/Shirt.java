package com;

public class Shirt {
	
	private String brand;
	Button button;
	
	public Shirt(String brand) {
		System.out.println("running main in brand");
		this.brand=brand;
	}
	public void setButton(Button button) {
		System.out.println("invoking in button");
	}
	public void location() {
		System.out.println("location in bangalore");
	}
	

}
