package Ejemplos.semana1.viernes;

public class Empleado {
    double salario = 40000;
}

class Programadora extends Empleado{
    int bono = 1000;

    public void main(){
        Programadora Fer = new Programadora();
        System.out.println("El salario de Fer es:" + Fer.salario);
        System.out.println("El bono es:" + Fer.bono);
    }

    void mensaje(){
        System.out.println("Soy programadora");
        main();
    }
}

class Web extends Programadora {
    public static void main(String[] args) {
        Web w = new Web();
        w.mensaje();
    }
}
