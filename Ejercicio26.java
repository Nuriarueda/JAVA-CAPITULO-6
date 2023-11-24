/* Realiza un programa que pinte una tableta de turrón con un bocado realizado de
forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
da alrededor del turrón, obviamente no se puede dar un bocado por en medio
de la tableta. */

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga la anchura, como minimo 2 ");
        int anchura = sc.nextInt();
        System.out.println("Diga la altura, como minimo 2 ");
        int altura = sc.nextInt();
        int lado=(int)(Math.random()*4);
        int posicionx=0;
        int posiciony=0;

        switch(lado){
            case 0:
                posicionx=(int)(Math.random()*anchura+1);
                for(int i=1;i<=altura;i++){
                    for(int j=1;j<=anchura;j++){
                        if(i==1 && j==posicionx){
                            System.out.print(" ");
                        }else{
                        System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;

            case 1:
                posiciony=(int)(Math.random()*altura+1);
                for(int i=1;i<=altura;i++){
                    for(int j=1;j<=altura;j++){
                        if(j==altura && i==posiciony){
                            System.out.print(" ");
                        }else{
                        System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;

            case 2:
                posicionx=(int)(Math.random()*anchura+1);
                for(int i=1;i<=altura;i++){
                    for(int j=1;j<=anchura;j++){
                        if(i==altura && j==posicionx){
                            System.out.print(" ");
                        }else{
                        System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;

            case 3:
                posiciony=(int)(Math.random()*altura+1);
                for(int i=1;i<=altura;i++){
                    for(int j=1;j<=altura;j++){
                        if(j==1 && i==posiciony){
                            System.out.print(" ");
                        }else{
                        System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;

        }

        sc.close();
    }
}
