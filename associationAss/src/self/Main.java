package self;

public class Main {
	public static void main(String[] args) {
		int cost=5000;
		Wood w=new Wood(cost);
		System.out.println("cost of the wood:"+cost);
		Paper p=new Paper();
		w.setPaper(p);
		w.door();
	}

}
