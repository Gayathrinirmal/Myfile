package javaprograms;

import java.util.Scanner;

public class EvennoLimit {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter lower limit and upper limit ");
		int x = reader.nextInt();
		int j = reader.nextInt();
		System.out.println("The even numbers between "+x +" and "+ j +" :" );
		for (int i = x; i <= j; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
