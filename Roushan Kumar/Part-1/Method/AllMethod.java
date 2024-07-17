class AllMethod
{
	public static void test1(int a)
	{
		//Do-Nothing
	}

	public static void test2(float a)
	{
		//Do-Nothing
	}

	public static void test3(boolean bool, float f, double d)
	{
		//Do-Nothing
	}

	public static void test4(int a, int b, float f, double d)
	{
		//Do-Nothing
	}

	public static void test5(int a, long l, float f, double d, char c, String s)
	{
		//Do-Nothing
	}

	public static void main(String []args)
	{
		//Method call
		test1(18);
		test2(4.5f);
		test3(true, 1.8f, 2.4);
		test4(5, 6, 2.4f, 4.6);
		test5(34, 2567898767l, 3.4f, 8.9, 'R', "Roushan");

		System.out.print("Main Method End");
	}

}