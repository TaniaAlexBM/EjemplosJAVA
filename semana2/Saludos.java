package Ejemplos.semana2;

abstract class Hola{
    void saludar(){
        // Como lo hace
        System.out.println("Hola, Como estas");
    }
    abstract void saludo();
}

interface Mostrar{
    // Que hace
    void show();
    abstract void despide();
}

public class Saludos implements Mostrar {
    public void show(){
        System.out.println("Hola, Como estas?");
    }

    public static void main(String[] args) {
        Saludos saludo1 = new Saludos();
        saludo1.show();
    }

    public void despide(){
        System.out.println("Adios!");
    }
}
