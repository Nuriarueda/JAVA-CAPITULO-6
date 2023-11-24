/* Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos. */

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga un numero");
        long numero = sc.nextLong();
        long volteado=0;
        int longitud=0;
        
        while(numero>0){
            volteado=(volteado*10)+numero%10;
            numero/=10;
            longitud++;
        }
        
        int posicion=(int)(Math.random()*longitud+1);
        int digito=0;

        for(int i=1;i<=posicion;i++){
            if(i==posicion){
                digito= (int)volteado%10;
            }
            volteado/=10;
        }
        System.out.print(digito);
        sc.close();
    }
}
