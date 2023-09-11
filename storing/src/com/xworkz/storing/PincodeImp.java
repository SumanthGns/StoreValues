package com.xworkz.storing;

public class PincodeImp implements Pincode {
	
	
	int[] pin =new int[TOTAL_VALUE];
	int position;
	
	public boolean code(int num) {
		this.pin[position]=num;
		System.out.println("pincode " +num + "position " +this.position);
		position++;
		return true;
	}
	
	public boolean isExist(int num) {
		for(int i=0;i<=this.position;i++) {
			int temp=pin[i];
			if(temp==num) {
				System.out.println("cant store pincode");
				return true;
			}
		}
		return false;
	}

}
