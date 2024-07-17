//WAJP to print product of all the number from 20 to 30;
class Activity2_8
{
	public static void main(String[] args)
	{
		int a=20;
		int product = a * (a+1) * (a+2) * (a+3) * (a+4) * (a+5) * (a+6) * (a+7) * (a+8) * (a+9) * (a+10);
		System.out.println(product);

/*		int productloop=1;
		for ( int i=20; i<=30; i++)
		{  productloop*=i; }
		System.out.print(productloop);
*/
	}
}