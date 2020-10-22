import java.util.Scanner;
class Palindrome
{
	public static void main(String ar[])
	{
		int num,temp,rem,rev=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if (num==rev)
		{
			System.out.println(num+" Is Palindrome");
		}
		else
		{
			System.out.println(num+" Is not palindrome");			
		}
	}
}