package operationProg;

public class Count {
	
	public static int countmet(int num) {
		int digit_count=0;
		while(num !=0 ) {
			
			num /= 10;
			digit_count++;
			
		}
		return digit_count;
	}

	public static void main(String[] args) {
		
		System.out.println(countmet(123678));

	}

}
