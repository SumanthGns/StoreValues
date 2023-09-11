package plus;

public class LocationRepositoryImp implements LocationRepository {
	
	String[] loc=new String[TOTAL_VALUE];
	int position;
	
	public boolean  name(String name) {
		this.loc[position]=name;
		System.out.println("location name " + name + "position " +this.position);
		position++;
		return true;
	
 		
		
	}
	//{null,null,null}
	public boolean isExist(String name) {
		for(int i=0;i<=this.position;i++) {
			String temp=loc[i];
			if(temp!=null && temp.equals(name)) {
				System.out.println("it cant store");
				return true;
			}
			
		}
		return false;
	}


}
