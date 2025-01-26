package staticExample;

class Test2{
    String name;

    public Test2(String name){
        this.name = name;
    }
}

public class InnerClasses {
    /*class Test1{
        String name;

        public Test1(String name){
            this.name = name;
        }
    }*/
    // Now it works because it is now a static method
    static class Test1{
        String name;

        public Test1(String name){
            this.name = name;
        }

        // Building our own toString() method
        @Override
        public String toString(){
            return name;
        }
    }

    public static void main(String[] args) {
        // Throws an error because Test class depend on the outer class(InnerClasses)'s instances/objects and that is also non-static.
//        Test1 obj1 = new Test1("Rahul");

        // Doesn't throw any error because it's the most outer part of the class.
        // So, it doesn't depend on anyone. It's it on it.
        Test2 obj2 = new Test2("Aman");
    }
}
