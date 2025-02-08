
package com.ejercicios.poo.tarea_1;

public class Hilo extends Thread {
    
    public String nombre;
    public int numero;

    public Hilo(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    
    @Override
    public void run() {
        for (int i=this.numero;i>=0;i--) {
            System.out.println("Cuenta regresiva: "+this.numero+" ");
            this.numero--;
            try {
                Hilo.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("Error en la ejecucion del hilo de trabajo "+ ex);
            }
        }
        System.out.println("Trabajo del hilo "+"'"+this.nombre+"'"+" terminado");
    }
    
    
    
    
    
}
