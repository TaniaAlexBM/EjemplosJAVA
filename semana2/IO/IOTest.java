package Ejemplos.semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                try {
                    // crea un archivo llamado HOLA.TXT en el disco C
                    FileOutputStream fos = new FileOutputStream("C:\\holaRunnable.txt");
                    // escribe en el archivo creado A por su valor ASCII
                    fos.write(65);
                    // Cierra el archivo
                    fos.close();
                }catch (IOException ioe){
                    ioe.fillInStackTrace();
                }
            }
        };
        Thread writeFile = new Thread(t1);
        writeFile.start();
    }

    /*
    try {
            // crea un archivo llamado HOLA.TXT en el disco C
            FileOutputStream fos = new FileOutputStream("C:\\hola.txt");
            // escribe en el archivo creado A por su valor ASCII
            fos.write(65);
            // Cierra el archivo
            fos.close();
        }catch (IOException ioe){
            ioe.fillInStackTrace();
        }
     */
}
