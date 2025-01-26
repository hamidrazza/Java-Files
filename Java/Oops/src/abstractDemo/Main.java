package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(28);
        son.career();

        Daughter daughter = new Daughter(26);
        daughter.career();

        Parent.hello();


    }
}
