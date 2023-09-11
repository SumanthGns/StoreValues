package sum;
import plus.LocationRepository;
import plus.LocationRepositoryImp;


public class LocationRunner {
	public static void main(String[] args) {
		
		LocationRepository l=new LocationRepositoryImp();
		LocationServiceImp s=new LocationServiceImp(l);
		s.validation("bangalore");
		s.validation("mysore");
		s.validation("hbhalli");
		s.validation("bangalore");
		
		
		
	}

}
