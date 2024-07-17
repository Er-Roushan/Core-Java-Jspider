package wrapper_classes;

public class ParsingExample {

	public static void main(String[] args) {
		
		String s="123";
		int i = Integer.parseInt(s);
		System.out.println(i);  //123
		System.out.println(i + 10);  //133
		
		String s2= "10";
		byte b=Byte.parseByte(s2);
		System.out.println(b); //10
		System.out.println(b + 5); //15
		
		String s3 = "5.6";
		double d=Double.parseDouble(s3);
		System.out.println(d);  //5.6
		System.out.println(d + 0.4);
		
		String s4 = "tRue";
		boolean bl = Boolean.parseBoolean(s4);
		System.out.println(bl);
		
		String s5 = "java";
		boolean bl2 = Boolean.parseBoolean(s5);
		System.out.println(bl2);
		
		
	}

}
