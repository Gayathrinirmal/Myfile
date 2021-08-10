package javaprograms;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your mark  out of 100: ");
		int mark = reader.nextInt();
		if (mark > 80 && mark <= 100)
		{
			System.out.println("Grade = A");
		} 
		else if (mark > 60 && mark <= 80)
		{
			System.out.println("Grade = B");
		} 
		else if (mark > 40 && mark <= 60)
		{
			System.out.println("Grade = C");
		}
		else if (mark<=40)
		{
		  System.out.println("Grade= D ");
		  System.out.println("Failed");
		}
		else
		{
		  System.out.println("Invalid mark !!");
		  
		}
	}

}
