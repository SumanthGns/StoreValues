package Zoo;

public class ZooRunner {

	public static void main(String[] args) {
	    NationalZoo z1=new StateZoo();
	    System.out.println("number of the="+z1.number);
	    z1.park();
	    StateZoo k1=(StateZoo)z1;
	    System.out.println("name=" +k1.name);
	    k1.Lion();
	    

	}

}
