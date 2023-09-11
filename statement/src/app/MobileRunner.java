package app;
import com.MobieRepositoryImp;
import com.MobileRepository;


public class MobileRunner {
	public static void main(String[] args) {
		
		MobileRepository m=new MobieRepositoryImp();
		MobileService d=new MobileServiceImp(m);
		d.validation("phone");
		
	}

}
