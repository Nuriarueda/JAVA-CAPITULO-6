/* Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto. */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Adivina un numero entre 0 y 100 tienes 5 oportunidades");
        int numero= (int)(Math.random()*101);
        boolean acierto=false;
        int i=0;
            do{
                int intento=sc.nextInt();
                if(intento==numero){
                    acierto=true;
                    System.out.print("Acertaste");
                }else{
                    if(intento<numero){
                        System.out.println("Fallaste, has puesto un numero menor");
                    }else{
                        System.out.println("Fallaste, has puesto un numero mayor");
                    }
                }
                i++;
                if(i>=5){
                    break;
                }
            }while(!acierto);
        
        sc.close();
    }
}
