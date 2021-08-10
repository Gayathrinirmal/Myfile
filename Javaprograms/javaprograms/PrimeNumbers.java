package javaprograms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=reader.nextInt();
		int prime=0;
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				prime=1;
			}
		}
        if(prime==1)
        {
        	System.out.println(a+ " is not a prime number");
        }
        else
        {
        	System.out.println(a+ " is  a prime number");
        }
	}

}
