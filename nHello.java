import java.util.Scanner;
class nHello
{
	public static void main(String ar[])
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number how many times you want to print Hello world");
		j=sc.nextInt();
		for (i=1;i<=j;i++)
		{
		System.out.println("Hello world");
		}
	}
	
}