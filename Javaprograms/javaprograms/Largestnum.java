package javaprograms;

import java.util.Scanner;

public class Largestnum {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter three  numbers : ");
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		if((a>b)&&(a>c))
		{
		 System.out.println(a + " is largest ");
				}
		else if((b>a)&&(b>c))
		{
		 System.out.println(b + " is largest ");
			
		}
		else {
			System.out.println(c + " is largest ");
			
			
		}
	}

}
