package Ejemplos.semana1.viernes;

public class Emp extends Persona {
    double salario;

    Emp(int id, String nombre, double salario) {
        super(id, nombre);
        this.salario = salario;
    }

    void display() {
        System.out.println(id + ' ' + nombre + ' ' + salario);
    }
}
