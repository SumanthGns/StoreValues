package Association;

public class Company {
	public String name;
	public String ceo;
	public String originCountry;
	
	public Company(String name, String ceo,String originCountry) {
		
		System.out.println("invoking main in Company");
		this.name=name;
		this.ceo =ceo;
		this.originCountry=originCountry;
		
	}
	public void printinfo() {
		System.out.println("name of the Company:" +this.name );
		System.out.println("ceo of the company:" +this.ceo);
		System.out.println("originCountry:" +this.originCountry);
	}

}
