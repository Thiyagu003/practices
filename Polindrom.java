import java.util.Scanner;

class Polindrom
{
     public static void main(String args[])
	 
	 {
	 Scanner scanner=new Scanner(System.in);
	 
	 System.out.println("enter the value:");
	 int number=scanner.nextInt();
	 int result=0;
	 int original=number;
	 while(number>0){
	 int remainder=number%10;
	 result=result*10+remainder;
	 number=number/10;
	 }
	 System.out.println(result);
	 if(original==result)
	 {
	 System.out.println("it is polindrom");
	 }
	 else{
	 System.out.println("it is not polindrom");
	 }
	 
	 }
}