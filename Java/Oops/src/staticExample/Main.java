package staticExample;

public class Main {
    public static void main(String[] args) {
        // Here we're using Human class without using 'import' because we're in the same package.
        Human azad = new Human(22,"Azad",15000,false);
        Human hamid = new Human(24,"Azad",14000,true);

        System.out.println(azad.name);
        // We can use, Using obj name, but this is not suitable.
//        System.out.println(azad.population);

        // Instead use the class name.
        System.out.println(Human.population); // Gives 2 because we create 2 obj, and it remains same for every obj.
    }
}
