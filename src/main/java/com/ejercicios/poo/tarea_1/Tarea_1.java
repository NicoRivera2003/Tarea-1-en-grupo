/*
Integrantes:
Julian Zapata Rojas
Brian Steven Cardona Arenas
Andres Calle Usma
Nicolás Acevedo Rivera

Enlace de gitHub: https://github.com/NicoRivera2003/Tarea-1-en-grupo

Trabajo de programación de la unidad #1.

Requisitos de la aplicación:

- Desarrollar en el lenguaje de Java, una aplicación que ejecute dos hilos de programa al mismo tiempo.
- El primer hilo: realizar un conteo regresivo temporalizado partiendo de un número establecido por el usuario.
- La temporalización entre cada ejecución del hilo debe ser de 500 ms,
- El segundo hilo: mostrar las letras del alfabeto partiendo desde la A hasta una letra ingresada por el usuario,
este hilo debe estar temporalizado a 600 ms.
- Al ejecutar el programa por consola se debe evidenciar la salida entregada por ambos hilos,
al final de su ejecución cada hilo debe mostrar el mensaje “Trabajo del hilo [nombre] terminado”.
- Presentación de Resultados: el programa deberá mostrar los resultados en pantalla de manera clara y organizada.
- Validación de entrada de datos: Validar que los datos ingresados por el usuario sean válidos.
*/

package com.ejercicios.poo.tarea_1;

import java.util.Scanner;

public class Tarea_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero para iniciar la cuenta regresiva (solo numeros positivos): ");
        int numero = entrada.nextInt();
        
        System.out.print("Ingrese la letra hasta la cual desea mostrar el alfabeto: ");
        char letraFin = entrada.next().toUpperCase().charAt(0);
        System.out.println(" ");
        
        if (letraFin < 'A' || letraFin > 'Z') {
            System.out.println("Letra invalida, debe estar entre la A-Z");
        }
        
        Hilo hilo1 = new Hilo("CUENTA REGRESIVA", numero);
        Hilo2 hilo2 = new Hilo2("ALFABETO", letraFin);
        
        hilo1.start();
        hilo2.start();
        
    }
}
