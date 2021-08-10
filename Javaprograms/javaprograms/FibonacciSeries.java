package javaprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		System.out.println("The fibonacci series is :");
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<4;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}

	}

}
