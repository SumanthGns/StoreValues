package com.xworkz.dtoclass;

import java.io.Serializable;

public class AadharDTO implements Serializable{
	
	String name;
	int no;
	int price;
	String location;
	
	public AadharDTO(){
		
	}
	public AadharDTO(String name,int no, int price, String location) {
		this.name=name;
		this.no=no;
		this.price=price;
		this.location=location;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		return "AadharDTO[name="+name+",no="+no+" ,price = "+price+" ,location="+location+"]";
		
	}

	
	

}
