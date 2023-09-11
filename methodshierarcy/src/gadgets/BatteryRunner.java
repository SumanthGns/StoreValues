package gadgets;

public class BatteryRunner  {

	public static void main(String[] args) {
		
		Battery store=new Battery();
		
		System.out.println(store.type);
		Sim call=new Sim();
		System.out.println(store.cost);
		store.calling();
		call.calling();

	}

}
