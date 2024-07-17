package exception_generation;

public class ClassCastException {

}

class Child extends ClassCastException{
	public static void main(String[] args) {
		
		ClassCastException p_obj = new ClassCastException();
		Child c_obj = (Child)p_obj;
	}
}