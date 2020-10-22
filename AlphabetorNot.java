import java.util.Scanner;
class AlphabetorNot
{
	public static void main(String ar[])
	{
		char ch;
		System.out.println("Enter your Character");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		{
			System.out.println("it is Alphatbet");
		}
		else
		{
			System.out.println("its not alphabet");
		}
		
	}
}