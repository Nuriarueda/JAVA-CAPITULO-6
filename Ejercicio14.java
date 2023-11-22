/* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir. */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un numero y el programa tendra 5 oportunidades para hacerlo");
        int numero=sc.nextInt();
        int intento=0;
        int contador=0;
        do{
            if(contador>=1){
                System.out.println("¿El numero es mayor o menor que este?");
                String mas_menos=sc.next();
                switch(mas_menos){
                    case "menor":
                    intento= (int)(Math.random()*intento+1);
                    break;
                    case "mayor":
                    intento=(int)(Math.random()*(100-intento)+intento);
                }
            }else{
            intento= (int)(Math.random()*100+1);
            }
            if(numero==intento){
                break;
            }
            System.out.println(intento);
            contador++;
        }while(contador<5);
        sc.close();    
    }
}
