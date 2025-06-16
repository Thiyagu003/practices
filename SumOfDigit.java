import java.util.Scanner;
class SumOfDigit
{
   public static void main(String args[])
   {
   Scanner scanner =new Scanner(System.in);
   System.out.println("enter the value:");
   int number=scanner.nextInt();
   
   int result=0;
   
   while(number>0)
   {
   int remainder=number%10;
   result=result+remainder;
   number=number/10;
   }
   System.out.println(result);
   }
}