package Object_Oriented_Programming.Interfaces;

public class Main {
    public static void main(String[] args) {

        /**
         * What you can access depends on 'Engine car', but
         * which one to access is actually depends on 'new Car();'
         * **/
//        Engine car = new Car();
//
//        car.start();// from Engine Inteface
//        car.acceleration();// from Engine interface
//        //car.brake();// from Brake Interface
//        car.stop();// from Engine interface

//        MediaPlayer carMedia = new Car();
//        carMedia.stop();

        NiceCar car1 = new NiceCar();
        car1.start();//call start method of the Nicecar class
        car1.accelerates();//call start method of the Nicecar class
        car1.Brake();
        car1.stop();//call stop method of the Nicecar class
    }
}
