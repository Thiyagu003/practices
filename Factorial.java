import java.util.Scanner;

class Factorial
{
	public static void main(String arsg[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value");
		int number=scanner.nextInt();
		
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}