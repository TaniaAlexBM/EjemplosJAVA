package Ejemplos.semana2;

abstract class Mountain{
    Mountain(){
        System.out.println("Se ha creado una bicicleta de montana");
    }
    abstract void cambiarVel();
    void cambiarColor(){
        System.out.println("Cambiando el color de la bicicleta");
    }
}

class Magistroni extends Mountain{
    @Override
    void cambiarVel() {
        System.out.println("Se deben desbloquear las perillas");
    }
}

public class Bicicleta {
    void cambiarVel(){
        System.out.println("Gira las perrillas");
    }

    public static void main(String[] args) {
        Mountain bici1 = new Magistroni();
        bici1.cambiarVel();
        bici1.cambiarColor();
    }
}
