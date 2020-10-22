import java.util.Scanner;
class RevNum
{
	public static void main(String ar[])
	{
		int num,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		num=sc.nextInt();
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("reversed number are : "+ rev);
	}
}