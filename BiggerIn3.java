import java.util.Scanner;
class BiggerIn3
{
	public static void main(String ar[])
	{
		int num1,num2,num3;
		System.out.println("Enter your first Number");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("Enter your Second Number");
		num2=sc.nextInt();
		System.out.println("Enter your Third Number");
		num3=sc.nextInt();

		if(num1>num2 && num1>num3)
		{
			System.out.println("First number is greater");
		}
		else if(num2>num3 && num2>num1)
		{
			System.out.println("Second number is greater");
		}
		else
		{
			System.out.println("third number is greater");
		}
	}
}