package exception_handling;

public class ClassCastHandling {

}

class Child extends ClassCastHandling{
	
	public static void main(String[] args) {
		ClassCastHandling obj = new ClassCastHandling();
		try {
			Child obj2 = (Child)obj;
		}
		
		catch(ClassCastException e){
			System.out.println("Can't store parent class ref to child class ref var.");
		}
		
		System.out.println("Exception Handled.");
	}
}
