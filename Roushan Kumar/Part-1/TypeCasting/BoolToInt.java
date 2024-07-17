// WAJP to store boolean type data(true) inside the int type variable and print it.

class BoolToInt
{
	public static void main(String[] args)
	{
		boolean b=true;
		int num = (int) b; // CTE can't be converted
		System.out.print(num);
	}
}