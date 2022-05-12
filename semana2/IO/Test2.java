package Ejemplos.semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\magia.txt");
            // escribir una cadena de texto
            String s = "Magia!";
            byte b[] = s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println(s);
        }catch (IOException ioe){
            ioe.fillInStackTrace();
        }
    }
}
