import java.util.Scanner;
class Prime
{
	public static void main(String ar[])
	{
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				break;
			}
		}
		if(num==i)
		{
			System.out.println("its prime number");
		}
		else
		{
			System.out.println("its not prime number");
		}
		
	}
}