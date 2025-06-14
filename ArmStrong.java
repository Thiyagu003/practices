import java.util.Scanner;
class ArmStrong
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value:");
		int number=scanner.nextInt();
		int original=number;
		int ArmStrong=0;
		while(number>0)
		{
			int remainder=number%10;
			int cube=remainder*remainder*remainder;
			ArmStrong=ArmStrong+cube;
			number=number/10;
		}
		System.out.println(ArmStrong);
	}
}