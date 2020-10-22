import java.util.Scanner;
class EvenorOdd
{
	public static void main(String ar[])
	{
		int num;
		System.out.println("Enter your Number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if (num % 2 == 0)
		{
			System.out.println("its even");
		}
		else
		{
			System.out.println("its odd");

		}
		
	}
}