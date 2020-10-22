import java.util.Scanner;
class VowelorNot
{
	public static void main (String ar[])
	{
		char ch;
		System.out.println("Enter your chracter");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);

		switch(ch)
		{
			case 'a':
				System.out.println("its vowel");
				break;
			case 'e':
				System.out.println("its vowel");
				break;
			case 'i':
				System.out.println("its vowel");
				break;
			case 'o':
				System.out.println("its vowel");
				break;
			case 'u':
				System.out.println("its vowel");
				break;
			case 'A':
				System.out.println("its vowel");
				break;
			case 'E':
				System.out.println("its vowel");
				break;
			case 'I':
				System.out.println("its vowel");
				break;
			case 'O':
				System.out.println("its vowel");
				break;
			case 'U':
				System.out.println("its vowel");
				break;
			default:
				System.out.println("its consonant");
		}
	}
}