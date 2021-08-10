package javaprograms;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter multiplication table of which number : ");
		int x = reader.nextInt();	
		System.out.println("Product till which number should be found out : ");
		int y = reader.nextInt();
		int product=0;
		for(int i=1;i<=y;i++)
		{
			product=i*x;
			System.out.println(i + "*" + x+ "=" +product);
		}
	}

}
