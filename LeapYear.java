import java.util.Scanner;
class LeapYear
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int year=sc.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("its leap year");
				}
				else
				{
					System.out.println("its not leap year");

				}
			}
			else
			{
				System.out.println("its not leap year");

			}
		}
		else
		{
			System.out.println("its not leap year");

		}
	}
}