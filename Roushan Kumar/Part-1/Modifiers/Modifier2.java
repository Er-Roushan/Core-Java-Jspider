class Modifier2
{	

	public static void main(String []args)
	{
		Modifier1 obj1 = new Modifier1();
		obj1.m2();
		
		//Directly by class name
		Modifier1.m1();

		Modifier1.m3();
		// Modifier1.m4();     CTE(Private Access)
	}
}
		