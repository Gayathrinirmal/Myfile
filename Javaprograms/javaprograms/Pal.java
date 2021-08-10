package javaprograms;

import java.util.Scanner;

public class Pal {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = reader.nextInt();	
		Pal.reverse(n);	
			
	}
	public static void reverse(int n)
	  {
	   int remainder = 0, reverse = 0,num=n;
			while (n > 0) {
				remainder = n % 10;
				reverse = (reverse * 10) + remainder;
				n = n / 10;

			}
		Pal.palindrome(num,reverse);	
			
	  }
	public static void palindrome(int num,int reverse)
	{
		if(num==reverse)
			{
				System.out.println(num+" is a palindrome number !!" );	
			}
			else
			{
				System.out.println(num+" is not  a palindrome number !!" );
			}
		
	}
	
}
