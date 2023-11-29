/* 4 */
import java.util.Scanner;

public class Parte1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner  (System.in);

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
    }
    sc.close();
  }
}

  