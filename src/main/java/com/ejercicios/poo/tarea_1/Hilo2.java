
package com.ejercicios.poo.tarea_1;

public class Hilo2  extends Thread {
    
    public String nombre;
    public char letraFin;

    public Hilo2(String nombre, char letraFin) {
        this.nombre = nombre;
        this.letraFin = letraFin;
    }
    
    @Override
    public void run() {
        for (char letra='A';letra<=this.letraFin;letra++) {
            System.out.println("Abecedario: "+letra+" ");
            try {
                Thread.sleep(600);
            } catch (InterruptedException ex) {
                System.out.println("Error en la ejecucion del hilo de trabajo" +ex);
            }
        }
        System.out.println("Trabajo del hilo "+"'"+this.nombre+"'"+" terminado");
    }
    

    
    
    
    
}
