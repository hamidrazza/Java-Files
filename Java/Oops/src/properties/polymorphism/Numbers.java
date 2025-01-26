package properties.polymorphism;

public class Numbers{

    // Method overloading --> Static/Compile Time Polymorphism
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(5,4);
        obj.sum(2,1,3);

    }
}
