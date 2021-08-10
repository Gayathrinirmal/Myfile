package javaprograms;

import java.util.Scanner;

public class Voterseligibility {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = reader.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible for voting!!");	
		}
		else
		{
			System.out.println("You are not  eligible for voting!!");		
		}
		

	}

}
