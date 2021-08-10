package javaprograms;

public class Evenodd {

	public static void main(String[] args) {
		int evencount=0,oddcount=0,i=10;
		while(i<=20)
		{
			if(i%2==0)
			{
			 evencount=evencount+1;	
			}
			else if (i%2!=0)
			{
			 oddcount=oddcount+1;
			}
			i+=1;
		}
		System.out.println("The count of even numbers is : "+evencount);
		System.out.println("The count of odd numbers is : "+oddcount);

	}

}
