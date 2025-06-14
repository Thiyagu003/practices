import java.util.Scanner;
class GCD
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value:");
		int a=scanner.nextInt();
		System.out.println("enter the second value:");
		int b=scanner.nextInt();
		while(a!=b)
		{
			if(a==0)
			{
				System.out.println("GCD"+b);
				break;
			}
			if(b==0)
			{
				System.out.println("GCD"+a);
			}
			if(a>b)
			{
				a=a-b;
				
			}
			if(b>a)
			{
				b=b-a;
			}
		}
		if(a==b)
		{
			System.out.println("GCD"+a);
		}
	}
}