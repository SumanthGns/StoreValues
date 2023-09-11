package com.xworkz.findByIsexist.service;

import java.util.jar.Attributes.Name;

import com.xworkz.findByIsexist.DeveloperDTO;
import com.xworkz.findByIsexist.DeveloperRepository;

public class DeveloperServiceImp implements DeveloperService{
	
	DeveloperRepository repo;
	public DeveloperServiceImp(DeveloperRepository repo) {
		this.repo=repo;
	}
	public boolean validateAndSave(DeveloperDTO D) {
		if(D!=null) {
			String desi=D.getDesignation();
			int exp=D.getExperiance();
			double salary=D.getSalary();
			String workingfor=D.getWorkingFor();
			String name=D.getName();
			boolean diif=D.isDifficult();
			boolean T=repo.isExist(D);
			if(T==false) {
				System.out.println("it can store but checking the criteria");
				if(desi!=null && !desi.isEmpty() && exp!=0 && !name.isEmpty() && salary!=0 && workingfor!=null && workingfor.isEmpty()) {
					repo.save(D);
					
					
				}
				else {
					System.out.println("some condition is missing");
				}
			}
			else {
				System.out.println("it is already stored into a space");
			}
			
		}
		else {
			System.out.println("it is pointing to null");
		}
		return false;
		
	}
	

}
