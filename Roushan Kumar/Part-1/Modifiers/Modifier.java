//create different different method based on access modifier within class and outside the class.

class Modifier1
{
	public static void m1()
	{
		System.out.println("Method Public");
	}

	protected static void m2()
	{
		System.out.println("Method protected");
	}

	static void m3()
	{
		System.out.println("Method default");
	}

	private static void m4()
	{
		System.out.println("Method Private");
	}

	public static void main(String []args)
	{	
		m1();
		m2();
		m3();
		m4();

		//By help of object
             
		System.out.println("================");		

		Modifier1 obj = new Modifier1();
			 
			obj.m1();
			obj.m2();
			obj.m3();
			obj.m4();

		System.out.println("================");

		// By help of class 

		Modifier1.m1();
		Modifier1.m2();
		Modifier1.m3();	
		Modifier1.m4();		

					
	}
}