package Introduction;

public class Classes {
    public static void main(String[] args) {


        Student rahul; // Only declaring a class
        rahul = new Student(); // Initializing rahul object

        // You can also declare & initialize in a single line.
        Student azad = new Student();
        // Whenever we create a new object it will go inside the constructor.

        /*System.out.println(azad.r_no);
        System.out.println(azad.name);
        System.out.println(azad.marks);*/
//        azad.greetings();

        Student sam = new Student(11,"sam",99f);
        /*System.out.println(sam.r_no);
        System.out.println(sam.name);
        System.out.println(sam.marks);*/

        Student random = new Student(azad);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;
        one.name = "onesName";
        // changes name of two because both are pointing to the same object.
        System.out.println(two.name);
    }
}
/*
Create a class
For every single element
*/
class Student{
    int r_no;
    String name;
    float marks;

    void greetings(){
        System.out.println("Hello, My name is " + this.name);
    }

    // Constructor
//    Student (){
//        // 'this' keyword will replace with every object we created.
//        this.r_no = 22;
//        this.name = "Rahman";
//        this.marks = 93.32f;
//    }

    // Calling constructor from another constructor
    Student(){
        // 'this' will replace with another constructor
        // Student (12,"random person",99.99f);
        this(12,"random person",99.99f);
    }

    // This will take Student object and assign other object into calling object.
    Student(Student other){
        this.name = other.name; // random.name = azad.name;
        this.r_no = other.r_no;
        this.marks = other.marks;
    }
    Student (int r_no, String name, float marks){
        this.r_no = r_no;
        this.name = name;
        this.marks = marks;
    }
}