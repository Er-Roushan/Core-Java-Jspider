// WAJP to count how many even numbers are there from m to n
class EvenNumCount
{
	public static void main(String []args)
	{	
		int m=2;
		int n=20;
 		int count=0;
		System.out.print("Even number between " + m + " and " + n + " are: " );
		for(int i=m; i<=n; i++)
		{	
			if(i%2==0)
			{ 
				System.out.print(i + " ");		
				count++;
			}			
		}

		System.out.print("\nTotal number of even number is: " + count);
	}
}