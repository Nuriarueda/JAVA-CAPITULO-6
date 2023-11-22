/* Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera */
public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Este programa te muestra una melodia");
        int partes = (int)(Math.random()*7+1);
        int primera=0;
        for(int j=1;j<=partes*4;j++){

            for(int i=1;i<=4;i++){
                int notas= (int)(Math.random()*7+1);
                if(i==1 && j==1){
                    primera=notas;
                }
                if(i==4 && j==partes*4){
                    switch(primera){
                        case 1:
                        System.out.print("do  ");
                        break;
                        case 2:
                        System.out.print("re  ");
                        break;
                        case 3:
                        System.out.print("mi  ");
                        break;
                        case 4:
                        System.out.print("fa  ");
                        break;
                        case 5:
                        System.out.print("sol  ");
                        break;
                        case 6:
                        System.out.print("la  ");
                        break;
                        case 7:
                        System.out.print("si  ");
                        break;
                }
            }else{
                switch(notas){
                    case 1:
                    System.out.print("do  ");
                    break;
                    case 2:
                    System.out.print("re  ");
                    break;
                    case 3:
                    System.out.print("mi  ");
                    break;
                    case 4:
                    System.out.print("fa  ");
                    break;
                    case 5:
                    System.out.print("sol  ");
                    break;
                    case 6:
                    System.out.print("la  ");
                    break;
                    case 7:
                    System.out.print("si  ");
                    break;
                }
            }
                
                
            }
            System.out.print("| ");
        }
        System.out.print("| ");
    }
}
