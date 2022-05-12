package Ejemplos.semana1.viernes;

class Bike2 {
    void run(){
        System.out.println("running...");
    }
}

public class Polimorfismo extends Bike2 {
    @Override
    // se redefine el método run de la clase Bike2
    void run(){
        System.out.println("running safely with 60 miles per hour");
    }

    public static void main(){
        Bike2 bike2 = new Polimorfismo();
        bike2.run();
    }
}
