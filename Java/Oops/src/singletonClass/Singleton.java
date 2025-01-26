package singletonClass;

public class Singleton {
    // Making private so no-one can create new obj according to itself.
    private Singleton(){

    }
    private static Singleton instance;
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
