import java.util.Scanner;

class GCD
{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter the  value:");
int number=scanner.nextInt();
System.out.println("enter the second value:");
int number1=scanner.nextInt();
int gcd=1;
for(int i=1;i<=number;i++)
{
if(number%i==0&&number1%i==0)
{
gcd=i;
}
}
System.out.println("GCD"+gcd);
}
}