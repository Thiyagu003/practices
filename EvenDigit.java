//Print the sum of only even digits in a number
import java.util.Scanner;
class EvenDigit
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value:");
		
		int number=scanner.nextInt();
		
		int count=0;
		
		if(number<0)
		{
			number=-number;
		}
		
		while(number>0)
		{
			int remainder=number%10;
		if(number%2==0)
		{
			count=count+remainder;
		}	
       number=number/10;		
		}
		System.out.println("the value:"+count);
	}
}