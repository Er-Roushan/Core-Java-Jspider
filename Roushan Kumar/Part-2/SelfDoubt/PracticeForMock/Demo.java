public class Demo
{
	public static void main(String args[])
	{
		byte b=1;
		while(b++ < 2 || ++b == 3)
		{
			b++;
			++b;
		}
		System.out.println(b);
	}
}