//Print only odd numbers from 1 to n.

import java.util.Scanner;

class OddNumbers
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value:");
		int number=scanner.nextInt();
		
		for(int i=1;i<=number;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}