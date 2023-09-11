package suman;

public class Saree {
	
	private String type;
	private String location;
	
	public void setType(String type){
		System.out.println("type of the saree");
		this.type=type;
		
	}
	public void setlocation(String location){
		System.out.println("location of the production");
		this.location=location;
		
		
	}
	public String gettype(){
		
		return type;
	}
	
	public String getname(){
		
		return location;
	}
	
	

}
