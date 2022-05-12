package Ejemplos.semana1;

public class pruebaBicicleta {
    public static void main(String[] args) {
        def();
    }

    public static void def(){
        // Se crea un nuevo objeto bicicleta de nombre biciMountain
        bicicleta biciMountain = new bicicleta();
        // operador de indireccion: da acceso a todo lo que tiene el objeto
        biciMountain.setColor("Negra");
        biciMountain.setPins(6);
        biciMountain.setRodada(26);
        biciMountain.setVelocidad(13.2);
        String msg = "Soy una bici de montaña con estas características: \n";
        msg += "\nColor: " + biciMountain.getColor();
        msg += "\nVelocidad: " + biciMountain.getVelocidad();
        msg += "\nPines:" + biciMountain.getVelocidad();
        msg += "\nRodada: " + biciMountain.getRodada();

        // con print se debe indicar el salto de linea
        System.out.print(msg);

    }


}
