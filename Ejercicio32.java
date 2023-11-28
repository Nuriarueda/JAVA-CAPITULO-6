/* Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
Por cada metro de sendero - representado por una línea - puede que haya un
obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
habrá más de un obstáculo por metro de sendero, habrá uno o ninguno. */

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa haremos un camino ");
        System.out.println("Diga la longitud");
        int longitud = sc.nextInt();
        int espacios=10;  //esta variable es para controlar los espacios a la izquierda
        int parte=0;  //esta variable es para hacer el random en cada parte del camino
        int posible_obstáculo=0;
        int obstáculo=0;
        int posición=0;
        System.out.println("");
        for(int i=1;i<=longitud;i++){
            parte=(int)(Math.random()*3);
            posible_obstáculo=(int)(Math.random()*2);
            if(posible_obstáculo==1){
                obstáculo=(int)(Math.random()*2+1);
                if(obstáculo==1){
                    posición=(int)(Math.random()*4+1);
                }else{
                    posición=(int)(Math.random()*4+1);
                }
            }
            switch (parte) {
                case 0:
                espacios--;
                for(int j=1;j<=espacios;j++){
                    System.out.print(" ");
                }
                System.out.print("|");
                for(int k=1;k<=4;k++){
                    
                        if(posible_obstáculo==1 && obstáculo==1 && posición==k){
                            System.out.print("*");
                        }else{
                            if(posición==k && obstáculo==2){
                                System.out.print("0");
                            }else{
                            System.out.print(" ");
                            }
                        }
                }
                System.out.println("|");
                break;

                case 1:
                for(int j=1;j<=espacios;j++){
                    System.out.print(" ");
                }
                System.out.print("|");
                for(int k=1;k<=4;k++){
                    
                        if(posible_obstáculo==1 && obstáculo==1 && posición==k){
                            System.out.print("*");
                        }else{
                            if(posición==k && obstáculo==2){
                                System.out.print("0");
                            }else{
                            System.out.print(" ");
                            }
                        }
                }
                System.out.println("|");
                break;

                case 2:
                espacios++;
                for(int j=1;j<=espacios;j++){
                    System.out.print(" ");
                }
                System.out.print("|");
                for(int k=1;k<=4;k++){
                    
                        if(posible_obstáculo==1 && obstáculo==1 && posición==k){
                            System.out.print("*");
                        }else{
                            if(posición==k && obstáculo==2){
                                System.out.print("0");
                            }else{
                            System.out.print(" ");
                            }
                        }
                }
                System.out.println("|");
                break;
            }
        }
        sc.close();
    }
}
