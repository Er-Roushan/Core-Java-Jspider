package operationProg;

public class Power {
	
	public static int powr(int num, int to_power)
	{   
		int val=num;
		for(int i=1; i< to_power; i++) {
			 val *= num;
		}
		return val;
	}

	public static void main(String[] args) {
		
			System.out.println(powr(2,4));
	}

}
