/* El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera
con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
una cuestión de física elemental, ninguno de los animales puede coincidir
en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
que como mínimo serán de 4 unidades. */

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa haremos una pecera ");
        System.out.println("Diga la anchura, como minimo 5 ");
        int anchura = sc.nextInt();
        System.out.println("Diga la altura, como minimo 5 ");
        int altura=sc.nextInt();
        boolean repetir=true;
            int x_pez=0;
            int y_pez=0;
            int x_caballito=0;
            int y_caballito=0;
            int x_caracola=0;
            int y_caracola=0;
        do{
            x_pez=(int)(Math.random()*(altura-2)+1);
            y_pez=(int)(Math.random()*(anchura-2)+1);
            x_caballito=(int)(Math.random()*(altura-2)+1);
            y_caballito=(int)(Math.random()*(anchura-2)+1);
            x_caracola=(int)(Math.random()*(altura-2)+1);
            y_caracola=(int)(Math.random()*(anchura-2)+1);
            if(x_caballito!=x_caracola && x_pez!=x_caballito && x_pez!=x_caracola){
                repetir=false;
            }
        }while(repetir);
        for(int i=1;i<=anchura;i++){
            System.out.print("*");
        }
        System.out.println("");
        
        for(int i=1;i<=altura-2;i++){
            System.out.print("*");
            for(int j=1;j<anchura-1;j++){

                if(x_pez==i && y_pez==j){

                    System.out.print("&");

                }else{

                    if(x_caballito==i && y_caballito==j){
                        System.out.print("$");
                    }else{
                        
                        if(x_caracola==i && y_caracola==j){
                            System.out.print("@");
                            }else{
                                System.out.print(" ");
                            }
                    }
                }
            }
            System.out.print("*");
            System.out.println("");
            
        }
        for(int i=1;i<=anchura;i++){
            System.out.print("*");
        }
        
        sc.close();
    }
}
