package exception_handling;

public class NullPtrHandling {
	
	public static void main(String[] args) {
        
        String nullString = null;	        

        try {
        	int length = nullString.length();	        
        }
        catch(NullPointerException obj) {
        	System.out.println("String does not contain any value.");
        }
        
        System.out.println("Exception Handled");
    }

}
