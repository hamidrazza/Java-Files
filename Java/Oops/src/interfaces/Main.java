package interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();

//        car.start();
//        car.acc();
//        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.stop(); // It runs the engine stop(), that's why we should create diff classes for diff interfaces

        NiceCar car1 = new NiceCar();
        car1.start();
        car1.startMusic();
        car1.upgradeEngine();
        car1.start();

    }
}
