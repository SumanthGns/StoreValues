package app;

import java.util.Objects;

public class ArtistImp implements Artist {
	
	int t=10;
	String[] c=new String[10];
	int position;
	boolean flag;
	public void name(String create) {
		for(int i=0;i<c.length;i++){
			if(Objects.nonNull(c[i])&&c[i].equals(create)) {
				System.out.println(create+" already exist");
				flag=true;
			}
		}
		if(!flag) {
		this.c[position]=create;
		System.out.println(create+" " +position);
		position++;
		}
		
	}
	public static void main(String[] args) {
		Artist a=new ArtistImp();
		a.name("ram");
		a.name("yash");
		a.name("ram");
	}
	

}
