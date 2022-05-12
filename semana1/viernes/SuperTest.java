package Ejemplos.semana1.viernes;

class Animal {
    // caso 1
    String color = "Blanco";

    // caso 2
    void eat(){
        System.out.println("comiendo...");
    }

    // caso 3
    Animal(){
        System.out.println("Se crea un animal");
    }
}

class Gato extends Animal{
    // caso 1
    String color = "Café";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }

    // caso 2
    void eat(){
        System.out.println("comiendo atún");
    }
    void dormir(){
        System.out.println("Ya se durmio el michi");
    }
    void call(){
        super.eat();
        dormir();
    }

    Gato(){
        super();
        System.out.println("Se creo un gato");
    }
}

public class SuperTest {
    public static void main(String[] args) {
        // caso 1
        // objeto anonimo
        //new Gato().printColor();

        // caso 2
        //new Gato().call();

        // caso 3
        new Gato();
    }
}
