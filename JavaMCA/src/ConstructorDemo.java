public class ConstructorDemo{
	private String name = "Unknown";
	private int id = 0;
	
	//Constructor
	ConstructorDemo(){
		System.out.println(name + " " + id);
	}
	
	//Constructor Overloading
	ConstructorDemo(int id){
		this.id = id;
		System.out.println(name + " " + id);
	}
	
	public static void main(String[] args){
		
		// Making the object of the current class
		ConstructorDemo obj1 = new ConstructorDemo();
		ConstructorDemo obj2 = new ConstructorDemo(10);
	}
}