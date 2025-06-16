import java.util.Scanner;
class LCM
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value:");
		int number1=scanner.nextInt();
		System.out.println("enter the value:");
		int number2=scanner.nextInt();
		
		int lcm=(number1>number2)? number1:number2;
		boolean condition=true;
		while(condition){
			
		
		if(number1%lcm==0 &&number2%lcm==0)
		{
			System.out.println("LCM"+lcm);
			break;
		}
		else
		{
			lcm++;
		
		}
		}
	}
}