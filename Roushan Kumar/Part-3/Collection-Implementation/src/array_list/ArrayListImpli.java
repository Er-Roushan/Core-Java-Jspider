package array_list;
import java.util.*;

public class ArrayListImpli {

	public static void main(String[] args) {
		
		ArrayList obj = new ArrayList();
		obj.add("Roushan");
		obj.add(5);
		
//		System.out.println(obj);
		
		for(Object o : obj){
			System.out.println(o);
		}
		
		System.out.println("===================");
		
		LinkedList obj2 = new LinkedList();
		obj2.add(45);
		obj2.add("jigmet");
		
		for(Object o : obj2){
			System.out.println(o);
		}
		
		System.out.println("===================");
	
		Vector v = new Vector();
		v.add(67);
		v.add("Abhi");
		
		for(Object o : v){
			System.out.println(o);
		}
		
		HashSet h = new HashSet();
		h.add(18);
		h.add("Sonu");
		
		for(Object o : h){
			System.out.println(o);
		}
		
		System.out.println("===================");
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(20);
		lhs.add("Mri");
		
		for(Object o : lhs){
			System.out.println(o);
		}
		
		System.out.println("===================");
		Student sobj = new Student("Roushan", 1, 'a', 8677867330l);
		obj.add(sobj);
		
		for(Object o : obj){
			System.out.println(o);
		}
		
		System.out.println("===================");
		HashMap hmap = new HashMap();
		hmap.put(1, "Roushan");
		hmap.put(2, "Dev");
		
		System.out.println(hmap);  //{1=Roushan, 2=Dev}
		System.out.println(hmap.get(1)); //Roushan
		System.out.println(hmap.get(2)); //Dev
		

	}

}
