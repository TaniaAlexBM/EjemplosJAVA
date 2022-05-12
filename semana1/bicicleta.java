package Ejemplos.semana1;

public class bicicleta {
    // contructor, no es un metodo porque no se puede llamar
    // inicializa el objeto para reservar en la RAM el espacio para sus atributos
    bicicleta(){

    }
    // POJO - clase pura
    // Caracteristicas - Campos - propiedades del objeto
    public int pins, rodada;
    public double velocidad;
    public String color;

    // Métodos
    public double getVelocidad(){  return velocidad;  }
    public int getPins(){  return pins;  }
    public int getRodada(){  return rodada;  }
    public String getColor(){  return color;  }

    // los campos y los métodos son obligatorios

    public boolean setPins(int pins){
        if(pins > 0){
            this.pins = pins;
            return true;
        } else
            return false;
    }
    public boolean setRodada(int rodada){
        if(rodada > 0){
            this.rodada = rodada;
            return true;
        } else
            return false;
    }
    public boolean setVelocidad(double velocidad){
        if(velocidad >= 0){
            this.velocidad = velocidad;
            return true;
        } else
            return false;
    }
    public boolean setColor(String color){
        if(!color.isEmpty()){ // !: diferente de o está vacío
            this.color = color;
            return true;
        } else
            return false;
    }

    public String printState(){
        return "pins: " + pins +
                "\nrodada: " + rodada +
                "\nvelocidad: " + velocidad +
                "\ncolor: " + color;
    }
}
