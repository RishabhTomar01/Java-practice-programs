import java.util.Scanner;
class nSum
{
	public static void main(String ar[])
	{
		System.out.println("Enter first number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int nnum=0;
		for(int i=1;i<=num;i++)
		{
			nnum=nnum+i;
		}
		System.out.println("sum is : "+nnum);
	}
}