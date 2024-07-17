//WAJP a java program to store char type data('A') inside the short and int type variable and print it.

class CharToIntAndShort
{
	public static void main(String[] args)
	{
		char val = 'A';
		//short a = (short) 'A'; (it's also fine)
		short num1 =  (short) val;
		int   num2 = (int) val;  //int   num2 = val;(it also work, No CTE)
		
		System.out.println(num1);
		System.out.println(num2);
	}
}