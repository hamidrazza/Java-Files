class GenericOne<T>{
	T obj;
	GenericOne(T obj){
		this.obj = obj;
	}
	public T getObj(){
		return this.obj;
	}
}
class GenericTwo<T,E>{
	T obj1;
	E obj2;
	
	GenericTwo(T obj1, E obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public T getObj1(){
		return this.obj1;
	}
	public E getObj2(){
		return this.obj2;
	}

}
class GenericDemo{
	// Main method
	public static void main(String[] args){
		System.out.println("Single Type Generic Class");
		GenericOne<Integer> first = new GenericOne<Integer>(22);
		System.out.println("Object is : " + first.getObj());
		
		System.out.println("Double Type Generic Class");
		GenericTwo<Integer,String> second = new GenericTwo<Integer,String>(12, "Hamid");
		System.out.println("Object1 is : " + second.getObj1());
		System.out.println("Object2 is : " + second.getObj2());
	}
}