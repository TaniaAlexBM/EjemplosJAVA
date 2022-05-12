package Ejemplos.semana1.viernes;

/*
overload: sobrecarga
override: redefine
overwrite: sobreescribe
 */

public class Bike {
    private int velocidad;
    private String color, marca;

    // SOBRECARGA
    // diferentes casos donde puede funcionar
    public Bike(){  }
    public Bike(String color){  this.color = color;  }
    public Bike(String color, int velocidad){
        this.velocidad = velocidad;
        this.color = color;
    }
    public Bike(String color, int velocidad, String marca){
        this.velocidad = velocidad;
        this.marca = marca;
        this.color = color;
    }

    // getters
    public int getVelocidad(){  return velocidad;  }
    public String getColor(){ return color;  }
    public String getMarca(){  return marca;  }
}
