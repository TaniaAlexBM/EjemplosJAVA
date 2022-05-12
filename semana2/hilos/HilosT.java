package Ejemplos.semana2.hilos;

public class HilosT extends Thread{

    @Override // Runnable
    public void run() { // aqui se define que hara el hilo
        System.out.println("El hilo se está ejecutando");
    }

    /*
    public void start(){
        // Inicia la ejecucion del hilo
        // la JVM llama al metodo run() del hilo
    }

    sleep() - detiene de manera temporal el numero esperado
    join() - espera a que el hilo se muera
    getPriority() - regresa la prioridad del hilo
    setPriority() - establece la prioridad del hilo
    getName - nombre del hilo
    currentThread - la referencia la hilo que se esta ejecutando
    getId - regresa el ID del hilo
    thread.State getState - regresa el estado actual
    isAlive - si está vivo
     */

    public static void main(String[] args) {
        HilosT hilo = new HilosT(); // entra al state new
        hilo.start(); // inicia la ejecucion del hilo, llama al metodo run()
    }
}

class HilosR implements Runnable {
    @Override
    public void run() {
        System.out.println("El hilo de runnable esta " + "corriendo");
    }

    public static void main(String[] args) {
        HilosR h = new HilosR(); // crea un hilo
        Thread t = new Thread(h);
        t.start();
    }
}
