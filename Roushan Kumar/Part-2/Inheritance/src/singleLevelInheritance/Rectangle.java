package singleLevelInheritance;

public class Rectangle extends Measurement {
	
	public void area(Rectangle obj1){
		System.out.println("Area of rectangle is: " + obj1.l * obj1.w);
	}

	 public  void peri(Rectangle obj1){
		 System.out.println("Perimeter of Rectangle is: "+ 2*(obj1.l + obj1.w));
	 }
	 
	public static void main(String[] args) {
		
		Rectangle obj = new Rectangle();
		obj.area(obj);
		obj.peri(obj);

//		System.out.println(obj.l);
//		System.out.println(obj.w);
		
	}

}
