package staticExample;

public class Human {
    int age;
    String name;
    float salary;
    boolean isMarried;

    // Here, population will remain same for every obj of Human because it's 'static'.
    static int population;

    static void message(){
        System.out.println("Hello! World.");

        /*
         Here you got an error because static means don't depend on obj
         but 'this' keyword is depended on obj, So how can you, you use it --> Common Sense
         System.out.println(this.name);
        */

    }
    public Human(int age, String name, float salary, boolean isMarried){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;

//        this.population += 1; // We can use in this way, but this is not suitable
        // Use the class name for static instance variable.
        Human.population += 1; // Every time we create any obj population will increase and remain same for every obj.

    }

}
