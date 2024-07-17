class EvenNoOfWays
{
	public static void main(String []args)
	{
		int a=2;

		
//Method-1
		/*
		if(a%2==0)
		{
			System.out.println("Even");
		}
		*/


//Method-2
		/*
		int digit1=a%10;
		if(digit1==0 || digit1==2 || digit1==4 || digit1==6 || digit1==8)
		{
			System.out.println("Even");
		}
		*/
//Method-3
		if(( a  & 1) == 0)
		{
			System.out.println("even");
		}
		
				

	}
}