package javaprograms;

public class Recursivemethod {
	static int count = 0;

	public static void show() {
		count++;

		if (count <= 5) {
			System.out.println("Hello " + count);
			show();
		}
	}

	public static int factorial(int n) {
		if (n == 1)
			return n;
		else
			return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Recursivemethod.show();
	}

}
