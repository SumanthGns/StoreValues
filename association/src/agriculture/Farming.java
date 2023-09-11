package agriculture;

public class Farming {
	
	private String name;
	 private Land land;//association
	
	public Farming(String name) {
		System.out.println("Farmering");
		this.name=name;
	}
	public  void setLand(Land land) {
		System.out.println("land of the Farmer");
		this.land=land;
		
	}
	public void farming() {
		System.out.println("Farming the land");
		
		
	}

}
