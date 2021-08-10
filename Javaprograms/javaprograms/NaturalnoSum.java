package javaprograms;

import java.util.Scanner;

public class NaturalnoSum {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter upper limit ");
		int x = reader.nextInt();
		int j=0;
		for (int i=0;i<=x;i++)
		{
			j=j+i;
		}
		System.out.println("The sum of natural number till "+x+" =" + j);
	}

}
