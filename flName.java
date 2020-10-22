import java.util.Scanner;
class flName
{
	public static void main(String ar[])
	{
		String fname,lname;
		System.out.println("Enter your first name");
		Scanner sc=new Scanner(System.in);
		fname=sc.nextLine();
		System.out.println("Enter your last name");
		lname=sc.nextLine();

		System.out.println("Hello "+fname+" "+lname);
	}
}