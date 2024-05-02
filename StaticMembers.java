package com.tnsif.day1;

public class StaticMembers {
	

	
		int a=10;
		static int b=20;
		static void display() { //static members can access static variable
			System.out.println(StaticMembers.b);
		}
		static void display1() { //static members can access static variable
			System.out.println(StaticMembers.b);
			}
		
		 	public static void main(String[] args) {
		 		StaticMembers i1=new StaticMembers();
		 		StaticMembers.display();
		 		StaticMembers.display1();
		 		
			
		
		
	}
	}

