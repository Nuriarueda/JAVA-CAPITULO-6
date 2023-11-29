/* 8 */

import java.util.Scanner;

public class Parte3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("-A-L-E-A-T-O-R-I-U-M");
        System.out.println("Aleatorium pensará un número entre los valores que tu decidas");
        System.out.print("Introduzca el mínimo valor del intervalo: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el máximo valor del intervalo: ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println("-A-L-E-A-T-O-R-I-U-M");
    
        int intervalomin;
        int intervalomax ;
    
        if(num2>=num1){
    
            
            do{
                intervalomax =(int)(Math.random()*(num2-num1+1)+num1);
                intervalomin=(int)(Math.random()*(num2-num1+1)+num1);
            }while(intervalomax <=intervalomin);

            System.out.println("Estoy pensando un numero entre " + intervalomin + " y " + intervalomax );   

            int intentos = (int)(Math.log(intervalomax-intervalomin+1) / Math.log(2));

            System.out.println("Tienes "+intentos+" intentos");

            int numCorrecto=(int)(Math.random()*(intervalomax-intervalomin+1)+intervalomin);

            int numIntroducido;
            boolean salir = true;
            int numIntentos = 0;

            do {
                System.out.print("Escribe el numero: ");
                numIntroducido=sc.nextInt();

                numIntentos++;

                if (numIntentos < intentos) {
                        
                    if(numIntroducido>numCorrecto){
                        System.out.println("Te has pasado");
                    }else{

                        if (numIntroducido<numCorrecto) {
                            System.out.println("Te has quedado corto");
                        } else {
                            System.out.println("Enhorabuena!!!! has acertado.");
                            System.out.println("Efectivamente el número era: "+ numCorrecto);
                            salir=false;
                        }
                    }
                } else {
                    salir=false;
                    System.out.println("Has superado el número de intentos.");
                    System.out.println("El numero que habia pensado era: "+ numCorrecto);
                }
            } while (salir);
        }
        sc.close();
    }
}
