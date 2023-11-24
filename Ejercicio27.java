/* Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error. */

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Turno del jugador (introduzca piedra, papel o tijera): ");
        String eleccion=sc.next();
        if(eleccion.equals("papel") || eleccion.equals("tijera") || eleccion.equals("piedra")){
            System.out.println("Turno del ordenador: ");
            int eleccion_maquina=(int)(Math.random()*3);
            String eleccion_Maquina="";
            switch(eleccion_maquina){
                case 0:
                    eleccion_Maquina="piedra";
                    break;
                
                case 1:
                    eleccion_Maquina="papel";
                    break;

                case 2:
                    eleccion_Maquina="tijera";
                    break;
            }
            System.out.println(eleccion_Maquina);

            if(eleccion_Maquina.equals(eleccion)){
                System.out.print("Empate");
            }
            if(eleccion.equals("piedra")){
                if(eleccion_Maquina.equals("papel")){
                System.out.print("Gana el ordenador");
                }
                if(eleccion_Maquina.equals("tijera")){
                    System.out.print("Gana el jugador");
                }
            }
            
            if(eleccion.equals("papel")){
                if(eleccion_Maquina.equals("piedra")){
                System.out.print("Gana el jugador");
                }
                if(eleccion_Maquina.equals("tijera")){
                    System.out.print("Gana el ordenador");
                }
            }
            if(eleccion.equals("tijera")){
                if(eleccion_Maquina.equals("papel")){
                    System.out.print("Gana el jugador");
                }
                if(eleccion_Maquina.equals("piedra")){
                    System.out.print("Gana el ordenador");
                }
            }
        }
        else{
            System.out.print("ERROR");
        }
        sc.close();
    }
}
