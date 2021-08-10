package javaprograms;

import java.util.Scanner;

public class license {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = reader.nextLine();
		System.out.println("Enter your age : ");
		int age = reader.nextInt();
		 boolean value=license.verifyLicense(age,name);
	  System.out.println(value);
		 
 }
 
 public static boolean verifyLicense(int age,String name)
  {
   
		boolean value;
		if(age>=18)
		{
		  value=true;	
		}
		else
		{
			value=false;		
		}
		return value;
  }
 
 }