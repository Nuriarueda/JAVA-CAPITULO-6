/* Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]). */
public class Ejercicio25 {
    public static void main(String[] args) {
        System.out.println("Mostraremos 100 numeros  ");
        int numero=0;
        boolean primo=true;
        for(int i=1;i<=100;i++){
            numero=(int)(Math.random()*191+10);
            primo=true;
            if(numero%5==0){
                System.out.print(" ["+numero+"] ");
            }
            for(int j=2;j<=numero/2;j++){
                if(numero%j==0){
                    primo=false;
                }
            }
            if(primo){
                System.out.print(" #"+numero+"# ");
            }
            if(numero%5!=0 && !primo){
            System.out.print(" "+numero+" ");
            }
        }
    }
}
