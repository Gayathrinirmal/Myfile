package javaprograms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("***Calculator*** ");
		System.out.println("Enter two  numbers : ");
		double a = reader.nextDouble();
		double b = reader.nextDouble();
		double result=0;
		System.out.println("Enter the operation to be performed :( + ,-,*,/,% )");
		char c=reader.next().charAt(0);
		if(c=='+')
		{
		 result=a+b;	
		 System.out.println("Sum = "+result);
		}
		else if(c=='-')
		{
		 result=a-b;
		 System.out.println("Difference = "+result);
		}
		else if(c=='*')
		{
		 result=a*b;
		 System.out.println("Product ="+result);
		}
		else if(c=='/')
		{
		 result=a/b;
		 System.out.println("Quotient = "+result);
		}
		
		else if(c=='%')
		{
		 result=a%b;
		 System.out.println("Remainder = "+result);
		}
		else 
		{
		 System.out.println("Invalid Operator !!");
		}
			

	}

}
