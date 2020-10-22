import java.util.Scanner;
class Swap
{
	public static void main(String ar[])
	{
		int num1,num2,swap;
		System.out.println("Enter your first Number");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("Enter your Second Number");
		num2=sc.nextInt();
		System.out.println("Before swapping");
		System.out.println("num1 :"+num1+ "\nnum2 :"+num2);
		swap = num1;
		num1 = num2;
		num2 = swap;
		System.out.println("After swapping");
		System.out.println("num1 :"+num1+ "\nnum2 :"+num2);



	
	}
}