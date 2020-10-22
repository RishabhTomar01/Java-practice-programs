import java.util.Scanner;
class PositiveorNegative
{
	public static void main(String ar[])
	{
		int num;
		System.out.println("Enter your Number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if (num>0)
		{
			System.out.println("its Positive");
		}
		else if(num<0)
		{
			System.out.println("its Negative");
		}
		else
		{
			System.out.println("its ZERO");
		}
		
	}
}