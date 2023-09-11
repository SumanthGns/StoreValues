package apps;

public class User {
	
	Network network;
	
	public void Userid(Network network) {
		System.out.println("invoking main in net.work");
		this.network=network;
		this.network.connect();
	}
	public static void main(String[] args) {
		Network n=new AirtelNetwork();
		User u=new User();
		n.connect();
		u.Userid(n);
		
	}
	

}
