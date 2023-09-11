package com.xworkz.findByIsexist.service;

import com.xworkz.findByIsexist.*;

public class DeveloperRunner {

	public static void main(String[] args) {
		DeveloperRepository ref=new DeveloperRepositoryImp();
		DeveloperServiceImp ref1=new DeveloperServiceImp(ref);
		DeveloperDTO ref2=new DeveloperDTO("sumanth",60,100,"123","jin",true);
		DeveloperDTO ref3=new DeveloperDTO("krish",45,622,"65","ram",true);
		ref1.validateAndSave(ref3);
		ref1.validateAndSave(ref2);
	}

}
