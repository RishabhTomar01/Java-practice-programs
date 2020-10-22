class Pattern11
{
	public static void main(String ar[])
	{	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5 || i==j || i==j-i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");					
				}
			}

			System.out.println();
		}
	}
}