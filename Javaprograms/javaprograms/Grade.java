package javaprograms;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your mark  out of 100: ");
		int mark = reader.nextInt();
		do {
			if (mark > 80 && mark <= 100)
			{
				System.out.println("Grade = A");
				break;
			} 
			else if (mark > 60 && mark <= 80)
			{
				System.out.println("Grade = B");
				break;
			} 
			else if (mark > 40 && mark <= 60)
			{
				System.out.println("Grade = C");
				break;
			}
			else if (mark<=40)
			{
			  System.out.println("Grade= D ");
			  System.out.println("Failed");
			  break;
			}
			else
			{
			  System.out.println("Invalid mark !!");
			  break;
			  
			}
		}while(mark>0);

	}

}
