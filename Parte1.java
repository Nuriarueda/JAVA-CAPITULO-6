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

    int numMin;
    int numMax;

    if(num2>=num1){

      do{
        numMax=(int)(Math.random()*(num2-num1+1)+num1);
        numMin=(int)(Math.random()*(num2-num1+1)+num1);
      }while(numMax<=numMin);

      System.out.println("Estoy pensando un numero entre " + numMin + " y " + numMax);
    }
    sc.close();
  }
}

  