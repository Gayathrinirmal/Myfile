package javaprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the value for which factorial should be found  ");
		int x = reader.nextInt();
		int j=1;
		for(int i=x;i>0;i--)
		{
		 j=j*i;	
		}
		System.out.println("Factorial of "+x+" = "+j);
	}


	

}
