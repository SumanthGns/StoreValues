package com.xworkz.MultipleStoring;

public class TrainNoImp implements TrainNo{
	
	int[] no=new int[TOTAL_VALUE];
	int position;
	
	public void trainNo(int num) {
		this.no[position]=num;
		System.out.println("the train number " +num  +"position " +this.position);
		position++;
		
	}
	public boolean isExists(int num) {
		for(int i=0;i<=this.position;i++) {
			int temp=no[i];
			if(temp!=0 && temp==num) {
				System.out.println("these numbers already stored cant store more");
				return true;
				
			}
			else {
				System.out.println("can't store an number");
				
			}
		}
		return false;
	}

}
