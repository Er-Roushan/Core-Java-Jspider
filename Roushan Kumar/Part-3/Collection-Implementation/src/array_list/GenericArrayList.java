package array_list;
import java.util.*;
public class GenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj = new ArrayList();
		obj.add(5);
	//	obj.add("Roushan"); can't add any other value except Integer type
		obj.add(7);
		obj.add(10);
		
		for(Object o: obj) {
			System.out.println(o);
		}
		
		ArrayList<String> obj2 = new ArrayList();
		obj2.add("Hello");
		obj2.add("Roushan"); 
	//	obj2.add(7);  can't add any other value except String type
		obj2.add("java");
		
		for(Object o: obj2) {
			System.out.println(o);
		}
		
		HashMap<String, Integer> obj3 = new HashMap();
		obj3.put("key1", 18);
		obj3.put("key2", 10);
		obj3.put("key3", 13);
		System.out.println(obj3.entrySet());
}
}
