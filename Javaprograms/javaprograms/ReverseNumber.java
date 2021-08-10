package javaprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = reader.nextInt();
		int remainder = 0, reverse = 0,num=n;
		while (n > 0) {
			remainder = n % 10;
			reverse = (reverse * 10) + remainder;
			n = n / 10;

		}
     System.out.println("The reverse of "+num+" = "+reverse );
	}

}
