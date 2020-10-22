import java.util.Scanner;
class swap2
{
	public static void main(String ar[])
	{
		System.out.println("Enter first number");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Enter Second number");
		int num2=sc.nextInt();

		System.out.println("Before swapping\n"+" num1 = "+num1+" num2 = "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping\n"+" num1 = "+num1+" num2 = "+num2);

	}
}