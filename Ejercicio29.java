/* Realiza un programa que muestre la previsión del tiempo para mañana en
Málaga. Las temperaturas máxima y mínima se deben generar de forma
aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
últimas décadas para cada estación. La probabilidad de que esté soleado
o nublado en cada estación se proporciona a continuación. Obviamente, la
temperatura mínima deberá ser menor o igual que la temperatura máxima. */

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa haremos la prediccion del tiempo");
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.println("Seleccione la estacion del año(1-4):");
        int estacion = sc.nextInt();
        int maxima;
        int minima;
        int nublado;
        switch(estacion){

            case 1:
            
                boolean repetir=true;//esto es para repetir los aleatorios si la temperatura minima es mayor a la maxima
                do{
                    minima=(int)(Math.random()*16+15);//se multiplica por la resta entre la maxima y la minima mas uno
                    //Ej:30-15=15+1=16 y  luego se le suman 15 para quitar el cero y llegar a la temperatura maxima
                    maxima=(int)(Math.random()*16+15);
                    nublado=(int)(Math.random()*11);
                        if(maxima>=minima){

                            repetir=false;
                            System.out.println("Prevision del tiempo mañana:");
                            System.out.print("Temperatura minima:");
                            System.out.print(minima);
                            System.out.println("ºC");
                            System.out.print("Temperatura maxima:");
                            System.out.print(maxima);
                            System.out.println("ºC");

                            switch(nublado){
                                case 1:

                                case 2:
                                
                                case 3:

                                case 4:

                                case 5:

                                case 6:
                                    System.out.print("Soleado");
                                    break;

                                case 7:

                                case 8:

                                case 9:

                                case 10:
                                    System.out.print("Nublado");
                                    break;

                            }

                        }else{
                            repetir=true;
                        }
                }while(repetir);

                break;
            
            case 2:
            
                boolean repetir2=true;
                do{
                    minima=(int)(Math.random()*21+25);
                    maxima=(int)(Math.random()*21+25);
                    nublado=(int)(Math.random()*11);
                        if(maxima>=minima){
    
                            repetir2=false;
                            System.out.println("Prevision del tiempo mañana:");
                            System.out.print("Temperatura minima:");
                            System.out.print(minima);
                            System.out.println("ºC");
                            System.out.print("Temperatura maxima:");
                            System.out.print(maxima);
                            System.out.println("ºC");
    
                            switch(nublado){
                                case 1:
    
                                case 2:
                                
                                case 3:
    
                                case 4:
    
                                case 5:
    
                                case 6:
    
                                case 7:
    
                                case 8:
                                    System.out.print("Soleado");
                                    break;
    
                                case 9:
    
                                case 10:
                                    System.out.print("Nublado");
                                    break;
    
                            }
    
                        }else{
                            repetir2=true;
                        }
                }while(repetir2);

                break;

            case 3:
            
                boolean repetir3=true;
                do{
                    minima=(int)(Math.random()*11+20);
                    maxima=(int)(Math.random()*11+20);
                    nublado=(int)(Math.random()*11);
                        if(maxima>=minima){
    
                            repetir3=false;
                            System.out.println("Prevision del tiempo mañana:");
                            System.out.print("Temperatura minima:");
                            System.out.print(minima);
                            System.out.println("ºC");
                            System.out.print("Temperatura maxima:");
                            System.out.print(maxima);
                            System.out.println("ºC");
    
                            switch(nublado){
                                case 1:
    
                                case 2:
                                
                                case 3:
    
                                case 4:
                                    System.out.print("Soleado");
                                    break;
    
                                case 5:
    
                                case 6:
                                
                                case 7:
    
                                case 8:
    
                                case 9:
    
                                case 10:
                                    System.out.print("Nublado");
                                    break;
    
                            }
    
                        }else{
                            repetir3=true;
                        }
                }while(repetir3);

                break;

            case 4:
            
                boolean repetir4=true;
                do{
                    minima=(int)(Math.random()*26);
                    maxima=(int)(Math.random()*26);
                    nublado=(int)(Math.random()*11);
                        if(maxima>=minima){
    
                            repetir4=false;
                            System.out.println("Prevision del tiempo mañana:");
                            System.out.print("Temperatura minima:");
                            System.out.print(minima);
                            System.out.println("ºC");
                            System.out.print("Temperatura maxima:");
                            System.out.print(maxima);
                            System.out.println("ºC");
    
                            switch(nublado){
                                case 1:
    
                                case 2:
                                    System.out.print("Soleado");
                                    break;
                                
                                case 3:
    
                                case 4:

                                case 5:

                                case 6:

                                case 7:
    
                                case 8:

                                case 9:
    
                                case 10:
                                    System.out.print("Nublado");
                                    break;
    
                            }
    
                        }else{
                            repetir4=true;
                        }
                }while(repetir4);

                break;

        }
        
        sc.close();
    }
}
