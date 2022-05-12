package Ejemplos.semana1.viernes;

class Animal2 {
    void eat(){
        System.out.println("Comiendo...");
    }
}

class Dog extends Animal {
    void eat(){
        System.out.println("Comiendo croquetas");
    }
}

class Cachorro extends Animal {
    void eat(){
        System.out.println("Tomando Agua");
    }
}

public class Plimorfismo2 {
    public static void main(String[] args) {
        Animal dander;
        dander = new Animal();
        dander.eat();
        dander = new Dog();
        dander.eat();
        dander = new Cachorro();
        dander.eat();
    }
}
