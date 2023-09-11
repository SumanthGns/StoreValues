package app;

import com.MobileRepository;

public class MobileServiceImp implements MobileService {
	
	private MobileRepository mobile;
	
	public  MobileServiceImp(MobileRepository name) {
		this.mobile=mobile;
		
	}
	
	public void validation(String name) {
		mobile.name(name);
		
		
	}
	
	
	

}
