package com.tnsif.day1;

	 class Parent {
		 static void display() {
			 System.out.println("this is overloading method");
		 }
		  String display(String a) {
			return a;
		}
		  int  display(int a) {
		return a;	
		}
	 }
	 
	 
	 class InstanceOverloading{
		 public static void main(String[] args) {
			 Parent p1=new  Parent();
			 Parent.display();
			System.out.println (p1.display("hellow"));
			System.out.println(p1.display("3"));
		}
	 }


