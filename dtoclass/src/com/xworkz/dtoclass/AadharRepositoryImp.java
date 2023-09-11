package com.xworkz.dtoclass;

public class AadharRepositoryImp implements AadharRepository {
	
	AadharDTO[] a=new AadharDTO[10];
	int position;
	
	@Override
	public void save(AadharDTO dto) {
		this.a[position]=dto;
		System.out.println("Aadhar" +a + "position" +this.position);
		position++;
		
	}
	
	
	
	

}
