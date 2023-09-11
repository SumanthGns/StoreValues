package com.xworkz.findByIsexist;

public interface DeveloperRepository {
	
	int TOTAL_VALUE=10;
	public void save(DeveloperDTO dto);
	public boolean isExist(DeveloperDTO dto);
	public DeveloperDTO findByName(String name);

}
