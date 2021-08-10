package javaprograms;

public class CountEvenOdd {

	public static void main(String[] args) {
		int evencount=0,oddcount=0;
		for(int i=10;i<=20;i++)
		{
			if(i%2==0)
			{
			 evencount=evencount+1;	
			}
			else if (i%2!=0)
			{
			 oddcount=oddcount+1;
			}
		}
		System.out.println("The count of even numbers is : "+evencount);
		System.out.println("The count of odd numbers is : "+oddcount);

	}

}
