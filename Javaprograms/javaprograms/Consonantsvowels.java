package javaprograms;

import java.util.Scanner;

public class Consonantsvowels {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter an alphabet  : ");
		char c=reader.next().charAt(0);
		if(c=='a' || c=='e'||c=='i'||c=='0'|| c=='u')
		{
		 System.out.println(c + " is a vowel");	
		}
		else
		{
			System.out.println(c + " is a consonant");		
		}

	}

}
