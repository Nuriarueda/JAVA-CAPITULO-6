/* Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados. */
public class Ejercicio19 {
    public static void main(String[] args) {
        System.out.println("50 números aleatorios entre -100 y 200:");
        int numero;
        int total=0;
        int max_par=-102;
        int min_impar=201;
            for (int i = 1; i <= 50; i++) {
                numero=(int)(Math.random()*301-100);
                System.out.print(numero+" ");
                total=total+numero;
                if(numero%2==0){
                    if(numero>max_par){
                        max_par=numero;
                    }
                }
                if(numero%2!=0){
                    if(numero<min_impar){
                        min_impar=numero;
                    }
                }
            }
            System.out.println("");
            System.out.println("El mayor de los pares es:"+max_par);
            System.out.println("El menor de los impares es:"+min_impar);
            System.out.println("La media de todos es:"+total/50);    
    }
}
