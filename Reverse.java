import java.util.Scanner;
class ReverseAxesWalker{
	public static void main(String args[])
	
	{
	Scanner scanner=new Scanner(System.in);
    System.out.println("enter the number");
    int number=scanner.nextInt();
    
    int reverse=0;
while(number>0)
{
int remainder=number%10;
reverse=reverse+remainder;
number=number/10;
}	
System.out.println(reverse);
	}
	
}