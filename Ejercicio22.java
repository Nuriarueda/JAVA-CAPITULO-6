/* Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
aleatorio. La cabeza se representará con el carácter @ y se debe colocar
exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre tres posibles que hará que el siguiente carácter se
coloque una posición a la izquierda del anterior, alineado con el anterior o una
posición a la derecha del anterior. La longitud de la serpiente se pedirá por
teclado y se supone que el usuario introducirá un dato correcto. */

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Diga la longitud");
        int longitud = sc.nextInt();
        int espacios=13;  //esta variable es para controlar los espacios a la izquierda
        int parte=0;  //esta variable es para hacer el random en cada parte de la serpiente
        System.out.println("");
        System.out.println("             ^");
        for(int i=1;i<longitud;i++){
            parte=(int)(Math.random()*3);
            switch (parte) {
                case 0:
                espacios--;
                for(int j=1;j<=espacios;j++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                break;

                case 1:
                for(int j=1;j<=espacios;j++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                break;

                case 2:
                espacios++;
                for(int j=1;j<=espacios;j++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                break;
            }
        }
        sc.close();
    }
}
