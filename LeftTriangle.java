import java.util.Scanner;
class LeftTriangle
{
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the value");
		int number=scanner.nextInt();
		
		for(int i=1;i<=number;i++){
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}