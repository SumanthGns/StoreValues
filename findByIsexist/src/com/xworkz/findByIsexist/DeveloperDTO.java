package com.xworkz.findByIsexist;

public class DeveloperDTO {
	
	private String name;
	private int experiance;
	private double salary;
	private String workingFor;
	private String designation;
	private boolean difficult;
	
	public DeveloperDTO() {
		
	}
	
	public DeveloperDTO(String name,int experiance,double salary,String workingFor,String designation,boolean diificult) {
		this.name=name;
		this.experiance=experiance;
		this.salary=salary;
		this.workingFor=workingFor;
		this.designation=designation;
		this.difficult=diificult;
		
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperiance() {
		return experiance;
	}

	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getWorkingFor() {
		return workingFor;
	}

	public void setWorkingFor(String workingFor) {
		this.workingFor = workingFor;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public boolean isDifficult() {
		return difficult;
	}

	public void setDifficult(boolean difficult) {
		this.difficult = difficult;
	}

	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof DeveloperDTO) {
				DeveloperDTO F=(DeveloperDTO)obj;
				if(F.designation.equals(this.designation)) {
					System.out.println("the desegnation name is already exits");//it is same it is true
					return true;
				}else {
					System.out.println("it can store it can be a Designation value");//it can be a false
					
				}
			}
		}
		return false;
	}
	


}
