// WAJP to find the factorial of a number
class FactorialDynamic
{
	public static void main(String []args)
	{
		int a=15;
		long factorial=1;
		System.out.print("Factorial of " + a + " is:");
		
		if(a==0)
		   {
			System.out.print(factorial);

		   }else{
				for(int i=a; i>=1; i--)
				{			
					factorial *= i;			
				}
	
	      		}
		System.out.print(factorial);
	}
}