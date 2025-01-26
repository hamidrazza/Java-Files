package cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{54,2,42,3,1};
    }

    // Currently we're not using this constructor
    /*public Human(Human old){
        this.age = old.age;
        this.name = old.name;
    }*/

    // It's actually overriding the clone method of Cloneable interface
    /*@Override
    public Object clone() throws CloneNotSupportedException{
        // Shallow Copy
        return super.clone();
    }*/

    @Override
    public Object clone() throws CloneNotSupportedException{
        // Deep Copy
        Human twin = (Human)super.clone(); // This is actually shallow copy

        // Make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < (twin.arr.length); i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

}
