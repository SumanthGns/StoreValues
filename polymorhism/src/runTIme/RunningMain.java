package runTIme;

public class RunningMain {
	
	void acter(Movies obj) {
		obj.Director();
		
		
		
	}
	
	public static void main(String[] args) {
		RunningMain r=new RunningMain();
		r.acter(new KeerthySuresh());
		r.acter(new Sumanth());
		System.out.println("00000000000000000000");
		
		KeerthySuresh k=new KeerthySuresh();
		r.acter(k);
		Sumanth s=new Sumanth();
		r.acter(s);
		
		
	}

}
