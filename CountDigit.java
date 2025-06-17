//Count how many digits are in a number
import java.util.Scanner;
class CountDigit
{
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the value:");
		int number=scanner.nextInt();
		
		int count=0;
		if(number<0)
		{
			number=-number;
		}
		
		if(number==0)
		{
			count=1;
		}
		else
		{
			while(number>0)
			{
				number=number/10;
				count++;
			}
		}
		System.out.println("the count is :"+count);
	}
}