package store;
import receive.Country;
import receive.CountyImp;

public class CountryRunner {
	public static void main(String[] args) {
		Country c=new CountyImp();
		CountryServiceImp p=new CountryServiceImp(c);
		p.validation("India");
		p.validation("america");
		p.validation("canada");
		p.validation("canada");
		
		
	}

}
