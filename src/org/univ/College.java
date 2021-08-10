package org.univ;

public class College extends University
{
	
	public void ug() {
		
System.out.println("ug is ug");
	}
	public void pg() {
	System.out.println("pg is pg");

	}

	public static void main(String[] args) {
		
		College c=new College();
		c.pg();
		c.ug();
		
	}
	
	
}
