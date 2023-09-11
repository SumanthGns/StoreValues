package sum;

import plus.LocationRepository;

public class LocationServiceImp implements LocationService {

	private LocationRepository location;

	public LocationServiceImp(LocationRepository location) {
		this.location = location;
	}

	public boolean validation(String name) {
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 10) {
			boolean exit = location.isExist(name);
			if (!exit) {
				location.name(name);
				System.out.println("valid to work");
				return true;
			} else {
				System.out.println("it is same");
			}
		}

		return true;

	}

}
