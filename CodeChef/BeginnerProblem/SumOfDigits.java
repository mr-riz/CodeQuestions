import java.util.Scanner;
public class SumOfDigits{
	

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=0;

		
		for(int i=1;i<=n;i++)
		{
			int num=sc.nextInt();

			while(num>0)
			{
				temp=num%10;

			      sum=sum+temp;

			num=num/10;

			}
			System.out.println(sum);


			
		}

		




		
					}
					}