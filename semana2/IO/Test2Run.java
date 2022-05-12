package Ejemplos.semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2Run {
    public static void main(String[] args) {
        Runnable rm = new Runnable() {
            @Override
            public void run() {
                try {
                    FileOutputStream fos = new FileOutputStream("C:\\magia.txt");
                    // escribir una cadena de texto
                    String s = "Magia con runnable!";
                    byte b[] = s.getBytes();
                    fos.write(b);
                    fos.close();
                    System.out.println(s);
                }catch (IOException ioe){
                    ioe.fillInStackTrace();
                }
            }
        };
        Thread magic = new Thread(rm);
        magic.start();
    }
}
