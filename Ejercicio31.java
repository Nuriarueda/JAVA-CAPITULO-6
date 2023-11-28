/* Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
pierde. Si sale otro número, tiene que seguir tirando. */

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa jugaremos al Craps ");
        System.out.println("¿Cuanto dinero quieres apostar?");
        int dinero=sc.nextInt();
        System.out.print("La tirada de los datos es:");
        int dado1=0;
        int dado2=0;
        int suma;
        boolean seguir=true;
        dado1=(int)(Math.random()*6+1);
        dado2=(int)(Math.random()*6+1);
        suma=dado1+dado2;
        System.out.println(suma);
        int suma2=0;
        if(suma==7 || suma==11){
            System.out.print("Has duplicado tu apuesta, has conseguido: "+dinero*2);
        }else{
            if(suma==2 || suma==3 || suma==12){
                System.out.print("Has perdido todo el dinero");
            }else{
                System.out.println("Volvemos a tirar");
            
                while(seguir){
                    dado1=(int)(Math.random()*6+1);
                    dado2=(int)(Math.random()*6+1);
                    suma2=dado1+dado2;
                    if(suma2==suma){
                        System.out.println(suma2+" has ganado");
                        seguir=false;
                    }else{
                        if(suma2==7){
                            System.out.println(suma2+" has perdido todo");
                            seguir=false;
                        }else{
                            System.out.println(suma2);
                        }
                    }
                }
            }
        }



        sc.close();
    }
}
