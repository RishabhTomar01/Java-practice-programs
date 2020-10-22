import java.util.Scanner;
class HelloName{
	public static void main(String ar[])
	{
		System.out.println("enter your name");
		Scanner sc=new Scanner(System.in);
		String str;
		str = sc.nextLine();		
		System.out.println("Hello  "+ str );
		
	}
}