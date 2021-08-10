package javaprograms;

import java.util.Scanner;

public class OddEvenCheck {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = reader.nextInt();
		int remainder=a%2;
		if(remainder==0)
		{
			System.out.println(a +" is an even number");	
		}
		else if (remainder!=0)	{
			System.out.println(a +" is an odd number");
			
		}else
		{
			System.out.println("Invalid number");
		}
	}

}
