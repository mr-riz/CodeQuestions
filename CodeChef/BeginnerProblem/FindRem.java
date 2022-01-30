import java.util.Scanner;
public class FindRem{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			int ans=x%y;
			
			
			System.out.println(ans);
			
		}

		

	}
}