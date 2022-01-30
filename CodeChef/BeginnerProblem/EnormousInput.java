import java.util.Scanner;

public class EnormousInput{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner (System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
          
         
          	for(int i=1;i<=n;i++)
		{
			int num=sc.nextInt();
			
				if(num%k==0)
			{
				count=count+1;
			}


			}
			
		

          
		
		System.out.println(count);



	}
}