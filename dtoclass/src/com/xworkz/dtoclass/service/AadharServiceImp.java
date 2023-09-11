package com.xworkz.dtoclass.service;

import com.xworkz.dtoclass.AadharDTO;
import com.xworkz.dtoclass.AadharRepository;

public class AadharServiceImp implements AadharService {
	
	private AadharDTO aa;
	public AadharServiceImp(AadharDTO aa){
		this.aa=aa;
		
		
	}
	
	
	@Override
	public void validation(AadharDTO dto) {
		if(dto!=null) {
		aa.save(dto);
			
			
			
			
		}
		
		
	}
	
	

}
