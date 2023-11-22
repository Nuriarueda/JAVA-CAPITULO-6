/* Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo. */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa haremos un cubo ");
        System.out.println("Diga la anchura, como minimo 2 ");
        int anchura = sc.nextInt();
        System.out.println("Diga la altura, como minimo 2 ");
        int altura=sc.nextInt();
        int x=(int)(Math.random()*(altura-2)+1);
        int y=(int)(Math.random()*(anchura-2)+1);
        for(int i=1;i<=anchura;i++){
            System.out.print("*");
        }
        System.out.println("");
        
        for(int i=1;i<=altura-2;i++){
            System.out.print("*");
            for(int j=1;j<anchura-1;j++){
                if(x==i && y==j){
                    System.out.print("&");
                }else{
                System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println("");
            
        }
        for(int i=1;i<=anchura;i++){
            System.out.print("*");
        }
        
        sc.close();    }
}
