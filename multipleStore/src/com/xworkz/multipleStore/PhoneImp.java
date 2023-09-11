package com.xworkz.multipleStore;

public class PhoneImp implements Phone{
	
	long[] ph =new long[TOTAL_VALUE];
	int position;
	
	public void store(long num) {
		this.ph[position]=num;
		System.out.println("the number stored in " +num + "position  " +this.position);
		position++;
	}
	public boolean isExit(int num) {
		for(int i=0;i<=this.position;i++) {
			long temp=ph[i];
			if(temp!=0 && temp==num) {
				System.out.println("this numbers is already stored cant store try with another number");
				return true;
			}
			
		}
		return false;
	}

}
