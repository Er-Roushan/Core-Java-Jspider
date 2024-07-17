package constructorConcept;

public class Question5 {


	int arg1;
	long arg2;
	float fl;
	double db;
	char chr;
	String st;
	public Question5(int a, long b, float f, double d, char ch, String str) {
		 arg1=a;
		 arg2 = b;
		 fl=f;
		 db = d;
		 chr = ch;
		 st = str;
		System.out.println("Object created...");
		System.out.println(arg1 + " "+ arg2 +" "+fl +" " + db + " "+ chr + " "+ str);
	}
	public static void main(String[] args) {
	
		Question5 obj = new Question5(5, 7l, 4.5f, 4.96, 'a', "Roushan");
		System.out.println(obj);
	
	

	}
}
