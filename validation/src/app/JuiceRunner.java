package app;

import com.JuiceRepository;
import com.JuiceRepositoryImp;

public class JuiceRunner {
	public static void main(String[] args) {
		
		
		JuiceRepository s=new JuiceRepositoryImp();
		JuiceService p=new JuiceServiceImp(s);
		p.validation ("ramakrishna");
		p.validation ("krish");
		
		
		
	}

}
