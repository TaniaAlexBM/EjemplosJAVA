package Ejemplos.semana1.viernes;

// super clase
class Persona{
    int id;
    String nombre;

    Persona(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
}

class TestPersonaEmpleado{
    public static void main(String[] args) {
        Emp e = new Emp(1, "David", 4550.32);
        e.display();
    }
}

public class HerenciaSimple{
}
