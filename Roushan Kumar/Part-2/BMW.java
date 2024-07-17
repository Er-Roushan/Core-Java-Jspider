class BMW extends Car{

	String strchild = "Hey i'm form child class";
	String car1="BMW i-7";

	public static void main(String[] args){
	Car c = new BMW(); //upcasting
	System.out.println(c.strcar);
	//System.out.println(c.strchild);

	BMW b = (BMW) c;	//downcasting
	System.out.println(b.strchild);
	System.out.println(b.car1);



}

}