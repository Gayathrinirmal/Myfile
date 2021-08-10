package javaprograms;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the starting alphabet");
		char ch=reader.next().charAt(0);
		System.out.println("Enter the ending alphabet");
		char end=reader.next().charAt(0);
		System.out.println("Alphabets between "+ch +" and "+end +" are :");
	    for(char i=ch;i<=end;i++)
	    {
	    	System.out.println(i);
	    }
        
	}

}
