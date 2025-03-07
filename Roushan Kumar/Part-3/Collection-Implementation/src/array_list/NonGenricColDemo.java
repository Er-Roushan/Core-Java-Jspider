package array_list;
import java.util.*;
public class NonGenricColDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection c = new ArrayList();
		System.out.println(c); //[]
		System.out.println(c.size()); //0
		System.out.println(c.isEmpty()); //true
		
		System.out.println(c.add(5));  //true
//		System.out.println(c.addAll(c));
		System.out.println(c.hashCode());
		
		c.add("Roushan");
		c.add('r');
		
		c.add(true);
		c.add(18.8);
		System.out.println("===============");
		System.out.println(c.size()); //5
		System.out.println(c.isEmpty()); //false
		System.out.println(c.hashCode());
		
		System.out.println(c.contains("Roushan")); //true
		
		Collection c2 = new LinkedList();
		c2.add(5);
		c2.add(6);
		
		c.addAll(c2);
		System.out.println(c);
		
		Collection c3 = new HashSet();
		c3.add(10);
		c3.add("Hash");
//		c3.add(10); for this duplicate object program will not error instead simply it will not store it.
		System.out.println(c3);
		
		c.addAll(c3);
		System.out.println(c);
		
		System.out.println(c.containsAll(c3)); //true
		c3.add("new object");
		System.out.println(c.containsAll(c3)); //false
		
		c.remove('r');
		System.out.println(c);
		
		c.removeAll(c3);
		System.out.println(c);
		
		c.retainAll(c);
		System.out.println(c2);
		
		c.clear();
		System.out.println(c); //[]

	}

}
