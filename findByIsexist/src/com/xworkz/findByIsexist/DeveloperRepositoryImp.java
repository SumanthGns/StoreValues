package com.xworkz.findByIsexist;

public class DeveloperRepositoryImp implements DeveloperRepository {

	DeveloperDTO[] dto = new DeveloperDTO[TOTAL_VALUE];
	int pos;

	public void save(DeveloperDTO dto) {
		if (pos < TOTAL_VALUE) {
			this.dto[pos] = dto;
			System.out.println(dto + " " + pos);
			pos++;
		}
	}

	public boolean isExist(DeveloperDTO dto) {
		for (int i = 0; i <= pos; i++) {
			DeveloperDTO temp = this.dto[i];
			if (temp != null && temp.equals(dto)) {
				System.out.println("it can not store because it as a same value");
				return true;

			}
		}
		return false;
	}
	public DeveloperDTO findByName(String name) {
		for(int i=0;i<=pos;i++) {
			DeveloperDTO ref=dto[i];
			if(ref.getName().equals(name)) {
				System.out.println("it as found on position=" +i);
				return ref;
			}
			else {
				System.out.println("it is not found");
			}
		}
		return null;
	}

}
