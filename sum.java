import java.util.Scanner;
class sum
{
	public static void main(String ar[])
	{
		int num1,num2,sum;
		System.out.println("Enter your first Number");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("Enter your Second Number");
		num2=sc.nextInt();

		sum=num1+num2;

		System.out.println("sum of "+num1+" + "+num2+" = "+sum);
	}
}